<#include "../partial/_header_main.ftl">
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">博客分类管理</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">分类列表</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12 text-right">
						<p><a href="${adminUrl}/category/add/" class="btn btn-primary">新 建</a></p>
					</div>
					<div class="col-lg-12">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>ID</th>
									<th>标题</th>
									<th>新建于</th>
									<th>状态</th>
									<th>&nbsp;</th>
									<th>&nbsp;</th>
								</tr>
							</thead>
							<tbody>
							<#list categories as category>
								<tr class="odd gradeX">
									<td>${category.id}</td>
									<td>${category.title}</td>
									<td>${category.createdAt}</td>
									<td>
									<a href="${adminUrl}/category/${category.id}/status/">
										<#if category.status == 0>禁用<#elseif category.status == 1>启用</#if>
									</a>
									</td>
									<td class="center"><a href="${adminUrl}/category/${category.id}/edit/">修改</a></td>
									<td class="center"><a href="${adminUrl}/category/${category.id}/delete/" class="delete">删除</a></td>
								</tr>
							</#list>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<#include "../partial/_footer_main.ftl">
