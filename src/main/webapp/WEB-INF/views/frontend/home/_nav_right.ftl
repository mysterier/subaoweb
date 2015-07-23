<div class="order-right col-md-offset-1 col-md-5">
	<#if Session.client_user?exists>
	<p class="gray-darker">随便看看</p>
	<#else>
	<p class="gray-darker">我已有账号，可直接登陆</p>
	<button type="button" class="btn blue-btn btn-block btn-lg login-top">立即登陆</button>
	<p class="gray-darker">随便看看</p>
	</#if>
	<div class="order-look">
	<#list newses as news>
		<a href="${url}/<#if news.type==0>industry<#else>company</#if>/${news.id?c}.html">
			<div></div>
			<p>${news.title}</p>
		</a>
	</#list>
	</div>
</div>