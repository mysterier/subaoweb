<@spring.formHiddenInput "news.id" />
<div class="form-group">
	<label class="col-lg-2 control-label">标题</label>
	<div class="col-sm-3"><@spring.formInput "news.title", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">内容</label>
	<div class="col-sm-3"><@spring.formTextarea "news.content", 'class="form-control form-input-sep"'/></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">创建时间</label>
	<div class="col-sm-3"><@spring.formInput "news.createdAt", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>
<div class="form-group">
	<label class="col-lg-2 control-label">更新时间</label>
	<div class="col-sm-3"><@spring.formInput "news.updatedAt", 'class="form-control form-input-sep"' /></div>
	<@spring.showErrors " "/>
</div>