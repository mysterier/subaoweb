<@spring.formHiddenInput "order.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">城市</label>
	<div class="col-sm-3"><@spring.formInput "order.cityId", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">用车时间</label>
	<div class="col-sm-3"><@spring.formInput "order.rentTime", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">联系人</label>
	<div class="col-sm-3"><@spring.formInput "order.contactName", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">联系电话</label>
	<div class="col-sm-3"><@spring.formInput "order.contactPhone", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">车型</label>
	<div class="col-sm-3"><@spring.formInput "order.rentType", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">其他需求</label>
	<div class="col-sm-3"><@spring.formInput "order.rentOther", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">用户id</label>
	<div class="col-sm-3"><@spring.formInput "order.clientId", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">创建时间</label>
	<div class="col-sm-3"><@spring.formInput "order.createdAt", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>