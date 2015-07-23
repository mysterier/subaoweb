<div class="">
	上一篇: 
	<#if neigbourPre?exists>
	<a href="/${tag}/${neigbourPre.id?c}.html">${neigbourPre.title}</a>
	<#else>
	无
	</#if>				
</div>
<div class="">		
	下一篇: 
	<#if neigbourNext?exists>
	<a href="/${tag}/${neigbourNext.id?c}.html">${neigbourNext.title}</a>
	<#else>
	无
	</#if>				
</div>