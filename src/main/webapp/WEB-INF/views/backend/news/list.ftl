<#include "../partial/_header_main.ftl">
<h3>新闻管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/news/create/">新增新闻</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>ID</th>
			<th>类型</th>
			<th>标题</th>
			<th>创建时间</th>
			<th>更新时间</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list newses as news>
		<tr>
			<td>${news.id?c}</td>
			<td>${news.getTypeString()}</td>
			<td>${news.title}</td>
			<td>${news.createdAt}</td>
			<td>${news.updatedAt}</td>
			<td class="center"><a href="${backendUrl}/news/${news.id?c}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/news/${news.id?c}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">