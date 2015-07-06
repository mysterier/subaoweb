<#include "../partial/_header_main.ftl">
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">相册 - 新建</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">新建相册</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12 text-right">
						<p><a href="${adminUrl}/album/" class="btn btn-primary">返 回</a></p>
					</div>
					<div class="col-lg-10">
						<form role="form" action="<@spring.url adminPath + "/album/add"/>" method="post">
							<#include "_form.ftl">
							<div class="form-group">
								<button type="submit" class="btn btn-default">提 交</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<#include "../partial/_footer_main.ftl">
