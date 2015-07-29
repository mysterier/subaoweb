<#include "../partial/_header_main.ftl">
<h3>城市管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/city/create/">新建城市</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>ID</th>
			<th>城市</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list cities as city>
		<tr>
			<td>${city.id?c}</td>
			<td>${city.cityName}</td>
			<td class="center"><a href="${backendUrl}/city/${city.id?c}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/city/${city.id?c}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">