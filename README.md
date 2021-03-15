# WxdJaveWE
SpringBoot+SpringMvc+Mybatis+通用mapper实现用户的增删改查

JTraveler 2019-11-21 15:24:34   1050   收藏 9
分类专栏： SpringBoot 文章标签： SpringBoot
版权
SpringBoot+SpringMvc+Mybatis+通用mapper实现用户的增删改查
创建用户表
新增用户数据
Navicat显示结果
在IDEA中创建SpringBoot项目
在pom.xml中引入jar包坐标
application.yaml介绍及配置
创建用户实体类
创建UserMapper
创建UserService接口
创建UserService实现类
创建Controller
修改SpringBoot项目启动类
在浏览器中测试user-service项目中的用户相关接口
测试查询全部用户接口
测试根据用户id查询用户的接口
测试添加用户的接口
查询数据库得知添加成功
测试修改用户信息的接口
查看数据库得知修改成功
修改之前的用户信息
修改之后的用户信息
测试删除用户的接口
查看数据库得知删除成功
删除之前的用户信息
删除之后的用户信息
创建用户表
CREATE TABLE users(
uid int(10) PRIMARY KEY AUTO_INCREMENT COMMENT '用户id',
uname VARCHAR(255) COMMENT '用户姓名',
pwd VARCHAR(255) COMMENT '用户密码',
sex int(1) COMMENT '用户性别，1：男，0：女',
age int(3) COMMENT '用户年龄'
);

新增用户数据
INSERT INTO users VALUES(1,"张三","zs",1,21);
INSERT INTO users VALUES(2,"李四","ls",0,18);
INSERT INTO users VALUES(3,"王五","ww",0,20);
INSERT INTO users VALUES(4,"赵六","zl",1,26);
INSERT INTO users VALUES(5,"十七","sq",0,22);
INSERT INTO users VALUES(6,"阿什","as",1,25);

Navicat显示结果


在IDEA中创建SpringBoot项目


在pom.xml中引入jar包坐标
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>2.1.9.RELEASE</version>
<relativePath/>
</parent>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>
    <!--springmvc的启动器-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--mybatis框架的启动器-->
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>2.1.1</version>
    </dependency>
    <!--SpringBoot热部署的jar包-->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <!--mysql驱动的jar包-->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <!--简化javabean代码的插件-->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <!--通用mapper启动器-->
    <dependency>
        <groupId>tk.mybatis</groupId>
        <artifactId>mapper-spring-boot-starter</artifactId>
        <version>2.1.5</version>
    </dependency>
</dependencies>

application.yaml介绍及配置
application.yaml是SpringBoot项目的配置文件，在其中配置的内容会覆盖启动器中的默认配置。
1
#端口号
server:
port: 8888
#数据源配置
spring:
datasource:
url: jdbc:mysql://localhost:3306/test?serverTimezone=GMT
username: root
password: root
#mybatis配置
mybatis:
#mapper.xml所在位置
#  mapper-locations: classpath:mapper/*Mapper.xml
#别名配置
#  type-aliases-package: cn.xxxq.user_service.pojo

创建用户实体类
Lombok中的注解
@Getter：生成get方法的注解
@Setter：生成set方法的注解
@ToString：生成toString方法的注解
package cn.xxxq.user_service.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
private Integer uid;
private String uname;
private String pwd;
private Integer sex;
private Integer age;
}
创建UserMapper
在通用Mapper中，已经帮我们解决了单表的增删改查操作。所以我们只需要让UserMapper
继承tk.mybatis.mapper.common.Mapper接口即可，一般单表的增删改查就不用写SQL语句了。
1
2
package cn.xxxq.user_service.mapper;

import cn.xxxq.user_service.pojo.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {

创建UserService接口
package cn.xxxq.user_service.service;

import cn.xxxq.user_service.pojo.User;
import java.util.List;

public interface UserService {

    /*查询所有用户*/
    List<User> queryAllUser();

    /*根据用户id查询用户*/
    User queryUserByUid(Integer uid);

    /*根据用户id修改用户信息*/
    void updateUserByUid(User user);

    /*添加用户*/
    void addUser(User user);

    /*根据用户id删除用户*/
    void deleteUserByUids(Integer[] uids);

}
创建UserService实现类
@service：创建实现类对象并将之添加到Spring Bean容器中。
@Transactional：开启声明式事务注解，为该类添加事务支持。
@@Autowired：注入Spring Bean容器中指定的对象。

package cn.xxxq.user_service.service;

import cn.xxxq.user_service.mapper.UserMapper;
import cn.xxxq.user_service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public User queryUserByUid(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public void updateUserByUid(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    /*根据用户id删除用户*/
    @Override
    public void deleteUserByUids(Integer[] uids) {
        /*Stream流+方法引用+lambda表达式简化删除代码*/
        Stream.of(uids).forEach(userMapper::deleteByPrimaryKey);
    }
}
创建Controller
package cn.xxxq.user_service.controller;

import cn.xxxq.user_service.pojo.User;
import cn.xxxq.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*查询所有用户*/
    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }

    /*根据用户id查询用户*/
    @RequestMapping("/queryUserByUid/{uid}")
    public User queryUserByUid(@PathVariable("uid") Integer uid) {
        return userService.queryUserByUid(uid);
    }

/*根据用户id修改用户信息*/
@RequestMapping("/updateUserByUid")
public void updateUserByUid(User user) {
userService.updateUserByUid(user);
}

    /*添加用户*/
    @RequestMapping("/addUser")
    public void addUser(User user) {
        userService.addUser(user);
    }

    /*根据用户id删除用户*/
    @RequestMapping("/deleteUserByUids")
    public void deleteUserByUids(Integer[] uids) {
        userService.deleteUserByUids(uids);
    }
}

修改SpringBoot项目启动类
@MapperScan(basePackages = "cn.xxxq.user_service.mapper")：扫描Mapper接口所在包
1
package cn.xxxq.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.xxxq.user_service.mapper")
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
在浏览器中测试user-service项目中的用户相关接口
测试查询全部用户接口


测试根据用户id查询用户的接口


测试添加用户的接口


查询数据库得知添加成功


测试修改用户信息的接口


查看数据库得知修改成功
修改之前的用户信息


修改之后的用户信息


测试删除用户的接口


查看数据库得知删除成功
删除之前的用户信息


删除之后的用户信息