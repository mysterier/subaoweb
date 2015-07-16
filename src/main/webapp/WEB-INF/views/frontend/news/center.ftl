<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad50">
    <div class="news">
        <h3 class="text-left">行业新闻
  <span class="text-left">TRADE NEWS</span>
  <span class="pull-right"><a href="${url}/industry">更多行业新闻>></a></span>
</h3>
<#list industryNewses as industryNews>
        <div class="news-p">
            <a href="${url}/industry/${industryNews.title}">
  ${industryNews.title}
  <span class="pull-right">${industryNews.updatedAt}</span>
			</a>
        </div>
</#list>
        <h3 class="text-left">公司新闻
<span class="text-left">COMPANY NEWS</span>
<span class="pull-right"><a href="${url}/company">更多行业新闻>></a></span>
</h3>
<#list companyNewses as companyNews>
        <div class="news-p">
            <a href="${url}/company/${companyNews.title}">
	${companyNews.title}
    <span class="pull-right">${companyNews.updatedAt}</span>
  </a>
        </div>
</#list>
    </div>
</div>
<#include "../partial/_footer_main.ftl">