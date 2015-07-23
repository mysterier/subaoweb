<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper submenu">
  <ol class="breadcrumb">
  <li><a href="${url}/">苏宝租车首页</a></li>
  <li class="active">公司新闻</li>
  </ol>
</div>
<div class="wrapper pad50">
	<div class="news">
    	<h3 class="text-left">公司新闻
    		<span class="text-left">COMPANY NEWS</span>
    	</h3>
		<#list companyNewses as companyNews>
    	<div class="news-p">
    		 <a href="${url}/company/${companyNews.id?c}.html">${companyNews.title}
				<span class="pull-right">${companyNews.updatedAt}</span>
			</a>
		</div>
		</#list>
		${pageStr}
	</div>
</div>
<#include "../partial/_footer_main.ftl">