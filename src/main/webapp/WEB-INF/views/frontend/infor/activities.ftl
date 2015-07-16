<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad50">
	<div class="news">
    	<h3 class="text-left">优惠活动
		<span class="text-left">SPECIAL OFFER</span>
		</h3>
		<#list activities as activitiy>
		<div class="activities-list">
			<p>活动名称：<span>${activitiy.title}</span></p>
          	<p>活动地区：<span>${activitiy.city}</span></p>
          	<p>活动时间：<span>${activitiy.activitiyStart}至${activitiy.activitiyEnd}</span></p>
          	<p>活动简介：<span>${activitiy.activitiyIntro}</span></p>
          	<a href="${url}/acticites/detail/{acticity.id}" class="btn btn-info">查看活动详情</a>
      	</div>
		</#list>
  	</div>
</div>
<#include "../partial/_footer_main.ftl">