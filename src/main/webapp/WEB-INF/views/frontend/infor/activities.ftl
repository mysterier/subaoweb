<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad50">
	<div class="news">
    	<h3 class="text-left">优惠活动
		<span class="text-left">SPECIAL OFFER</span>
		</h3>
		<#list activities as activity>
		<div class="activities-list">
			<p>活动名称：<span>${activity.title}</span></p>
          	<p>活动地区：<span>${activity.city}</span></p>
          	<p>活动时间：<span>${activity.activityStart}至${activity.activityEnd}</span></p>
          	<p>活动简介：<span>${activity.activityIntro}</span></p>
          	<a href="${url}/activities/detail/${activity.id}" class="btn blue-btn">查看活动详情</a>
      	</div>
		</#list>
  	</div>
</div>
<#include "../partial/_footer_main.ftl">