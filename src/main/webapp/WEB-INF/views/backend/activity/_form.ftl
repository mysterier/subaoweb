<@spring.formHiddenInput "activity.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">标题</label>
	<div class="col-sm-3"><@spring.formInput "activity.title", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">城市</label>
	<div class="col-sm-3"><@spring.formInput "activity.city", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">简介</label>
	<div class="col-sm-3"><@spring.formTextarea "activity.activityIntro", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">内容</label>
	<div class="col-sm-3"><@spring.formTextarea "activity.content", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">开始时间</label>
	<div class="col-sm-3"><@spring.formInput "activity.activityStart", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">结束时间</label>
	<div class="col-sm-3"><@spring.formInput "activity.activityEnd", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>