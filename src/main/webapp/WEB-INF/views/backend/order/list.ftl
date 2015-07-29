<#include "../partial/_header_main.ftl">
<h3>订单管理</h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/order/create/">新增订单</a></p>
<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>ID</th>
			<th>城市id</th>
			<th>用车时间</th>
			<th>联系人</th>
			<th>联系电话</th>
			<th>车型</th>
			<th>其他需求</th>
			<th>用户id</th>
			<th>创建时间</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
	</thead>
	<tbody>
	<#list orders as order>
		<tr>
			<td>${order.id?c}</td>
			<td>${order.cityId}</td>
			<td>${order.rentTime}</td>
			<td>${order.contactName}</td>
			<td>${order.contactPhone}</td>
			<td>${order.rentType}</td>
			<td>${order.rentOther}</td>
			<td>${order.clientId?c}</td>
			<td>${order.createdAt}</td>
			<td class="center"><a href="${backendUrl}/order/${order.id?c}/edit/">修改</a></td>
			<td class="center"><a href="${backendUrl}/order/${order.id?c}/delete/" class="delete">删除</a></td>
		</tr>
	</#list>
	</tbody>
</table>
<#include "../partial/_footer_main.ftl">