(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-discussjingdianxinxi-detail"],{"39ac":function(t,i,e){"use strict";e.r(i);var n=e("c8e0"),r=e("3fbe");for(var a in r)"default"!==a&&function(t){e.d(i,t,(function(){return r[t]}))}(a);e("5f66");var s,o=e("f0c5"),l=Object(o["a"])(r["default"],n["b"],n["c"],!1,null,"7dbf390b",null,!1,n["a"],s);i["default"]=l.exports},"3fbe":function(t,i,e){"use strict";e.r(i);var n=e("6021"),r=e.n(n);for(var a in n)"default"!==a&&function(t){e.d(i,t,(function(){return n[t]}))}(a);i["default"]=r.a},"5a46":function(t,i,e){var n=e("89a1");"string"===typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);var r=e("4f06").default;r("9bef3b68",n,!0,{sourceMap:!1,shadowMode:!1})},"5f66":function(t,i,e){"use strict";var n=e("5a46"),r=e.n(n);r.a},6021:function(t,i,e){"use strict";var n=e("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,e("f559"),e("55dd"),e("96cf");var r=n(e("3b8d")),a={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:null,count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=i.id,i.userid&&(this.userid=i.userid),this.init();case 3:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),onUnload:function(){this.timer&&clearInterval(this.timer)},onShow:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){var e,n,r,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(e);case 3:if(n=t.sent,this.user=n.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),r=uni.getStorageSync("discussdiscussjingdianxinxiCleanType"),r&&(uni.removeStorageSync("discussdiscussjingdianxinxiCleanType"),this.mescroll.num=1,this.upCallback(this.mescroll)),a=uni.getStorageSync("crossCleanType"),!a){t.next=15;break}return uni.removeStorageSync("crossCleanType"),t.next=13,this.$api.info("discussjingdianxinxi",this.id);case 13:n=t.sent,this.detail=n.data;case 15:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),destroyed:function(){},methods:{onPayTap:function(){uni.setStorageSync("paytable","discussjingdianxinxi"),uni.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(t.id,"&userid=")+this.userid)},onAcrossTap:function(t,i,e,n,r){if(!this.user)return!1;if(uni.setStorageSync("crossTable","discussjingdianxinxi"),uni.setStorageSync("crossObj",this.detail),uni.setStorageSync("statusColumnName",e),uni.setStorageSync("statusColumnValue",r),uni.setStorageSync("tips",n),""!=e&&!e.startsWith("[")){var a=uni.getStorageSync("crossObj");for(var s in a)if(s==e&&a[s]==r)return void this.$utils.msg(n)}this.$utils.jump("../".concat(t,"/add-or-update?cross=true"))},init:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.timer&&clearInterval(this.timer),t.next=3,this.$api.info("discussjingdianxinxi",this.id);case 3:i=t.sent,this.detail=i.data;case 5:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.list("discussdiscussjingdianxinxi",{page:i.num,limit:10,refid:this.id});case 2:e=t.sent,1==i.num&&(this.commentList=[]),this.commentList=this.commentList.concat(e.data.list),0==e.data.list.length&&(this.hasNext=!1),i.endSuccess(i.size,this.hasNext);case 7:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(t){var i=this;t=i.$base.url+t,uni.downloadFile({url:t,success:function(e){200===e.statusCode&&(i.$utils.msg("下载成功"),window.open(t))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:this.$utils.jump("../discussdiscussjingdianxinxi/add-or-update?refid=".concat(this.id));case 3:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),onSHTap:function(){if(!this.user)return!1;this.$refs.popup.open()}}};i.default=a},"89a1":function(t,i,e){var n=e("24fb");i=n(!1),i.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-7dbf390b]{min-height:calc(100vh - 44px);box-sizing:border-box}.seat-list[data-v-7dbf390b]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;background:#fff;margin:%?20?%;border-radius:%?20?%;padding:%?20?%;font-size:%?30?%}.seat-list .seat-item[data-v-7dbf390b]{width:33.33%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;margin-bottom:%?20?%}.seat-list .seat-item .seat-icon[data-v-7dbf390b]{width:%?50?%;height:%?50?%;margin-bottom:%?10?%}uni-audio[data-v-7dbf390b]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}.audio[data-v-7dbf390b] .uni-audio-default{width:inherit}',""]),t.exports=i},c8e0:function(t,i,e){"use strict";var n={"mescroll-uni":e("f05e").default},r=function(){var t=this,i=t.$createElement,e=t._self._c||i;return e("v-uni-view",[e("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(i){arguments[0]=i=t.$handleEvent(i),t.mescrollInit.apply(void 0,arguments)},down:function(i){arguments[0]=i=t.$handleEvent(i),t.downCallback.apply(void 0,arguments)},up:function(i){arguments[0]=i=t.$handleEvent(i),t.upCallback.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"container",style:{width:"100%",padding:"0px",position:"relative",background:"#ff993310",height:"auto"}},[e("v-uni-view",{staticClass:"detail-content",style:{padding:"24rpx 24rpx 24rpx 24rpx",flexWrap:"wrap",background:"none",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("关联表id：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.refid))])],1),e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t.detail.avatarurl?e("v-uni-image",{style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:t.baseUrl+t.detail.avatarurl}}):t._e()],1),e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("用户名：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.nickname))])],1),e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("评论内容")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.content))])],1),e("v-uni-view",{staticClass:"detail-list-item",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("回复内容")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.reply))])],1),e("v-uni-view",{staticClass:"time-content",style:{width:"100%",padding:"0",margin:"0 0 24rpx 0",height:"auto"}},[e("v-uni-view",{staticClass:"comoment-header",style:{border:"2rpx solid #ff993350",boxShadow:"0px 0px 0px #cccccc",background:"#ffffff",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[e("v-uni-view",{style:{padding:"0 24rpx 0 24rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333"}},[t._v("评论")]),e("v-uni-view",{staticClass:"btn-comment-content",staticStyle:{display:"flex","align-items":"center"},style:{padding:"0 20rpx 0 20rpx",background:"#fff",display:"flex"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onCommentTap.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"iconfont icon-xinzeng4",style:{margin:"0 8rpx 0 0",lineHeight:"80rpx",fontSize:"32rpx",color:"#ff9933"}}),e("v-uni-view",{style:{color:"#ff9933",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("添加评论")])],1)],1),t._l(t.commentList,(function(i,n){return e("v-uni-view",{key:n,staticClass:"cu-item comment-item",style:{border:"2rpx solid #ff993350",boxShadow:"-6rpx 0px 0px #ff9933",padding:"20rpx",margin:"40rpx 0 0 0",borderRadius:"0",background:"#ffffff",width:"100%",height:"auto"}},[e("v-uni-view",{style:{width:"100%",display:"block",height:"auto"}},[i.avatarurl?e("v-uni-image",{style:{width:"80rpx",margin:"0 0 0 0",borderRadius:"100rpx",display:"inline-block",height:"80rpx"},attrs:{mode:"aspectFill",src:t.baseUrl+i.avatarurl}}):t._e(),e("v-uni-view",{staticClass:"text-grey",style:{width:"auto",lineHeight:"60rpx",fontSize:"32rpx",color:"#333333",textAlign:"center",display:"inline-block"}},[t._v(t._s(i.nickname))])],1),e("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0 8rpx 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",textIndent:"2em"}},[t._v(t._s(i.content))]),e("v-uni-view",{staticClass:"margin-top-sm text-gray text-df",style:{padding:"0 40rpx",lineHeight:"48rpx",fontSize:"28rpx",color:"#999999",textAlign:"right"}},[t._v(t._s(i.addtime))]),i.reply?e("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0 8rpx 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",textIndent:"2em"}},[t._v("回复:"+t._s(i.reply))]):t._e()],1)}))],2),e("v-uni-view",{staticClass:"bottom-content bg-white tabbar border shop",style:{padding:"0",margin:"20rpx 0 0",flexWrap:"wrap",background:"none",display:"flex",width:"100%",height:"auto"}})],1)],1)],1)],1)],1)},a=[];e.d(i,"b",(function(){return r})),e.d(i,"c",(function(){return a})),e.d(i,"a",(function(){return n}))}}]);