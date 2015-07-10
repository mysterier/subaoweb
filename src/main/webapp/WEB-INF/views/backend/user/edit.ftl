<#include "../partial/_header_main.ftl">
<div class="container">
	<h1>系统用户 <small>修改</small></h1>
	<p class="text-right"><a class="btn btn-default" href="${backendUrl}/adminuser">返回</a></p>
	<div class="row">
		<div class="col-lg-12">
			<form class="form-horizontal" action="${backendUrl}/adminuser/${model.id}" method="post">
				<#include "_form.ftl">
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<button type="submit" class="btn btn-default">提 交</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<#include "../partial/_footer_main.ftl">