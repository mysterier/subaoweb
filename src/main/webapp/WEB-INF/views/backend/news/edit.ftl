<#include "../partial/_header_main.ftl">
<h3>新闻管理 <small>编辑</small></h3>
<p class="text-right"><a class="btn btn-default" href="${backendUrl}/news/">返回</a></p>
<div class="row">
	<div class="col-lg-12">
		<form class="form-horizontal" action="${backendUrl}/news/${news.id}/edit/" method="post">
			<#include "_form_edit.ftl">
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<button type="submit" class="btn btn-default">提 交</button>
				</div>
			</div>
		</form>
	</div>
</div>
<#include "../partial/_footer_main.ftl">