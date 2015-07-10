<#include "../partial/_header_main.ftl">
<div class="container">
	<h1 class="page-header">用户</h1>
	<p class="text-right"><a class="btn btn-default" href="${backendUrl}/adminuser/create">新建</a></p>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>序号</th>
				<th>用户名</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#list users as user>  
				<tr>
					<td>${user.id}</td>
					<td>${user.userName}</td>
					<td nowrap="nowrap">
						<a href="${backendUrl}/adminuser/${user.id}"data-toggle="tooltip" title="" class="update" data-original-title="Update">修改</a> 
						<a href="${backendUrl}/adminuser/del/${user.id}" data-toggle="tooltip" title="" class="delete" data-original-title="Delete">删除</a>
					</td>
				</tr>
			</#list>
		</tbody>
	</table>
</div>
<#include "../partial/_footer_main.ftl">