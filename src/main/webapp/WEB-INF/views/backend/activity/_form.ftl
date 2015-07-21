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
	<div class="col-sm-8"><@spring.formTextarea "activity.activityIntro", 'class="form-control form-input-sep" name="activityIntro"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">内容</label>
	<div class="col-sm-8"><@spring.formTextarea "activity.content", 'class="form-control form-input-sep" name="content"'/></div>
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
<script type="text/javascript">
	var editor = CKEDITOR.replace('activityIntro');
	var editor = CKEDITOR.replace('content');
</script>