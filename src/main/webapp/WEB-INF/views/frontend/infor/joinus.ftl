<#include "../partial/_header_main.ftl">
<div class="wrapper pad100">
<#include "../partial/_nav_left.ftl">
<div class="help-right col-md-9">
<div class="submenu">
  <ol class="breadcrumb">
 	<li><a href="${url}/">苏宝租车首页</a></li>
	<li>招聘信息</li>
  </ol>
</div>
<div>
    <div class="news">
        <h3 class="text-left">招聘信息
  			<span class="text-left">JOIN US</span>
		</h3>
        <div class="news-p">
			<#list recruitInfors as recruitInfor>
            	<a href="${url}/joinus/${recruitInfor.title}">${recruitInfor.title}
					<span class="pull-right">${recruitInfor.updatedAt}</span>
				</a>
			</#list>
            <nav>
                <ul class="pagination">
                    <li>
         			 <a href="${url}/joinus/" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
        		</li>
				<li><a href="${url}/joinus/">1</a></li>
				<#if (totalPage>2)>
				<#list 2..totalPage as pageNo>
					<li><a href="${url}/joinus/page/${pageNo}/">${pageNo}</a></li>
				</#list>
				</#if>
       			<li>
					<a href="${url}/company/page/${totalPage}/" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
       			</li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</div>
<div class="clearfix"></div>
</div>
<#include "../partial/_footer_main.ftl">