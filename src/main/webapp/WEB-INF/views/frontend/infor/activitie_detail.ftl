<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper submenu">
  <ol class="breadcrumb">
 	<li><a href="${url}">首页</a></li>
 	<li><a href="${url}/activities">优惠活动</a></li>
	<li>${activity.title}</li>
  </ol>
</div>
<div class="wrapper-text pad50 activities-list-content">
  	<h3>${activity.title}</h3>
	<p>活动地区：<span>${activity.city}</span></p>
  	<p>${activity.content}</p>
	<p>活动时间：<span>${activity.activityStart}至${activity.activityEnd}</span></p>
</div>
<#include "../partial/_footer_main.ftl">