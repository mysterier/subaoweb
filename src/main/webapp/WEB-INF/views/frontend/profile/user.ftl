<#include "../partial/_header_main.ftl">  
<div class="wrapper pad100">
<div class="user">
<#include "_left_side.ftl">
    <div class="user-right">
    <h4 class="gray-darker">个人中心<span>PROFILE</span></h4>
    <div class="user-tip">
      <h5 class="gray-darker">温馨提示</h5>
      <p class="gray">为了提高账户安全性，本站使用两种名称（登录名和昵称），尽可能避免两个名称同名，登录名不可修改只做登录用，昵称用来在本站显示。邮箱务必真实有效，以免忘却密码予以找回。</p>
    </div>
    <form class="form-horizontal" action="${url}/profile/user" method="post">
      <div class="form-group">
        <label for="" class="col-sm-2 control-label">登录名：</label>
        <div class="col-sm-5">
		  <@spring.formInput "client.clientName", 'class="form-control" readonly' />
        </div>
      </div>
      <!--
      <div class="form-group">
        <label for="" class="col-sm-2 control-label">昵称：</label>
        <div class="col-sm-5">
          <input type="text" class="form-control" id="" placeholder="">
        </div>
      </div>]
      -->
      <div class="form-group">
        <label for="" class="col-sm-2 control-label">邮箱：</label>
        <div class="col-sm-5">
          <@spring.formInput "client.clientEmail", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
      </div>
      <div class="form-group">
        <label for="" class="col-sm-2 control-label">手机：</label>
        <div class="col-sm-5">
          <@spring.formInput "client.mobile", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
      </div>
      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn blue-btn btn-lg">保存资料</button>
        </div>
      </div>
    </form>
  </div>
</div>
</div>
<#include "../partial/_footer_main.ftl">