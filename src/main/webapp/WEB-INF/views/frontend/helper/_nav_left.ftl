<div class="list-group col-md-3">
	<a href="${url}/flow/" <#if springMacroRequestContext.requestUri?contains("/flow/")>class="list-group-item active"<#else>class="list-group-item"</#if>>订单流程</a>
	<a href="${url}/rule/" <#if springMacroRequestContext.requestUri?contains("/rule/")>class="list-group-item active"<#else>class="list-group-item"</#if>>服务规则</a>
	<a href="${url}/member/" <#if springMacroRequestContext.requestUri?contains("/member/")>class="list-group-item active"<#else>class="list-group-item"</#if>>会员介绍</a>
 	<a href="${url}/faq/" <#if springMacroRequestContext.requestUri?contains("/faq/")>class="list-group-item active"<#else>class="list-group-item"</#if>>常见问题</a>
</div>