<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper-text pad50 activities-list-content">
  	<h3>${activity.title}</h3>
	<p>活动地区：<span>${activity.city}</span></p>
  	<p>${activity.content}</p>
	<p>活动时间：<span>${activity.activityStart}至${activity.activityEnd}</span></p>
</div>
<#include "../partial/_footer_main.ftl">