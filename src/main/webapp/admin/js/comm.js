$(function() {
	$('.delete').click(function(){
		var url = $(this).attr("href");
		if (confirm('确认删除？')) {
			window.location = url;
		}
		return false;
	});
	//post list
	$('.post-list-category-id').change(function(){
		var categoryId = $(this).val();
		window.location = '/jackylab/admin120/post/?categoryId=' + categoryId;
	});
})
