<@spring.formHiddenInput "news.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">类型</label>
	<div class="col-sm-3"><@spring.formSingleSelect "news.type", options, 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">标题</label>
	<div class="col-sm-3"><@spring.formInput "news.title", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">内容</label>
	<div class="col-sm-9"><@spring.formTextarea "news.content", 'class="form-control form-input-sep" id="newscontent"'/></div>
	<@spring.showErrors " "/>
</div>
<script type="text/javascript">
	var editor = CKEDITOR.replace('newscontent');
</script>