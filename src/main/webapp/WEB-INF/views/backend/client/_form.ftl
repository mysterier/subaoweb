<@spring.formHiddenInput "client.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">手机号</label>
	<div class="col-sm-3"><@spring.formInput "client.mobile", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">用户名</label>
	<div class="col-sm-3"><@spring.formInput "client.clientName", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">密码</label>
	<div class="col-sm-3"><@spring.formPasswordInput "client.clientPass", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">邮箱</label>
	<div class="col-sm-3"><@spring.formInput "client.clientEmail", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>