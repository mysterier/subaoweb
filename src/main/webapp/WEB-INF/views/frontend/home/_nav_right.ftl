<div class="order-right col-md-offset-1 col-md-5">
	<p class="gray-darker">我已有账号，可直接登陆</p>
	<button type="button" class="btn blue-btn btn-block btn-lg">立即登陆</button>
	<p class="gray-darker">随便看看</p>
	<div class="order-look">
	<#list newses as news>
		<a href="${url}/<#if news.type==0>industry<#else>company</#if>/${news.title}">
			<div></div>
			<p>${news.title}</p>
		</a>
	</#list>
	</div>
</div>