<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
   
<html lang="zh-CN">
<head>
	<spring:url value="/resources/css/login.css" var="loginCss"/>
    <link href="${loginCss}" rel="stylesheet"/>
</head>
<body>
	<div class="login">
	<div class="menus">
    	<div class="public"><a href="#" target="_blank">使用帮助</a><a href="#" target="_blank">联系开发者</a></div>
    </div>
    <div class="box png">
        <form action="j_spring_security_check" method="post">
        	<div class="header" ></div>
        <ul>
            <li><label for="j_username">用户名</label><input id="j_username" name="j_username" type="text" class="text"/></li>
            <li><label for="j_password">密　码</label><input id="j_password" name="j_password" type="password" class="text"/></li> 
            <li class="submits"><input class="submit" type="submit" value="登录" /></li>
        </ul>
		<br>
		 <div class="copyright">
        <a href="http://www.cqu.edu.cn" target="_blank" >重庆大学主页</a>
        <a>|</a>
        <a href="http://i.cqu.edu.cn" target="_blank">师生服务门户</a>
        <a>|</a>
        <a href="http://news.cqu.edu.cn" target="_blank">新闻网</a>
        <a>|</a>
        <a href="http://lib.cqu.edu.cn" target="_blank">数字图书馆</a>
        <a>|</a>
        <a href="http://net.cqu.edu.cn" target="_blank">信网中心主页</a>
      </div>
	  <br><br>
      <div style="bottom:-90px; text-align:center;position:absolute; left:0; width:100%;">
        版权所有 Copyright © 2013 重庆大学
      </div>
        
        </form>
    </div>
  
    <div class="lfooter"></div>
</div>
</body>
</html>