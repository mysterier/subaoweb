<#include "../partial/_header_main.ftl">  
<div class="wrapper pad100">
<div class="user">
<#include "_left_side.ftl">
    <div class="user-right">
    <h4 class="gray-darker">个人中心<span>PROFILE</span></h4>
    <div class="user-tip">
      <h5 class="gray-darker">温馨提示</h5>
      <p class="gray">为了提高账户安全性，密码不能少于6位字符（可以为6位），最长可为16位。最好使用数字加字母的形式，也可以使用特殊符号作为密码。</p>
    </div>
    <form class="form-horizontal" action="${url}/profile/passwd" method="post">
      <div class="form-group">
        <label for="" class="col-sm-2 control-label">新密码：</label>
        <div class="col-sm-5">
          <@spring.formPasswordInput "client.clientPass", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
      </div>
      <div class="form-group">
        <label for="" class="col-sm-2 control-label">再输一遍：</label>
        <div class="col-sm-5">
          <@spring.formPasswordInput "client.passAgain", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
      </div>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn blue-btn btn-lg">更新密码</button>
        </div>
      </div>
    </form>
  </div>
</div>
</div>
<#include "../partial/_footer_main.ftl">