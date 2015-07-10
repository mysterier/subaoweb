<#include "../partial/_header_main.ftl">
<h3>用户管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/client/create/">新增用户</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>ID</th>
			<th>手机号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>邮箱</th>
			<th>创建时间</th>
			<th>更新时间</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list clients as client>
		<tr>
			<td>${client.id}</td>
			<td>${client.mobile}</td>
			<td>${client.clientName}</td>
			<td>${client.clientPass}</td>
			<td>${client.clientEmail}</td>
			<td>${client.createdAt}</td>
			<td>${client.updatedAt}</td>
			<td class="center"><a href="${backendUrl}/client/${client.id}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/client/${client.id}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">