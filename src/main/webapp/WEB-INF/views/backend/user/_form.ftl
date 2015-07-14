<@spring.formHiddenInput "adminUser.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">账号</label>
	<div class="col-sm-3"><@spring.formInput "adminUser.userName", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">密码</label>
	<div class="col-sm-3"><@spring.formPasswordInput "adminUser.userPass", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>