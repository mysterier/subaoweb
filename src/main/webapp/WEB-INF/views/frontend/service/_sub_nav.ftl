<div class="wrapper sub-nav">
  <ul>
    <li <#if springMacroRequestContext.requestUri?contains("/service-jichang")> class="sub-nav-select"</#if>><a href="${url}/service-jichang/">接机送机</a></li>
    <li <#if springMacroRequestContext.requestUri?contains("/service-banche")> class="sub-nav-select"</#if>><a href="${url}/service-banche/">企业班车</a></li>
    <li <#if springMacroRequestContext.requestUri?contains("/service-huiyi")> class="sub-nav-select"</#if>><a href="${url}/service-huiyi/">商务会议接送</a></li>
    <li <#if springMacroRequestContext.requestUri?contains("/service-shangwu")> class="sub-nav-select"</#if>><a href="${url}/service-shangwu/">商务租车</a></li>
    <li <#if springMacroRequestContext.requestUri?contains("/service-lvyou")> class="sub-nav-select"</#if>><a href="${url}/service-lvyou/">旅游租车</a></li>
    <li <#if springMacroRequestContext.requestUri?contains("/service-linjin")> class="sub-nav-select"</#if>><a href="${url}/service-linjin/">邻近城市专送</a></li>
    <li <#if springMacroRequestContext.requestUri?contains("/service-hunqing")> class="sub-nav-select"</#if>><a href="${url}/service-hunqing/">婚庆租车</a></li>
    <div class="clearfix"></div>
  </ul>
</div>