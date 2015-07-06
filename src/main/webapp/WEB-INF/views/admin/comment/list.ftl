<#include "../partial/_header_main.ftl">
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">文章评论管理</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">评论列表</div>
			<div class="panel-body">
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>所属博文</th>
							<th>姓名</th>
							<th>内容</th>
							<th>新建于</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
					<#list pagination.itemList as model>
						<tr class="odd gradeX">
							<td>${model.id}</td>
							<td>${model.post.title}</td>
							<td>${model.userName}</td>
							<td>${model.message}</td>
							<td>${model.createdAt}</td>
							<td class="center"><a href="${adminUrl}/comment/${model.id}/delete/" class="delete">删除</a></td>
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
								<a href="${adminUrl}/post/list/?page=1">首页</a>
							</li>
							<li class="paginate_button previous" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous">
								<a href="${adminUrl}/post/list/?page=${pagination.curPage-1}">上一页</a>
							</li>
							</#if>
							<#if pagination.totalPage!=0 >
								<#list 1..pagination.totalPage as i>
								<#if i == pagination.curPage>
							<li class="paginate_button active" aria-controls="dataTables-example" tabindex="0"><a href="${adminUrl}/post/list/?page=${i}">${i}</a></li>
								<#else>
							<li class="paginate_button" aria-controls="dataTables-example" tabindex="0"><a href="${adminUrl}/post/list/?page=${i}">${i}</a></li>
								</#if>
								</#list>
							</#if>
							<#if pagination.next >
							<li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next">
								<a href="${adminUrl}/post/list/?page=${pagination.curPage+1}">下一页</a>
							</li>
							<li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next">
								<a href="${adminUrl}/post/list/?page=${pagination.totalPage}">末页</a>
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
