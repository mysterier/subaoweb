<#include "../partial/_header_main.ftl">
<h3>管理员管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/user/create/">新增用户</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>ID</th>
			<th>用户名</th>
			<th>密码</th>
			<th>更新时间</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list users as user>
		<tr>
			<td>${user.id}</td>
			<td>${user.userName}</td>
			<td>${user.userPass}</td>
			<td>${user.updatedAt}</td>
			<td class="center"><a href="${backendUrl}/user/${user.id}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/user/${user.id}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">