(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-dianyingtuijian-detail"],{"0b23":function(t,i,e){"use strict";var n=e("f110"),r=e.n(n);r.a},"3b8d1":function(t,i,e){"use strict";e.r(i);var n=e("785a"),r=e("cd1a");for(var a in r)"default"!==a&&function(t){e.d(i,t,(function(){return r[t]}))}(a);e("0b23");var s,l=e("f0c5"),o=Object(l["a"])(r["default"],n["b"],n["c"],!1,null,"6273cdaf",null,!1,n["a"],s);i["default"]=o.exports},5040:function(t,i,e){"use strict";var n=e("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,e("a481"),e("28a5"),e("f559"),e("55dd"),e("96cf");var r=n(e("3b8d")),a={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:null,thumbsupFlag:0,crazilyFlag:0,count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=i.id,i.userid&&(this.userid=i.userid),this.init();case 3:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),onUnload:function(){this.timer&&clearInterval(this.timer)},onShow:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){var e,n,r,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return e=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(e);case 3:if(n=t.sent,this.user=n.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),this.getThumbsup(),r=uni.getStorageSync("discussdianyingtuijianCleanType"),r&&(uni.removeStorageSync("discussdianyingtuijianCleanType"),this.mescroll.num=1,this.upCallback(this.mescroll)),a=uni.getStorageSync("crossCleanType"),!a){t.next=16;break}return uni.removeStorageSync("crossCleanType"),t.next=14,this.$api.info("dianyingtuijian",this.id);case 14:n=t.sent,this.detail=n.data;case 16:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),destroyed:function(){},methods:{onPayTap:function(){uni.setStorageSync("paytable","dianyingtuijian"),uni.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(t.id,"&userid=")+this.userid)},onAcrossTap:function(t,i,e,n,r){if(!this.user)return!1;if(uni.setStorageSync("crossTable","dianyingtuijian"),uni.setStorageSync("crossObj",this.detail),uni.setStorageSync("statusColumnName",e),uni.setStorageSync("statusColumnValue",r),uni.setStorageSync("tips",n),""!=e&&!e.startsWith("[")){var a=uni.getStorageSync("crossObj");for(var s in a)if(s==e&&a[s]==r)return void this.$utils.msg(n)}this.$utils.jump("../".concat(t,"/add-or-update?cross=true"))},init:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.timer&&clearInterval(this.timer),t.next=3,this.$api.info("dianyingtuijian",this.id);case 3:i=t.sent,this.detail=i.data,this.swiperList=this.detail.dianyingfengmian?this.detail.dianyingfengmian.split(","):[],this.detail.dianyingjianjie=this.detail.dianyingjianjie.replace(/img src/gi,'img style="width:100%;" src');case 7:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(i){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.list("discussdianyingtuijian",{page:i.num,limit:10,refid:this.id});case 2:e=t.sent,1==i.num&&(this.commentList=[]),this.commentList=this.commentList.concat(e.data.list),0==e.data.list.length&&(this.hasNext=!1),i.endSuccess(i.size,this.hasNext);case 7:case"end":return t.stop()}}),t,this)})));function i(i){return t.apply(this,arguments)}return i}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(t){var i=this;t=i.$base.url+t,uni.downloadFile({url:t,success:function(e){200===e.statusCode&&(i.$utils.msg("下载成功"),window.open(t))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:this.$utils.jump("../discussdianyingtuijian/add-or-update?refid=".concat(this.id));case 3:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),getThumbsup:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var i,e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:return i={page:1,limit:1,refid:this.id,tablename:"dianyingtuijian",userid:this.user.id,type:"%2%"},t.next=5,this.$api.list("storeup",i);case 5:e=t.sent,e.data.list.length>0&&("21"==e.data.list[0].type?this.thumbsupFlag=1:this.crazilyFlag=1);case 7:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),zan:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var i,e,n,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:return i=this,e={page:1,limit:1,refid:i.detail.id,tablename:"dianyingtuijian",userid:i.user.id,type:"%2%"},t.next=6,i.$api.list("storeup",e);case 6:if(n=t.sent,!(n.data.list.length>0)){t.next=11;break}return a=n.data.list[0].id,uni.showModal({title:"提示",content:"是否取消点赞",success:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!e.confirm){t.next=8;break}return t.next=3,i.$api.del("storeup",JSON.stringify([a]));case 3:return i.detail.thumbsupnum=parseInt(i.detail.thumbsupnum)-1,t.next=6,i.$api.update("dianyingtuijian",i.detail);case 6:i.$utils.msg("取消成功"),i.thumbsupFlag=0;case 8:case"end":return t.stop()}}),t)})));function e(i){return t.apply(this,arguments)}return e}()}),t.abrupt("return");case 11:uni.showModal({title:"提示",content:"是否点赞",success:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!e.confirm){t.next=8;break}return t.next=3,i.$api.add("storeup",{userid:i.user.id,name:i.detail.dianyingmingcheng,picture:i.swiperList[0],refid:i.detail.id,tablename:"dianyingtuijian",type:"21"});case 3:return i.detail.thumbsupnum=parseInt(i.detail.thumbsupnum)+1,t.next=6,i.$api.update("dianyingtuijian",i.detail);case 6:i.$utils.msg("点赞成功"),i.thumbsupFlag=1;case 8:case"end":return t.stop()}}),t)})));function e(i){return t.apply(this,arguments)}return e}()});case 12:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),cai:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var i,e,n,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:return i=this,e={page:1,limit:1,refid:i.detail.id,tablename:"dianyingtuijian",userid:i.user.id,type:"%2%"},t.next=6,i.$api.list("storeup",e);case 6:if(n=t.sent,!(n.data.list.length>0)){t.next=11;break}return a=n.data.list[0].id,uni.showModal({title:"提示",content:"是否取消点踩",success:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!e.confirm){t.next=8;break}return t.next=3,i.$api.del("storeup",JSON.stringify([a]));case 3:return i.detail.crazilynum=parseInt(i.detail.crazilynum)-1,t.next=6,i.$api.update("dianyingtuijian",i.detail);case 6:i.$utils.msg("取消成功"),i.crazilyFlag=0;case 8:case"end":return t.stop()}}),t)})));function e(i){return t.apply(this,arguments)}return e}()}),t.abrupt("return");case 11:uni.showModal({title:"提示",content:"是否点踩",success:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!e.confirm){t.next=8;break}return t.next=3,i.$api.add("storeup",{userid:i.user.id,name:i.detail.dianyingmingcheng,picture:i.swiperList[0],refid:i.detail.id,tablename:"dianyingtuijian",type:"22"});case 3:return i.detail.crazilynum=parseInt(i.detail.crazilynum)+1,t.next=6,i.$api.update("dianyingtuijian",i.detail);case 6:i.$utils.msg("点踩成功"),i.crazilyFlag=1;case 8:case"end":return t.stop()}}),t)})));function e(i){return t.apply(this,arguments)}return e}()});case 12:case"end":return t.stop()}}),t,this)})));function i(){return t.apply(this,arguments)}return i}(),onSHTap:function(){if(!this.user)return!1;this.$refs.popup.open()}}};i.default=a},"785a":function(t,i,e){"use strict";var n={"mescroll-uni":e("f05e").default},r=function(){var t=this,i=t.$createElement,e=t._self._c||i;return e("v-uni-view",[e("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(i){arguments[0]=i=t.$handleEvent(i),t.mescrollInit.apply(void 0,arguments)},down:function(i){arguments[0]=i=t.$handleEvent(i),t.downCallback.apply(void 0,arguments)},up:function(i){arguments[0]=i=t.$handleEvent(i),t.upCallback.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"content"},[e("v-uni-view",{staticClass:"container",style:{width:"100%",padding:"0px",position:"relative",background:"#ff993310",height:"auto"}},[e("v-uni-swiper",{staticClass:"swiper",style:{width:"100%",background:"none",height:"400rpx"},attrs:{"indicator-dots":!0,autoplay:!0,circular:!0,"indicator-active-color":"#ff746d","indicator-color":"#ffffff",duration:500,interval:5e3,vertical:!1}},t._l(t.swiperList,(function(i,n){return e("v-uni-swiper-item",{key:n,style:{width:"100%",textAlign:"center",background:"none",height:"100%"}},["http"==i.substring(0,4)?e("img",{style:{width:"100%",padding:"0",objectFit:"contain",background:"none",display:"block",height:"100%"},attrs:{mode:"aspectFill",src:i}}):e("img",{style:{width:"100%",padding:"0",objectFit:"contain",background:"none",display:"block",height:"100%"},attrs:{mode:"aspectFill",src:t.baseUrl+i}})])})),1),e("v-uni-view",{staticClass:"detail-content",style:{padding:"24rpx 24rpx 24rpx 24rpx",flexWrap:"wrap",background:"none",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("电影名称：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.dianyingmingcheng))])],1),e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("导演：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.daoyan))])],1),e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("主演：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.zhuyan))])],1),e("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"12rpx 0 12rpx 0",borderColor:"#cccccc",flexWrap:"wrap",borderWidth:"0 0 0px 0",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[t._v("上映时间：")]),e("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.shangyingshijian))])],1),t.thumbsupFlag||t.crazilyFlag?t._e():e("v-uni-view",{staticClass:"detail-list-item",style:{padding:"0 40rpx 0 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",textAlign:"center",display:"inline-block",justifyContent:"center",borderRadius:"100rpx",borderWidth:"0 0 0px 0",background:"none",width:"48%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333333",textAlign:"left",display:"inline-block",width:"auto",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("赞：")]),e("v-uni-view",{style:{width:"auto",flex:"1",display:"inline-block",height:"auto"}},[e("v-uni-view",{style:{margin:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",display:"inline-block"}},[t._v(t._s(t.detail.thumbsupnum))]),e("v-uni-view",{staticClass:"iconfont icon-thumb-up-line2",style:{lineHeight:"80rpx",fontSize:"48rpx",color:"#ff746d",display:"inline-block"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.zan.apply(void 0,arguments)}}})],1)],1),t.thumbsupFlag?e("v-uni-view",{staticClass:"detail-list-item",style:{padding:"0 40rpx 0 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",textAlign:"center",display:"inline-block",justifyContent:"center",borderRadius:"100rpx",borderWidth:"0 0 0px 0",background:"none",width:"48%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333333",textAlign:"left",display:"inline-block",width:"auto",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("已赞：")]),e("v-uni-view",{style:{width:"auto",flex:"1",display:"inline-block",height:"auto"}},[e("v-uni-view",{style:{margin:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",display:"inline-block"}},[t._v(t._s(t.detail.thumbsupnum))]),e("v-uni-view",{staticClass:"iconfont icon-thumb-up-fill3",style:{lineHeight:"80rpx",fontSize:"48rpx",color:"#ff746d",display:"inline-block"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.zan.apply(void 0,arguments)}}})],1)],1):t._e(),t.thumbsupFlag||t.crazilyFlag?t._e():e("v-uni-view",{staticClass:"detail-list-item",style:{padding:"0 40rpx 0 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",borderRadius:"100rpx",textAlign:"center",borderWidth:"0 0 0px 0",background:"none",display:"inline-block",width:"48%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333333",textAlign:"left",display:"inline-block",width:"auto",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("踩：")]),e("v-uni-view",{style:{width:"auto",flex:"1",display:"inline-block",height:"auto"}},[e("v-uni-view",{style:{margin:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",display:"inline-block"}},[t._v(t._s(t.detail.crazilynum))]),e("v-uni-view",{staticClass:"iconfont icon-thumb-down-line2",style:{lineHeight:"80rpx",fontSize:"48rpx",color:"#ff746d",display:"inline-block"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.cai.apply(void 0,arguments)}}})],1)],1),t.crazilyFlag?e("v-uni-view",{staticClass:"detail-list-item",style:{padding:"0 40rpx 0 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",borderRadius:"100rpx",textAlign:"center",borderWidth:"0 0 0px 0",background:"none",display:"inline-block",width:"48%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333333",textAlign:"left",display:"inline-block",width:"auto",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("踩：")]),e("v-uni-view",{style:{width:"auto",flex:"1",display:"inline-block",height:"auto"}},[e("v-uni-view",{style:{margin:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",display:"inline-block"}},[t._v(t._s(t.detail.crazilynum))]),e("v-uni-view",{staticClass:"iconfont icon-thumb-down-fill2",style:{lineHeight:"80rpx",fontSize:"48rpx",color:"#ff746d",display:"inline-block"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.cai.apply(void 0,arguments)}}})],1)],1):t._e(),e("v-uni-view",{staticClass:"detail-list-item rich",style:{margin:"24rpx 0 24rpx 0",borderColor:"#cccccc",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0 0 0px 0",background:"none",display:"block",width:"100%",borderStyle:"solid",height:"auto"}},[e("v-uni-view",{staticClass:"lable",style:{padding:"0 24rpx 0 64rpx",margin:"0 0 12rpx",color:"#fff",textAlign:"left",background:"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%",width:"100%",lineHeight:"124rpx",fontSize:"28rpx",fontWeight:"500"}},[t._v("电影简介")]),e("v-uni-view",{staticClass:"rich-text",style:{padding:"0px 24rpx 24rpx",margin:"0 0 0 0",lineHeight:"48rpx",color:"#666666"}},[e("v-uni-rich-text",{attrs:{nodes:t.detail.dianyingjianjie}})],1)],1),e("v-uni-view",{staticClass:"time-content",style:{width:"100%",padding:"0",margin:"0 0 24rpx 0",height:"auto"}},[e("v-uni-view",{staticClass:"comoment-header",style:{border:"2rpx solid #ff993350",boxShadow:"0px 0px 0px #cccccc",background:"#ffffff",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[e("v-uni-view",{style:{padding:"0 24rpx 0 24rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333"}},[t._v("评论")]),e("v-uni-view",{staticClass:"btn-comment-content",staticStyle:{display:"flex","align-items":"center"},style:{padding:"0 20rpx 0 20rpx",background:"#fff",display:"flex"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onCommentTap.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"iconfont icon-xinzeng4",style:{margin:"0 8rpx 0 0",lineHeight:"80rpx",fontSize:"32rpx",color:"#ff9933"}}),e("v-uni-view",{style:{color:"#ff9933",lineHeight:"80rpx",fontSize:"28rpx"}},[t._v("添加评论")])],1)],1),t._l(t.commentList,(function(i,n){return e("v-uni-view",{key:n,staticClass:"cu-item comment-item",style:{border:"2rpx solid #ff993350",boxShadow:"-6rpx 0px 0px #ff9933",padding:"20rpx",margin:"40rpx 0 0 0",borderRadius:"0",background:"#ffffff",width:"100%",height:"auto"}},[e("v-uni-view",{style:{width:"100%",display:"block",height:"auto"}},[i.avatarurl?e("v-uni-image",{style:{width:"80rpx",margin:"0 0 0 0",borderRadius:"100rpx",display:"inline-block",height:"80rpx"},attrs:{mode:"aspectFill",src:t.baseUrl+i.avatarurl}}):t._e(),e("v-uni-view",{staticClass:"text-grey",style:{width:"auto",lineHeight:"60rpx",fontSize:"32rpx",color:"#333333",textAlign:"center",display:"inline-block"}},[t._v(t._s(i.nickname))])],1),e("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0 8rpx 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",textIndent:"2em"}},[t._v(t._s(i.content))]),e("v-uni-view",{staticClass:"margin-top-sm text-gray text-df",style:{padding:"0 40rpx",lineHeight:"48rpx",fontSize:"28rpx",color:"#999999",textAlign:"right"}},[t._v(t._s(i.addtime))]),i.reply?e("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0 8rpx 0",lineHeight:"48rpx",fontSize:"28rpx",color:"#666666",textIndent:"2em"}},[t._v("回复:"+t._s(i.reply))]):t._e()],1)}))],2),e("v-uni-view",{staticClass:"bottom-content bg-white tabbar border shop",style:{padding:"0",margin:"20rpx 0 0",flexWrap:"wrap",background:"none",display:"flex",width:"100%",height:"auto"}})],1)],1)],1)],1)],1)},a=[];e.d(i,"b",(function(){return r})),e.d(i,"c",(function(){return a})),e.d(i,"a",(function(){return n}))},cd1a:function(t,i,e){"use strict";e.r(i);var n=e("5040"),r=e.n(n);for(var a in n)"default"!==a&&function(t){e.d(i,t,(function(){return n[t]}))}(a);i["default"]=r.a},f110:function(t,i,e){var n=e("fde5");"string"===typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);var r=e("4f06").default;r("48f98bd2",n,!0,{sourceMap:!1,shadowMode:!1})},fde5:function(t,i,e){var n=e("24fb");i=n(!1),i.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-6273cdaf]{min-height:calc(100vh - 44px);box-sizing:border-box}.seat-list[data-v-6273cdaf]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;background:#fff;margin:%?20?%;border-radius:%?20?%;padding:%?20?%;font-size:%?30?%}.seat-list .seat-item[data-v-6273cdaf]{width:33.33%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;margin-bottom:%?20?%}.seat-list .seat-item .seat-icon[data-v-6273cdaf]{width:%?50?%;height:%?50?%;margin-bottom:%?10?%}uni-audio[data-v-6273cdaf]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}.audio[data-v-6273cdaf] .uni-audio-default{width:inherit}',""]),t.exports=i}}]);