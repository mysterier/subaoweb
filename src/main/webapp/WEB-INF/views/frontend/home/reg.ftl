<#include "../partial/_header_main.ftl">
<div id="sub-banner"></div>
<div class="wrapper pad100">
  <div class="order">
    <div class="order-left col-md-6">
      <h4 class="gray-darker">注册<span>REGISTER</span></h4>
      <form action="${url}/reg" method="post">
        <div class="form-group">
          <label for="">手机号码<span>*<span></label>
          <@spring.formInput "client.mobile", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
        <div class="form-group">
          <label for="">登录名<span>*<span></label>
          <@spring.formInput "client.clientName", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
        <div class="form-group">
          <label for="">密码<span>*<span></label>
          <@spring.formPasswordInput "client.clientPass", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
        <div class="form-group">
          <label for="">再输一遍密码<span>*<span></label>
          <@spring.formPasswordInput "client.passAgain", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
        <div class="form-group">
          <label for="">邮箱</label>
          <@spring.formInput "client.clientEmail", 'class="form-control"' />
		  <@spring.showErrors " "/>
        </div>
        <button type="submit" class="btn blue-btn btn-block btn-lg">确认注册</button>
      </form>
    </div>
    <div class="order-right col-md-offset-1 col-md-5">
      <p class="gray-darker">我已有账号，可直接登陆</p>
      <button type="button" class="btn blue-btn btn-block btn-lg">立即登陆</button>
      <p class="gray-darker">随便看看</p>
      <div class="order-look">
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
        <a href="#"><div></div><p>上海商务会议租车更快更好的保证企业形象宣传</p></a>
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
        <a href="#"><div></div><p>上海商务会议租车更快更好的保证企业形象宣传</p></a>
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
        <a href="#"><div></div><p>上海哪家租车公司好，选苏宝公司</p></a>
      </div>

    </div>
  </div>
  <div class="clearfix"></div>
</div>
<#include "../partial/_footer_main.ftl">