<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad100">
<#include "../partial/_nav_left.ftl">
<div class="help-right col-md-9">
<div class="submenu">
  <ol class="breadcrumb">
 	<li><a href="${url}/">苏宝租车首页</a></li>
 	<li><a href="${url}/joinus/">招聘信息</a></li>
	<li>${recruitInfor.title}</li>
  </ol>
</div>
<div class="wrapper-text pad50 activities-list-content">
	<h3 class="text-center gray-darker">${recruitInfor.title}</h3>
	<p class="text-center gray">${recruitInfor.updatedAt}</p>
	<p class="text-left gray">${recruitInfor.content}</p>
</div>
</div>
<div class="clearfix"></div>
</div>
<#include "../partial/_footer_main.ftl">