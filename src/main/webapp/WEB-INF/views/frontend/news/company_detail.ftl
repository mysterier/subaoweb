<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper submenu">
  <ol class="breadcrumb">
 	<li><a href="${url}">首页</a></li>
	<li><a href="${url}/company/">公司新闻</a></li>
	<li>${companyNews.title}</li>
  </ol>
</div>
<div class="wrapper-text pad50 activities-list-content">
	<h3 class="text-center gray-darker">${companyNews.title}</h3>
	<p class="text-center gray">${companyNews.updatedAt}</p>
	<p class="text-left gray">${companyNews.content}</p>
</div>
<#include "../partial/_footer_main.ftl">