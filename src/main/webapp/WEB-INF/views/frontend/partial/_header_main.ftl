<#import "../../spring.ftl" as spring />
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <link rel="icon" href="#" sizes="16x16">
    <link rel="icon" href="#" sizes="32x32">
    <link rel="icon" href="#" sizes="48x48">
    <link rel="icon" href="#" sizes="64x64">
    <link rel="stylesheet" type="text/css" href="${url}/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="${url}/css/mystyle.css"/>
    <script type="text/javascript" src="${url}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${url}/js/myjs.js"></script>
</head>

<body>
<!-- login -->
<div class="theme-popover">
     <div class="theme-poptit">
          <a href="javascript:;" title="关闭" class="close">×</a>
     </div>
     <div class="theme-popbod dform">
           <form class="theme-signin" name="loginform" action="${url}/login" method="post">
                <ul>
                     <li><h4>欢迎登陆</h4></li>
                     <li><strong>用户名：</strong><input class="ipt" type="text" name="clientName" value="" size="24" /></li>
                     <li><strong>密码：</strong><input class="ipt" type="password" name="clientPass" value="" size="24" /></li>
                     <li><input class="btn blue-btn" type="submit" name="submit" value="登 录 " /></li>
                </ul>
           </form>
     </div>
</div>
<div class="theme-popover-mask"></div>
  <header class="header-wrapper">
    <div class="wrapper">
      <div class="header-login pull-right">
      		<#if Session.client_user?exists>
			<span><a href="${url}/user/" class="login-top">个人中心</a></span>|<span><a href="${url}/logout/">登出</a></span>
			<#else>
			<span><a href="#" class="login-top">登录</a></span>|<span><a href="${url}/reg/">注册</a></span>
			</#if>
		</div>
      <div class="header-tel pull-right"><img src="${url}/img/tel.png"/>400-684-5505</div>
    </div>
  </header>
  <nav class="nav-wrapper">
    <div class="wrapper">
    <div id="logo"><img src="${url}/img/logo.png"></div>
    <div id="nav">
      <ul id="topnav">
        <li class="nav-select"><a href="${url}/">首页</a></li>
        <li>
          <a href="#project">服务项目</a>
          <span>
            <a href="${url}/service-jichang">接机送机</a>
            <a href="${url}/service-banche">企业班车</a>
            <a href="${url}/service-huiyi">商务会议接送</a>
            <a href="${url}/service-shangwu">商务用车</a>
            <a href="${url}/service-lvyou">旅游租车</a>
            <a href="${url}/service-linjin">邻近城市专送</a>
            <a href="${url}/service-hunqing">婚庆租车</a>
          </span>
        </li>
        <li><a href="#price">服务价格</a></li>
        <li><a href="#about">服务优势</a></li>
        <li>
          <a href="${url}/news/">新闻中心</a>
          <span style="">
            <a href="${url}/industry/">行业新闻</a>
            <a href="${url}/company/">公司新闻</a>
            <a href="${url}/activities/">活动优惠</a>
          </span>
        </li>
        <li>
          <a href="#">帮助中心</a>
          <span style="">
            <a href="${url}/flow/">订车流程</a>
            <a href="${url}/rule/">服务规则</a>
            <a href="${url}/faq/">常见问题</a>
          </span>
        </li>
        <li><a href="${url}/order/">在线订车</a></li>
      </ul>
    </div>
  </div>
  </nav>