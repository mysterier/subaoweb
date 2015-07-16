<#include "../partial/_header_main.ftl">
<div class="wrapper pad100">
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
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
<#include "../partial/_footer_main.ftl">