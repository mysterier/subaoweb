<%@ include file="../partial/_header_main.jsp" %>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Album</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Album</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12 text-right">
						<p><a href="${adminUrl}/album/add/" class="btn btn-primary">new Album</a></p>
					</div>
					<div class="col-lg-12">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>ID</th>
									<th>Titleò</th>
									<th>Created At</th>
									<th>StatusÄÅ</th>
									<th>&nbsp;</th>
									<th>&nbsp;</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="album" items="${albumList}">
								<tr class="odd gradeX">
									<td>${album.id}</td>
									<td>${album.title}</td>
									<td>${album.createdAt}</td>
									<td>
									<a href="${adminUrl}/album/${album.id}/status/">
										<c:if test="album.status==0">Enable</c:if>
										<c:if test="album.status==1">Disable</c:if>
									</a>
									</td>
									<td class="center"><a href="${adminUrl}/album/${album.id}/edit/">Modify</a></td>
									<td class="center"><a href="${adminUrl}/album/${album.id}/delete/" class="delete">Delete</a></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="../partial/_footer_main.jsp" %>
