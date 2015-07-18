<#include "../partial/_header_main.ftl">  
<div class="wrapper pad100">
<div class="user">
<#include "_left_side.ftl">
  <div class="user-right">
    <h4 class="gray-darker">个人中心<span>PROFILE</span></h4>
    <#if orders?exists>
	<table class="table table-striped">
      <thead>
        <tr>
          <th>联系电话</th>
          <th>租车类型</th>
          <th>城市</th>
          <th>时间</th>
          <th>联系人</th>
          <th>其他</th>
        </tr>
      </thead>
      <tbody>
     	<#list orders as order>
        <tr>
          <td>${order.contactPhone}</td>
          <td>接送机</td>
          <td>上海</td>
          <td>${order.createdAt}</td>
          <td>${order.contactName}</td>
          <td>${order.rentOther}</td>
        </tr>
        </#list>
      </tbody>
    </table>
	<#else>
	<p>未找到相关订单</p>
	</#if>
  </div>
</div>
</div>
<#include "../partial/_footer_main.ftl">