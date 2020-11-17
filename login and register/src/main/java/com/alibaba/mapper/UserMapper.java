package com.alibaba.mapper;

import com.alibaba.bean.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * mapper的具体表达式
 */
@Mapper //标记mapper文件位置，否则在Application.class启动类上配置mapper包扫描
@Repository
public interface UserMapper {

    /**
     * 查询用户名是否存在，若存在，不允许注册
     * 注解@Param(value) 若value与可变参数相同，注解可省略
     * 注解@Results  列名和字段名相同，注解可省略
     * @param tnum
     * @return
     */
    @Select(value = "select u.tnum,u.tpswd from teacher u where u.tnum=#{username}")
    @Results
            ({@Result(property = "tnum",column = "tnum"),
              @Result(property = "tpswd",column = "tpswd")})
    Teacher findUserByName(@Param("tnum") String tnum);

    /**
     * 注册  插入一条Teacher记录
     * @param Teacher
     * @return
     */
    @Insert("insert into teacher values(#{tid},#{tnum},#{tpswd},#{tname},#{temail},#{tphone})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "tid",keyColumn = "tid")
    void regist(Teacher user);

    /**
     * 登录
     * @param Teacher
     * @return
     */
    @Select("select u.tid from Teacher u where u.tnum = #{tnum} and u.tpswd = #{tpswd}")
    String login(Teacher user);
}
