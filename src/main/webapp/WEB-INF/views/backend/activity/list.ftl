<#include "../partial/_header_main.ftl">
<h3>活动管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/activity/create/">新活动</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>活动ID</th>
			<th>活动标题</th>
			<th>活动城市</th>
			<th>简略描述</th>
			<th>内容正文</th>
			<th>开始时间</th>
			<th>结束时间</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list activities as activity>
		<tr>
			<td>${activity.id?c}</td>
			<td>${activity.title}</td>
			<td>${activity.city}</td>
			<td>${activity.activityIntro}</td>
			<td>${activity.content}</td>
			<td>${activity.activityStart}</td>
			<td>${activity.activityEnd}</td>
			<td class="center"><a href="${backendUrl}/activity/${activity.id?c}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/activity/${activity.id?c}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">