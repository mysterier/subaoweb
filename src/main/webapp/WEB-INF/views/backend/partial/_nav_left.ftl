<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search"></li>
			<li <#if menuId==1 >class="active"</#if>>
				<ul class="nav nav-second-level">
					<li><a href="${backendUrl}/adminuser/" <#if subMenuId==100 >class="active"</#if>>管理员</a></li>
					<li><a href="${backendUrl}/client/" <#if subMenuId==104 >class="active"</#if>>用户管理</a></li>
					<li><a href="${backendUrl}/order/" <#if subMenuId==102 >class="active"</#if>>订单管理</a></li>
					<li><a href="${backendUrl}/city/" <#if subMenuId==101 >class="active"</#if>>城市管理</a></li>
					<li><a href="${backendUrl}/news/" <#if subMenuId==103 >class="active"</#if>>新闻管理</a></li>
				</ul>
			</li>
			<!--
			li <#if menuId==2 >class="active"</#if>>
				<a href="#"><i class="fa fa-fw fa-camera"></i> 相册管理<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="${backendUrl}/album/" <#if subMenuId==201 >class="active"</#if>>相册</a></li>
					<li><a href="${backendUrl}/photo/" <#if subMenuId==202 >class="active"</#if>>相册照片</a></li>
				</ul>
			</li>
			<li><a href="${backendUrl}/user/"><i class="fa fa-fw fa-user"></i>管理员</a></li>
			-->
		</ul>
	</div>
</div>