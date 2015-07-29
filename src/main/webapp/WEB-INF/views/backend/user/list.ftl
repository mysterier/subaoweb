<#include "../partial/_header_main.ftl">
<h3>管理员</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/adminuser/create">新增管理员</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
		<#list users as user>  
			<tr>
				<td>${user.id?c}</td>
				<td>${user.userName}</td>
				<td class="center"><a href="${backendUrl}/adminuser/${user.id?c}/edit/">修改</a></td>
				<td class="center"><a href="${backendUrl}/adminuser/${user.id?c}/delete/">删除</a></td>
			</tr>
		</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">