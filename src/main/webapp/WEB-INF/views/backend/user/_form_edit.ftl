<@spring.formHiddenInput "adminuser.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">用户名</label>
	<div class="col-sm-3"><@spring.formInput "adminuser.userName", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">密码</label>
	<div class="col-sm-3"><@spring.formInput "adminuser.userPass", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">更新时间</label>
	<div class="col-sm-3"><@spring.formInput "adminuser.updatedAt", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>