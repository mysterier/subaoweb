<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search"></li>
			<li>
				<a href="${siteAdminUrl}/dashboard/"><i class="fa fa-dashboard fa-fw"></i>Dashboard</a>
			</li>
			<li <c:if test="menuId==1">class="active"</c:if> >
				<a href="#"><i class="fa fa-fw fa-font"></i>博客管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="${siteAdminUrl}/post/" <c:if test="subMenuId==102">class="active"</c:if> >博客文章</a></li>
					<li><a href="${siteAdminUrl}/comment/" <c:if test="subMenuId==103">class="active"</c:if> >博客回复</a></li>
					<li><a href="${siteAdminUrl}/viewlog/" <c:if test="subMenuId==104">class="active"</c:if> >访问日志</ul>
					<li><a href="${siteAdminUrl}/category/" <c:if test="subMenuId==101">class="active"</c:if> >博客分类</a></li>
			</li>
			<li <c:if test="menuId==2">class="active"</c:if> >
				<a href="#"><i class="fa fa-fw fa-camera"></i>相册管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="${siteAdminUrl}/album/" <c:if test="subMenuId==201">class="active"</c:if> >相册</a></li>
					<li><a href="${siteAdminUrl}/photo/" <c:if test="subMenuId==201">class="active"</c:if> >照片</a></li>
				</ul>
			<li><a href="${siteAdminUrl}/user/"><i class="fa fa-fw fa-user"></i>后台用户</a></li>
		</ul>
	</div>
</div>