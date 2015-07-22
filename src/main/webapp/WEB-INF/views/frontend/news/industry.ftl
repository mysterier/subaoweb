<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper submenu">
  <ol class="breadcrumb">
  <li><a href="${url}/">首页</a></li>
  <li class="active">行业新闻</li>
  </ol>
</div>
<div class="wrapper pad50">
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
		   <nav>
      		<ul class="pagination">
        		<li>
         			 <a href="${url}/industry/" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
        		</li>
				<li><a href="${url}/industry/">1</a></li>
				<#if (totalPage>2)>
				<#list 2..totalPage as pageNo>
					<li><a href="${url}/industry/page/${pageNo}/">${pageNo}</a></li>
				</#list>
				</#if>
       			<li>
					<a href="${url}/industry/page/${totalPage}/" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
       			</li>
      		</ul>
    	</nav>
	</div>
</div>
<#include "../partial/_footer_main.ftl">