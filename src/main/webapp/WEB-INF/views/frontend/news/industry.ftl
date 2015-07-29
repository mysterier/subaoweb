<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad100">
<#include "../partial/_nav_left.ftl">
<div class="help-right col-md-9">
<div class="submenu">
  <ol class="breadcrumb">
  <li><a href="${url}/">苏宝租车首页</a></li>
  <li class="active">行业新闻</li>
  </ol>
</div>
<div class="pad50">
	<div class="news">
    	<h3 class="text-left">行业新闻
    		<span class="text-left">TRADE NEWS</span>
    	</h3>
		<#list industryNewses as industryNews>
    	<div class="news-p">
    		 <a href="${url}/industry/${industryNews.id?c}.html">${industryNews.title}
				<span class="pull-right">${industryNews.updatedAt}</span>
			</a>
		</div>
		</#list>
	${pageStr}
	</div>
</div>
</div>
<div class="clearfix"></div>
</div>
<#include "../partial/_footer_main.ftl">