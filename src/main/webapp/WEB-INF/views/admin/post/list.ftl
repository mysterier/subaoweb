<#include "../partial/_header_main.ftl">
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">博客文章管理</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">文章列表</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-3 text-left">
						<select name="categoryId" id="categoryId" class="form-control post-list-category-id">
							<#list categories as category>
							<option value="${category.id}" <#if categoryId==category.id>selected</#if>>${category.title}</option>
							</#list>
						</select>
					</div>
					<div class="col-lg-6 text-right pull-right">
						<p><a href="${adminUrl}/post/add/?categoryId=${categoryId}&page=${pagination.curPage}" class="btn btn-primary">新 建</a></p>
					</div>
				</div>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>类别</th>
							<th>标题</th>
							<th>永久链接</th>
							<th>新建于</th>
							<th>更新于</th>
							<th>阅读数</th>
							<th>状态</th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
					<#list pagination.itemList as post>
						<tr class="odd gradeX">
							<td>${post.id}</td>
							<td>${post.category.title}</td>
							<td>${post.title}</td>
							<td>${post.permaLink}</td>
							<td>${post.createdAt}</td>
							<td>${post.updatedAt}</td>
							<td>${post.viewCount}</td>
							<td>
							<a href="${adminUrl}/post/${post.id}/status/">
								<#if post.status == 0>禁用<#elseif post.status == 1>启用</#if>
							</a>
							</td>
							<td class="center"><a href="${adminUrl}/post/${post.id}/edit/">修改</a></td>
							<td class="center"><a href="${adminUrl}/post/${post.id}/delete/" class="delete">删除</a></td>
						</tr>
					</#list>
					</tbody>
				</table>
				<!-- pager start -->
				<div class="row">
					<div class="col-lg-6 text-left">
						<div class="pagination">
							共 ${pagination.totalCount} 条记录，${pagination.totalPage} 页，当前为第 ${pagination.curPage} 页
						</div>
					</div>
					<div class="col-lg-6 text-right">
						<ul class="pagination">
							<#if pagination.prev>
							<li class="paginate_button previous" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous">
								<a href="${adminUrl}/post/list/?categoryId=${categoryId}&page=1">首页</a>
							</li>
							<li class="paginate_button previous" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous">
								<a href="${adminUrl}/post/list/?categoryId=${categoryId}&page=${pagination.curPage-1}">上一页</a>
							</li>
							</#if>
							<#if pagination.totalPage!=0 >
								<#list 1..pagination.totalPage as i>
								<#if i == pagination.curPage>
							<li class="paginate_button active" aria-controls="dataTables-example" tabindex="0"><a href="${adminUrl}/post/list/?categoryId=${categoryId}&page=${i}">${i}</a></li>
								<#else>
							<li class="paginate_button" aria-controls="dataTables-example" tabindex="0"><a href="${adminUrl}/post/list/?categoryId=${categoryId}&page=${i}">${i}</a></li>
								</#if>
								</#list>
							</#if>
							<#if pagination.next >
							<li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next">
								<a href="${adminUrl}/post/list/?categoryId=${categoryId}&page=${pagination.curPage+1}">下一页</a>
							</li>
							<li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next">
								<a href="${adminUrl}/post/list/?categoryId=${categoryId}&page=${pagination.totalPage}">末页</a>
							</li>
							</#if>
						</ul>
					</div>
				</div><!-- pager end -->
			</div>
		</div>
	</div>
</div>
<#include "../partial/_footer_main.ftl">
