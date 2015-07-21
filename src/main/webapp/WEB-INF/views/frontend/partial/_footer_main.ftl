<div style="display: none;position:fixed;bottom:200px;right:1%;left:1%;" class="tips"></div>
<footer class="pad100">
<div class="wrapper white">
    <div class="footer-left">
      <h3 class="text-left">苏宝租车</h3>
      <p><img src="${url}/img/footer-phone.png">400-684-5505</p>
      <a href="${url}"><img src="${url}/img/footer-logo.png"></a>
    </div>
    <div class="footer-right">
      <ul>
        <li><h4>服务项目</h4></li>
        <li><a href="${url}/service-jichang/">机场接送</a></li>
        <li><a href="${url}/service-banche/">企业用车</a></li>
        <li><a href="${url}/service-huiyi/">商务会议接送</a></li>
        <li><a href="${url}/service-shangwu/">商务用车</a></li>
        <li><a href="${url}/service-lvyou/">旅游租车</a></li>
        <li><a href="${url}/service-linjin/">邻近城市专送</a></li>
        <li><a href="${url}/service-hunqing/">婚庆租车</a></li>
      </ul>
      <ul>
        <li><h4>关于我们</h4></li>
        <li><a href="${url}/about/">服务优势</a></li>
        <li><a href="${url}/joinus/">招聘信息</a></li>
        <li><a href="${url}/contact/">联系我们</a></li>
      </ul>
      <ul>
        <li><h4>新闻中心</h4></li>
        <li><a href="${url}/industry/">行业新闻</a></li>
        <li><a href="${url}/company/">公司新闻</a></li>
        <li><a href="${url}/activities/">优惠活动</a></li>
      </ul>
      <ul>
        <li><h4>帮助中心</h4></li>
        <li><a href="${url}/flow/">订单流程</a></li>
        <li><a href="${url}/rule/">服务规则</a></li>
        <li><a href="${url}/member/">会员介绍</a></li>
        <li><a href="${url}/faq/">常见问题</a></li>
      </ul>
    </div>
</div>
<div class="clearfix"></div>
<div class="footer-bottom wrapper">
  <p>Copyright © 2015 SuBao All Rights Reserved. 备案号：沪ICP备13010843号-1</p>
</div>
</footer>
<div id="return"><a href="javascript:scroll(0,0)"><img src="${url}/img/return.png" width="64px" height="64px"></a></div>

</body>

</html>
<script>
function alertMsg(msg) {
	$(".tips").html(msg).fadeIn(1000).fadeOut(1500);
}
<#if msg?exists>
alertMsg('${msg}');
</#if>
</script>