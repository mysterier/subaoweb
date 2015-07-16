<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad50">
	<div class="news">
    	<h3 class="text-left">行业新闻
    		<span class="text-left">TRADE NEWS</span>
    	</h3>
		<#list industryNewses as industryNews>
    	<div class="news-p">
    		 <a href="${url}/industry/${industryNews.title}">${industryNews.title}
				<span class="pull-right">${industryNews.updatedAt}</span>
			</a>
		</div>
		</#list>
		   <nav>
      		<ul class="pagination">
        		<li>
         			 <a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
        		</li>
    		    <li><a href="#">1</a></li>
     	   	    <li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
       			<li>
					<a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
       			</li>
      		</ul>
    	</nav>
	</div>
</div>
<#include "../partial/_footer_main.ftl">