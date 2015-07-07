<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search"></li>
			<li>
				<a href="${adminUrl}/dashboard/"><i class="fa fa-dashboard fa-fw"></i> 仪表盘</a>
			</li>
			<li <#if menuId==1 >class="active"</#if>>
				<a href="#"><i class="fa fa-fw fa-font"></i> 博客管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="${adminUrl}/category/" <#if subMenuId==101 >class="active"</#if>>博客分类</a></li>
					<li><a href="${adminUrl}/post/" <#if subMenuId==102 >class="active"</#if>>博客文章</a></li>
					<li><a href="${adminUrl}/comment/" <#if subMenuId==103 >class="active"</#if>>文章评论</a></li>
					<li><a href="${adminUrl}/viewlog/" <#if subMenuId==104 >class="active"</#if>>阅读记录</a></li>
				</ul>
			</li>
			<li <#if menuId==2 >class="active"</#if>>
				<a href="#"><i class="fa fa-fw fa-camera"></i> 相册管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="${adminUrl}/album/" <#if subMenuId==201 >class="active"</#if>>相册</a></li>
					<li><a href="${adminUrl}/photo/" <#if subMenuId==202 >class="active"</#if>>相册照片</a></li>
				</ul>
			</li>
			<li><a href="${adminUrl}/user/"><i class="fa fa-fw fa-user"></i> 用户管理</a></li>
		</ul>
	</div>
</div>