<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper submenu">
  <ol class="breadcrumb">
  <li><a href="${url}">首页</a></li>
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
    		 <a href="${url}/industry/${companyNews.id?c}.html">${companyNews.title}
				<span class="pull-right">${companyNews.updatedAt}</span>
			</a>
		</div>
		</#list>
		<nav>
      		<ul class="pagination">
        		<li>
         			 <a href="${url}/company/" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
        		</li>
				<li><a href="${url}/company/">1</a></li>
				<#if (totalPage>2)>
				<#list 2..totalPage as pageNo>
					<li><a href="${url}/company/page/${pageNo}/">${pageNo}</a></li>
				</#list>
				</#if>
       			<li>
					<a href="${url}/company/page/${totalPage}/" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
       			</li>
      		</ul>
    	</nav>
	</div>
</div>
<#include "../partial/_footer_main.ftl">