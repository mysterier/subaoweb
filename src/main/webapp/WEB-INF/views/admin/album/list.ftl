<#include "../partial/_header_main.ftl">
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">相册管理</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">相册列表</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12 text-right">
						<p><a href="${adminUrl}/album/add/" class="btn btn-primary">新 建</a></p>
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
							<#list albums as album>
								<tr class="odd gradeX">
									<td>${album.id}</td>
									<td>${album.title}</td>
									<td>${album.createdAt}</td>
									<td>
									<a href="${adminUrl}/album/${album.id}/status/">
										<#if album.status == 0>禁用<#elseif album.status == 1>启用</#if>
									</a>
									</td>
									<td class="center"><a href="${adminUrl}/album/${album.id}/edit/">修改</a></td>
									<td class="center"><a href="${adminUrl}/album/${album.id}/delete/" class="delete">删除</a></td>
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
