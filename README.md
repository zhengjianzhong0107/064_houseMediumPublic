### 作者QQ：1556708905(支持修改、 部署调试、 支持代做毕设)

#### 支持代做任何毕设论、接网站建设、小程序、H5、APP、各种系统等

**毕业设计所有选题地址 [https://github.com/zhengjianzhong0107/allProject](https://github.com/zhengjianzhong0107/allProject)**

**博客地址：
[https://blog.csdn.net/2303_76227485/article/details/131557964](https://blog.csdn.net/2303_76227485/article/details/131557964)**

**视频演示：
[https://www.bilibili.com/video/BV19X4y1n7mQ/](https://www.bilibili.com/video/BV19X4y1n7mQ/)**

 

## 基于Springboot+Vue的房屋中介系统(源代码+数据库+14000字论文)064

## 一、系统介绍

本项目前后端分离

本系统分为管理员、用户、中介经纪人三种角色

用户角色包含以下功能：

- 登录、注册、个人信息修改、密码修改、房屋查看、经纪人联系

中介经纪人角色包含以下功能：

- 登录、个人信息修改、密码修改、房屋管理、房屋评论、查看留言

管理员角色包含以下功能：

- 登录、首页统计、房屋管理、评论管理、用户管理、角色管理、菜单管理、部门管理、个人中心、密码修改

## 二、所用技术

后端技术栈：

- springboot
- mysql
- jwt
- mybatisPlus
- SpringSecurity

前端技术栈：

- Vue
- Axios
- ElementUI

## 三、环境介绍

基础环境 :IDEA/eclipse, JDK1.8, Mysql5.7及以上, Maven3.6, node14, Redis5

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图

![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)
![contents](./picture/picture19.png)
![contents](./picture/picture20.png)
![contents](./picture/picture21.png)
![contents](./picture/picture22.png)
![contents](./picture/picture23.png)

## 五、浏览地址

前台访问地址：http://localhost:80
-用户账号/密码：客户A/123456

-经纪人账号/密码：经纪人A/123456   经纪人B/123456

-管理员账号/密码：admin/admin123

## 六、部署教程

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并执行项目的sql文件；

2. 使用IDEA/Eclipse导入huc-vue-service项目，若为maven项目请选择maven，等待依赖下载完成；

3. huc-admin目录中修改application.yml中的redis地址和application-dev.yml中的mysql地址

4. 启动主类huc-vue-service/huc-admin/src/main/java/com/huc/HucApplication.java

5. vscode或idea打开huc-vue-web项目

6. 在编译器中打开terminal，执行npm install 依赖下载完成后执行 npm run dev,执行成功后会显示访问地址

 
