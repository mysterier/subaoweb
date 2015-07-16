<#include "../partial/_header_main.ftl">
<h3>招聘管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/recruit/create/">新增招聘信息</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>ID</th>
			<th>标题</th>
			<th>内容</th>
			<th>更新时间</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list recruits as recruit>
		<tr>
			<td>${recruit.id}</td>
			<td>${recruit.title}</td>
			<td>${recruit.content}</td>
			<td>${recruit.updatedAt}</td>
			<td class="center"><a href="${backendUrl}/recruit/${recruit.id}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/recruit/${recruit.id}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">