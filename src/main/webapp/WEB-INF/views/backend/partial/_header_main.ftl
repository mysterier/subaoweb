<#import "../../spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${backendPageTitle}</title>
    <link href="${url}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${backendUrl}/css/style.css" rel="stylesheet">
</head>
<body>
<#include "_nav_top.ftl">
<div class="container-fluid">
	<div class="row">
		<div class="col-lg-3 col-lg-2 sidebar">
			<ul class="nav nav-sidebar">
				<li><a href="${backendUrl}/adminuser/" <#if subMenuId==100 >class="active"</#if>>管理员</a></li>
				<li><a href="${backendUrl}/client/" <#if subMenuId==104 >class="active"</#if>>用户管理</a></li>
				<li><a href="${backendUrl}/order/" <#if subMenuId==102 >class="active"</#if>>订单管理</a></li>
				<li><a href="${backendUrl}/city/" <#if subMenuId==101 >class="active"</#if>>城市管理</a></li>
				<li><a href="${backendUrl}/news/" <#if subMenuId==103 >class="active"</#if>>新闻管理</a></li>
				<li><a href="${backendUrl}/recruit/" <#if subMenuId==105 >class="active"</#if>>招聘管理</a></li>
				<li><a href="${backendUrl}/activity/" <#if subMenuId==106 >class="active"</#if>>活动管理</a></li>
			</ul>
		</div>
		<div class="col-lg-9 col-lg-offset-3 col-lg-10 col-lg-offset-2 main">