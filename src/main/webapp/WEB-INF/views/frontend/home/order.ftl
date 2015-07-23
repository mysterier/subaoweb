<#include "../partial/_header_main.ftl">
<@spring.formHiddenInput "order.id" />
<div id="sub-banner"></div>
<div class="wrapper submenu">
  <ol class="breadcrumb">
 	<li><a href="${url}/">苏宝租车首页</a></li>
	<li>在线订车</a></li>
  </ol>
</div>
<div class="wrapper pad100">
	<div class="order">
    	<div class="order-left col-md-6">
        	<h4 class="gray-darker">在线订车<span>ONLINE ORDERING</span></h4>
            <form ction="${url}/index" method="post">
				<div class="form-group">
					<label for="">城市<span>*<span></label>
            		<select class="form-control">
						<option>上海</option>
            		</select>
       			</div>
        		<div class="form-group">
					<label for="">用车时间<span>*<span></label>
					<@spring.formInput "order.rentTime", 'class="form-control" id="" placeholder="例：2015-5-1 15:20:20"' />
					<@spring.showErrors ""/>
    		    </div>
     		  	<div class="form-group">
					<label for="">联系人<span>*<span></label>
					<@spring.formInput "order.contactName", 'class="form-control" id="" placeholder=""' />
					<@spring.showErrors " "/>
				</div>
				<div class="form-group">
					<label for="">联系电话<span>*<span></label>
					<@spring.formInput "order.contactPhone", 'class="form-control" id="" placeholder=""' />
					<@spring.showErrors " "/>
				</div>
				<div class="form-group">
					<label for="">租车类型<span>*<span></label>
					<@spring.formSingleSelect "order.rentType" ,options , 'class="form-control"' />
     		   	</div>
				<div class="form-group">
				<label for="">其他需求<span>*<span></label>
				<@spring.formTextarea "order.rentOther", 'class="form-control" id="" placeholder=""' />
				<@spring.showErrors " "/>
				</div>
     		   	<button type="submit" class="btn blue-btn btn-block btn-lg">在线订车</button>
			</form>
		</div>
   	<#include "_nav_right.ftl">	
	</div>
	<div class="clearfix"></div>
</div>
<#include "../partial/_footer_main.ftl">