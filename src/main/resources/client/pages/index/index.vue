<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#ff993310","display":"flex","height":"auto"}'>
		<swiper :style='{"width":"100%","margin":"0 0 20rpx 0","background":"#ffffff","height":"360rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#ff9933' indicator-color='#33333330' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"100%","background":"#ffffff","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333333","background":"#ffffff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0px 0px 0px 40rpx","margin":"40rpx 0px 20rpx 0px","borderColor":"#eee","borderRadius":"8rpx","flexWrap":"wrap","background":"none","borderWidth":"0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
            <block v-for="(item,ind) in menuList" v-bind:key="item.roleName">
                <block v-if="ind==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
					<view v-if="menu.childs.length" :style='{"padding":"12rpx 0 12rpx 0","margin":"0px 40rpx 20rpx 0","borderColor":"#ff993360","borderRadius":"0px","borderWidth":"0 0 8rpx","width":"calc(25% - 40rpx)","borderStyle":"double","height":"auto"}' class="menu-list" @tap="menuClick(menu,index)">
						<view class="iconarr" :class="menu.fontClass" :style='{"border":"4rpx solid #ff9933","padding":"0 0 0 0","boxShadow":"6rpx 8rpx 8rpx #dddddd","margin":"0 auto 12rpx auto","color":"#ff9933","textAlign":"center","display":"block","borderRadius":"8rpx","background":"#fff","width":"128rpx","lineHeight":"96rpx","fontSize":"60rpx","height":"96rpx"}'></view>
						<view :style='{"padding":"0 0 0 0","margin":"0px auto 0 auto","color":"#333333","textAlign":"center","width":"100%","lineHeight":"2","fontSize":"26rpx"}'>{{menu.menu}}</view>
					</view>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																										<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>景点信息</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('jingdianxinxi')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homejingdianxinxilist.length > 0" @tap="onDetailTap('jingdianxinxi',homejingdianxinxilist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homejingdianxinxilist[0].jingdianmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejingdianxinxilist[0].jingdiantupian.substring(0,4)=='http'" :src="homejingdianxinxilist[0].jingdiantupian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejingdianxinxilist[0].jingdiantupian?baseUrl+homejingdianxinxilist[0].jingdiantupian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">门票价格:{{homejingdianxinxilist[0].menpiaojiage}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">开放时间:{{homejingdianxinxilist[0].kaifangshijian}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">景点地址:{{homejingdianxinxilist[0].jingdiandizhi}}</view>
			  			  			                			  			                			  			                			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homejingdianxinxilist.length > 1" @tap="onDetailTap('jingdianxinxi',homejingdianxinxilist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homejingdianxinxilist[1].jingdianmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejingdianxinxilist[1].jingdiantupian.substring(0,4)=='http'" :src="homejingdianxinxilist[1].jingdiantupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejingdianxinxilist[1].jingdiantupian?baseUrl+homejingdianxinxilist[1].jingdiantupian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">门票价格:{{homejingdianxinxilist[1].menpiaojiage}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">开放时间:{{homejingdianxinxilist[1].kaifangshijian}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">景点地址:{{homejingdianxinxilist[1].jingdiandizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homejingdianxinxilist.length > 2" @tap="onDetailTap('jingdianxinxi',homejingdianxinxilist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homejingdianxinxilist[2].jingdianmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homejingdianxinxilist[2].jingdiantupian.substring(0,4)=='http'" :src="homejingdianxinxilist[2].jingdiantupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejingdianxinxilist[2].jingdiantupian?baseUrl+homejingdianxinxilist[2].jingdiantupian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">门票价格:{{homejingdianxinxilist[2].menpiaojiage}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">开放时间:{{homejingdianxinxilist[2].kaifangshijian}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">景点地址:{{homejingdianxinxilist[2].jingdiandizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homejingdianxinxilist.length > 3" @tap="onDetailTap('jingdianxinxi',homejingdianxinxilist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homejingdianxinxilist[3].jingdianmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homejingdianxinxilist[3].jingdiantupian.substring(0,4)=='http'" :src="homejingdianxinxilist[3].jingdiantupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejingdianxinxilist[3].jingdiantupian?baseUrl+homejingdianxinxilist[3].jingdiantupian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">门票价格:{{homejingdianxinxilist[3].menpiaojiage}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">开放时间:{{homejingdianxinxilist[3].kaifangshijian}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">景点地址:{{homejingdianxinxilist[3].jingdiandizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homejingdianxinxilist.length > 4" @tap="onDetailTap('jingdianxinxi',homejingdianxinxilist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homejingdianxinxilist[4].jingdianmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejingdianxinxilist[4].jingdiantupian.substring(0,4)=='http'" :src="homejingdianxinxilist[4].jingdiantupian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejingdianxinxilist[4].jingdiantupian?baseUrl+homejingdianxinxilist[4].jingdiantupian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">门票价格:{{homejingdianxinxilist[4].menpiaojiage}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">开放时间:{{homejingdianxinxilist[4].kaifangshijian}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">景点地址:{{homejingdianxinxilist[4].jingdiandizhi}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homejingdianxinxilist.length > 5" @tap="onDetailTap('jingdianxinxi',homejingdianxinxilist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejingdianxinxilist[5].jingdianmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejingdianxinxilist[5].jingdiantupian.substring(0,4)=='http'" :src="homejingdianxinxilist[5].jingdiantupian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejingdianxinxilist[5].jingdiantupian?baseUrl+homejingdianxinxilist[5].jingdiantupian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">门票价格:{{homejingdianxinxilist[5].menpiaojiage}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">开放时间:{{homejingdianxinxilist[5].kaifangshijian}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">景点地址:{{homejingdianxinxilist[5].jingdiandizhi}}</view>
			  			  			                			  			                			  			                			  			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>河湟文化</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('hehuangwenhua')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homehehuangwenhualist.length > 0" @tap="onDetailTap('hehuangwenhua',homehehuangwenhualist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homehehuangwenhualist[0].biaoti}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homehehuangwenhualist[0].fengmian.substring(0,4)=='http'" :src="homehehuangwenhualist[0].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homehehuangwenhualist[0].fengmian?baseUrl+homehehuangwenhualist[0].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homehehuangwenhualist[0].neirongleixing}}</view>
			  			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上传时间:{{homehehuangwenhualist[0].shangchuanshijian}}</view>
			  			  			                			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homehehuangwenhualist.length > 1" @tap="onDetailTap('hehuangwenhua',homehehuangwenhualist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homehehuangwenhualist[1].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homehehuangwenhualist[1].fengmian.substring(0,4)=='http'" :src="homehehuangwenhualist[1].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homehehuangwenhualist[1].fengmian?baseUrl+homehehuangwenhualist[1].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homehehuangwenhualist[1].neirongleixing}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上传时间:{{homehehuangwenhualist[1].shangchuanshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homehehuangwenhualist.length > 2" @tap="onDetailTap('hehuangwenhua',homehehuangwenhualist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homehehuangwenhualist[2].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homehehuangwenhualist[2].fengmian.substring(0,4)=='http'" :src="homehehuangwenhualist[2].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homehehuangwenhualist[2].fengmian?baseUrl+homehehuangwenhualist[2].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homehehuangwenhualist[2].neirongleixing}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上传时间:{{homehehuangwenhualist[2].shangchuanshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homehehuangwenhualist.length > 3" @tap="onDetailTap('hehuangwenhua',homehehuangwenhualist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homehehuangwenhualist[3].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homehehuangwenhualist[3].fengmian.substring(0,4)=='http'" :src="homehehuangwenhualist[3].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homehehuangwenhualist[3].fengmian?baseUrl+homehehuangwenhualist[3].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homehehuangwenhualist[3].neirongleixing}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上传时间:{{homehehuangwenhualist[3].shangchuanshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homehehuangwenhualist.length > 4" @tap="onDetailTap('hehuangwenhua',homehehuangwenhualist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homehehuangwenhualist[4].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homehehuangwenhualist[4].fengmian.substring(0,4)=='http'" :src="homehehuangwenhualist[4].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homehehuangwenhualist[4].fengmian?baseUrl+homehehuangwenhualist[4].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homehehuangwenhualist[4].neirongleixing}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上传时间:{{homehehuangwenhualist[4].shangchuanshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homehehuangwenhualist.length > 5" @tap="onDetailTap('hehuangwenhua',homehehuangwenhualist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homehehuangwenhualist[5].biaoti}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homehehuangwenhualist[5].fengmian.substring(0,4)=='http'" :src="homehehuangwenhualist[5].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homehehuangwenhualist[5].fengmian?baseUrl+homehehuangwenhualist[5].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">内容类型:{{homehehuangwenhualist[5].neirongleixing}}</view>
			  			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">上传时间:{{homehehuangwenhualist[5].shangchuanshijian}}</view>
			  			  			                			  			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
								<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>宣传视频</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('xuanchuanshipin')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homexuanchuanshipinlist.length > 0" @tap="onDetailTap('xuanchuanshipin',homexuanchuanshipinlist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homexuanchuanshipinlist[0].biaoti}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homexuanchuanshipinlist[0].fengmian.substring(0,4)=='http'" :src="homexuanchuanshipinlist[0].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homexuanchuanshipinlist[0].fengmian?baseUrl+homexuanchuanshipinlist[0].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homexuanchuanshipinlist[0].neirongleixing}}</view>
			  			  			                			  			                			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homexuanchuanshipinlist.length > 1" @tap="onDetailTap('xuanchuanshipin',homexuanchuanshipinlist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homexuanchuanshipinlist[1].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homexuanchuanshipinlist[1].fengmian.substring(0,4)=='http'" :src="homexuanchuanshipinlist[1].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homexuanchuanshipinlist[1].fengmian?baseUrl+homexuanchuanshipinlist[1].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homexuanchuanshipinlist[1].neirongleixing}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homexuanchuanshipinlist.length > 2" @tap="onDetailTap('xuanchuanshipin',homexuanchuanshipinlist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homexuanchuanshipinlist[2].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homexuanchuanshipinlist[2].fengmian.substring(0,4)=='http'" :src="homexuanchuanshipinlist[2].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homexuanchuanshipinlist[2].fengmian?baseUrl+homexuanchuanshipinlist[2].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homexuanchuanshipinlist[2].neirongleixing}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homexuanchuanshipinlist.length > 3" @tap="onDetailTap('xuanchuanshipin',homexuanchuanshipinlist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homexuanchuanshipinlist[3].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homexuanchuanshipinlist[3].fengmian.substring(0,4)=='http'" :src="homexuanchuanshipinlist[3].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homexuanchuanshipinlist[3].fengmian?baseUrl+homexuanchuanshipinlist[3].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homexuanchuanshipinlist[3].neirongleixing}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homexuanchuanshipinlist.length > 4" @tap="onDetailTap('xuanchuanshipin',homexuanchuanshipinlist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homexuanchuanshipinlist[4].biaoti}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homexuanchuanshipinlist[4].fengmian.substring(0,4)=='http'" :src="homexuanchuanshipinlist[4].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homexuanchuanshipinlist[4].fengmian?baseUrl+homexuanchuanshipinlist[4].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">内容类型:{{homexuanchuanshipinlist[4].neirongleixing}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homexuanchuanshipinlist.length > 5" @tap="onDetailTap('xuanchuanshipin',homexuanchuanshipinlist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homexuanchuanshipinlist[5].biaoti}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homexuanchuanshipinlist[5].fengmian.substring(0,4)=='http'" :src="homexuanchuanshipinlist[5].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homexuanchuanshipinlist[5].fengmian?baseUrl+homexuanchuanshipinlist[5].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">内容类型:{{homexuanchuanshipinlist[5].neirongleixing}}</view>
			  			  			                			  			                			  			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
								<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>电影推荐</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('dianyingtuijian')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homedianyingtuijianlist.length > 0" @tap="onDetailTap('dianyingtuijian',homedianyingtuijianlist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homedianyingtuijianlist[0].dianyingmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homedianyingtuijianlist[0].dianyingfengmian.substring(0,4)=='http'" :src="homedianyingtuijianlist[0].dianyingfengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homedianyingtuijianlist[0].dianyingfengmian?baseUrl+homedianyingtuijianlist[0].dianyingfengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">导演:{{homedianyingtuijianlist[0].daoyan}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">主演:{{homedianyingtuijianlist[0].zhuyan}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上映时间:{{homedianyingtuijianlist[0].shangyingshijian}}</view>
			  			  			                			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homedianyingtuijianlist.length > 1" @tap="onDetailTap('dianyingtuijian',homedianyingtuijianlist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homedianyingtuijianlist[1].dianyingmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homedianyingtuijianlist[1].dianyingfengmian.substring(0,4)=='http'" :src="homedianyingtuijianlist[1].dianyingfengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homedianyingtuijianlist[1].dianyingfengmian?baseUrl+homedianyingtuijianlist[1].dianyingfengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">导演:{{homedianyingtuijianlist[1].daoyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">主演:{{homedianyingtuijianlist[1].zhuyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上映时间:{{homedianyingtuijianlist[1].shangyingshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homedianyingtuijianlist.length > 2" @tap="onDetailTap('dianyingtuijian',homedianyingtuijianlist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homedianyingtuijianlist[2].dianyingmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homedianyingtuijianlist[2].dianyingfengmian.substring(0,4)=='http'" :src="homedianyingtuijianlist[2].dianyingfengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homedianyingtuijianlist[2].dianyingfengmian?baseUrl+homedianyingtuijianlist[2].dianyingfengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">导演:{{homedianyingtuijianlist[2].daoyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">主演:{{homedianyingtuijianlist[2].zhuyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上映时间:{{homedianyingtuijianlist[2].shangyingshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homedianyingtuijianlist.length > 3" @tap="onDetailTap('dianyingtuijian',homedianyingtuijianlist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homedianyingtuijianlist[3].dianyingmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homedianyingtuijianlist[3].dianyingfengmian.substring(0,4)=='http'" :src="homedianyingtuijianlist[3].dianyingfengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homedianyingtuijianlist[3].dianyingfengmian?baseUrl+homedianyingtuijianlist[3].dianyingfengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">导演:{{homedianyingtuijianlist[3].daoyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">主演:{{homedianyingtuijianlist[3].zhuyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上映时间:{{homedianyingtuijianlist[3].shangyingshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homedianyingtuijianlist.length > 4" @tap="onDetailTap('dianyingtuijian',homedianyingtuijianlist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">{{homedianyingtuijianlist[4].dianyingmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homedianyingtuijianlist[4].dianyingfengmian.substring(0,4)=='http'" :src="homedianyingtuijianlist[4].dianyingfengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homedianyingtuijianlist[4].dianyingfengmian?baseUrl+homedianyingtuijianlist[4].dianyingfengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">导演:{{homedianyingtuijianlist[4].daoyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">主演:{{homedianyingtuijianlist[4].zhuyan}}</view>
				  				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">上映时间:{{homedianyingtuijianlist[4].shangyingshijian}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homedianyingtuijianlist.length > 5" @tap="onDetailTap('dianyingtuijian',homedianyingtuijianlist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homedianyingtuijianlist[5].dianyingmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homedianyingtuijianlist[5].dianyingfengmian.substring(0,4)=='http'" :src="homedianyingtuijianlist[5].dianyingfengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homedianyingtuijianlist[5].dianyingfengmian?baseUrl+homedianyingtuijianlist[5].dianyingfengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">导演:{{homedianyingtuijianlist[5].daoyan}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">主演:{{homedianyingtuijianlist[5].zhuyan}}</view>
			  			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">上映时间:{{homedianyingtuijianlist[5].shangyingshijian}}</view>
			  			  			                			  			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
								<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"4"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"12rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>音乐推荐</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('yinletuijian')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homeyinletuijianlist.length > 0" @tap="onDetailTap('yinletuijian',homeyinletuijianlist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			  			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeyinletuijianlist[0].fengmian.substring(0,4)=='http'" :src="homeyinletuijianlist[0].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeyinletuijianlist[0].fengmian?baseUrl+homeyinletuijianlist[0].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌名:{{homeyinletuijianlist[0].songname}}</view>
			  			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌手:{{homeyinletuijianlist[0].singer}}</view>
			  			  			                			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homeyinletuijianlist.length > 1" @tap="onDetailTap('yinletuijian',homeyinletuijianlist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeyinletuijianlist[1].fengmian.substring(0,4)=='http'" :src="homeyinletuijianlist[1].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeyinletuijianlist[1].fengmian?baseUrl+homeyinletuijianlist[1].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌名:{{homeyinletuijianlist[1].songname}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌手:{{homeyinletuijianlist[1].singer}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homeyinletuijianlist.length > 2" @tap="onDetailTap('yinletuijian',homeyinletuijianlist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homeyinletuijianlist[2].fengmian.substring(0,4)=='http'" :src="homeyinletuijianlist[2].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeyinletuijianlist[2].fengmian?baseUrl+homeyinletuijianlist[2].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌名:{{homeyinletuijianlist[2].songname}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌手:{{homeyinletuijianlist[2].singer}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homeyinletuijianlist.length > 3" @tap="onDetailTap('yinletuijian',homeyinletuijianlist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homeyinletuijianlist[3].fengmian.substring(0,4)=='http'" :src="homeyinletuijianlist[3].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeyinletuijianlist[3].fengmian?baseUrl+homeyinletuijianlist[3].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌名:{{homeyinletuijianlist[3].songname}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌手:{{homeyinletuijianlist[3].singer}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homeyinletuijianlist.length > 4" @tap="onDetailTap('yinletuijian',homeyinletuijianlist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				  				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeyinletuijianlist[4].fengmian.substring(0,4)=='http'" :src="homeyinletuijianlist[4].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","borderRadius":"8rpx","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeyinletuijianlist[4].fengmian?baseUrl+homeyinletuijianlist[4].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌名:{{homeyinletuijianlist[4].songname}}</view>
				  				  				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"64rpx"}' class="title ">歌手:{{homeyinletuijianlist[4].singer}}</view>
				  				  				                    				  				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homeyinletuijianlist.length > 5" @tap="onDetailTap('yinletuijian',homeyinletuijianlist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homeyinletuijianlist[5].fengmian.substring(0,4)=='http'" :src="homeyinletuijianlist[5].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homeyinletuijianlist[5].fengmian?baseUrl+homeyinletuijianlist[5].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">歌名:{{homeyinletuijianlist[5].songname}}</view>
			  			  			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">歌手:{{homeyinletuijianlist[5].singer}}</view>
			  			  			                			  			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																														<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
														<view class="listBox news" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"none","order":"11"}'>
			<view v-if="false && 3 == 1" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"32rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231205/27b350199c7f4e399e889fe0209a6dea.png) no-repeat center top / 100% 100%","height":"auto"}'>
				<view :style='{"padding":"8rpx 60rpx 8rpx 120rpx","color":"#fff","borderRadius":"8rpx","background":"none","display":"inline-block","fontSize":"32rpx","lineHeight":"48rpx","minWidth":"300rpx","fontWeight":"500"}'>公告资讯</view>
				<text :style='{"margin":"10rpx 0 0 0","color":"#fcfcfc","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"48rpx","float":"right"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  <view class="news-box2" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<block v-for="(item,index) in news" :key="index">
			  <view @tap="onNewsDetailTap(item.id)" v-if="index==0" class="list-item" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" class="listmpic" :src="baseUrl+item.picture"></image>
				<view :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","backgroundColor":"#00000030","whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","left":"0","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","position":"absolute","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{item.title}}</view>
			  </view>
			  <view @tap="onNewsDetailTap(item.id)" v-if="index>0" class="list-item" :style='{"width":"100%","height":"auto"}'>
				<view :style='{"padding":"0 20rpx","borderColor":"#ff993350","overflow":"hidden","whiteSpace":"nowrap","color":"#666","borderWidth":"0 0 2rpx 0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","textOverflow":"ellipsis","borderStyle":"dashed","height":"88rpx"}' class="title ">{{item.title}}</view>
			  </view>
			</block>
		  </view>
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  			
			<view v-if="false && 3 == 3" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																																																		<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				homejingdianxinxilist: [],
				homehehuangwenhualist: [],
				homexuanchuanshipinlist: [],
				homedianyingtuijianlist: [],
				homeyinletuijianlist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			let role = '管理员'
			this.menuList.forEach((item,key) => {
			    if(role==item.roleName) {
			        item.frontMenu.forEach((item2,key2) => {
						if(item2.child.length) {
							item2.childs = []
						    item2.child.forEach((item3,key3)=>{
								if(item3.buttons.indexOf("查看")>-1){
									item2.childs.push(item3)
									this.swiperMenuList.push(item3);
								}
							})
						}
			            
			        })
			    }
			})
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			// 公告资讯
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list


			res = await this.$api.list('jingdianxinxi', {
				page: 1,

				limit: 6
			});
			this.homejingdianxinxilist = res.data.list
			res = await this.$api.list('hehuangwenhua', {
				page: 1,

				limit: 6
			});
			this.homehehuangwenhualist = res.data.list
			res = await this.$api.list('xuanchuanshipin', {
				page: 1,

				limit: 6
			});
			this.homexuanchuanshipinlist = res.data.list
			res = await this.$api.list('dianyingtuijian', {
				page: 1,

				limit: 6
			});
			this.homedianyingtuijianlist = res.data.list
			res = await this.$api.list('yinletuijian', {
				page: 1,

				limit: 6
			});
			this.homeyinletuijianlist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(tableName=='news'){
					uni.navigateTo({
						url: `../news-list/news-list`,
						fail: function(){
							uni.switchTab({
								url: `../news-list/news-list`
							});
						}
					});
					return false
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
			menuClick(menu, index) {
				if (menu.childs.length > 0 && menu.childs.length == 1) {
					uni.navigateTo({
						url: `../${menu.childs[0].tableName}/list`,
						fail: function() {
							uni.switchTab({
								url: `../${menu.childs[0].tableName}/list`
							});
						}
					});
				} else if (menu.childs.length > 1) {
					let arr = []
					for(let x in menu.childs){
						arr.push(menu.childs[x].menu.length>6?menu.childs[x].menu.substring(0,6):menu.childs[x].menu)
					}
					uni.showActionSheet({
						itemList: arr,
						success: function (res) {
							uni.navigateTo({
								url: `../${menu.childs[res.tapIndex].tableName}/list`,
								fail: function() {
									uni.switchTab({
										url: `../${menu.childs[res.tapIndex].tableName}/list`
									});
								}
							});
						}
					});
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
