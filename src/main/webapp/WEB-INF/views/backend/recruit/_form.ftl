<@spring.formHiddenInput "recruit.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">标题</label>
	<div class="col-sm-3"><@spring.formInput "recruit.title", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">内容</label>
	<div class="col-sm-8"><@spring.formTextarea "recruit.content", 'class="form-control form-input-sep" id="recruitContent"'/></div>
	<@spring.showErrors " "/>
</div>
<script type="text/javascript">
	var editor = CKEDITOR.replace('recruitContent');
</script>