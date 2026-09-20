import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import zukeList from '../pages/zuke/list'
import zukeDetail from '../pages/zuke/detail'
import zukeAdd from '../pages/zuke/add'
import fangdongList from '../pages/fangdong/list'
import fangdongDetail from '../pages/fangdong/detail'
import fangdongAdd from '../pages/fangdong/add'
import dianpuxinxiList from '../pages/dianpuxinxi/list'
import dianpuxinxiDetail from '../pages/dianpuxinxi/detail'
import dianpuxinxiAdd from '../pages/dianpuxinxi/add'
import qiuzushenqingList from '../pages/qiuzushenqing/list'
import qiuzushenqingDetail from '../pages/qiuzushenqing/detail'
import qiuzushenqingAdd from '../pages/qiuzushenqing/add'
import tuizushenqingList from '../pages/tuizushenqing/list'
import tuizushenqingDetail from '../pages/tuizushenqing/detail'
import tuizushenqingAdd from '../pages/tuizushenqing/add'
import zujinxinxiList from '../pages/zujinxinxi/list'
import zujinxinxiDetail from '../pages/zujinxinxi/detail'
import zujinxinxiAdd from '../pages/zujinxinxi/add'
import jiaofeixinxiList from '../pages/jiaofeixinxi/list'
import jiaofeixinxiDetail from '../pages/jiaofeixinxi/detail'
import jiaofeixinxiAdd from '../pages/jiaofeixinxi/add'
import tousujianyiList from '../pages/tousujianyi/list'
import tousujianyiDetail from '../pages/tousujianyi/detail'
import tousujianyiAdd from '../pages/tousujianyi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussdianpuxinxiList from '../pages/discussdianpuxinxi/list'
import discussdianpuxinxiDetail from '../pages/discussdianpuxinxi/detail'
import discussdianpuxinxiAdd from '../pages/discussdianpuxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'zuke',
					component: zukeList
				},
				{
					path: 'zukeDetail',
					component: zukeDetail
				},
				{
					path: 'zukeAdd',
					component: zukeAdd
				},
				{
					path: 'fangdong',
					component: fangdongList
				},
				{
					path: 'fangdongDetail',
					component: fangdongDetail
				},
				{
					path: 'fangdongAdd',
					component: fangdongAdd
				},
				{
					path: 'dianpuxinxi',
					component: dianpuxinxiList
				},
				{
					path: 'dianpuxinxiDetail',
					component: dianpuxinxiDetail
				},
				{
					path: 'dianpuxinxiAdd',
					component: dianpuxinxiAdd
				},
				{
					path: 'qiuzushenqing',
					component: qiuzushenqingList
				},
				{
					path: 'qiuzushenqingDetail',
					component: qiuzushenqingDetail
				},
				{
					path: 'qiuzushenqingAdd',
					component: qiuzushenqingAdd
				},
				{
					path: 'tuizushenqing',
					component: tuizushenqingList
				},
				{
					path: 'tuizushenqingDetail',
					component: tuizushenqingDetail
				},
				{
					path: 'tuizushenqingAdd',
					component: tuizushenqingAdd
				},
				{
					path: 'zujinxinxi',
					component: zujinxinxiList
				},
				{
					path: 'zujinxinxiDetail',
					component: zujinxinxiDetail
				},
				{
					path: 'zujinxinxiAdd',
					component: zujinxinxiAdd
				},
				{
					path: 'jiaofeixinxi',
					component: jiaofeixinxiList
				},
				{
					path: 'jiaofeixinxiDetail',
					component: jiaofeixinxiDetail
				},
				{
					path: 'jiaofeixinxiAdd',
					component: jiaofeixinxiAdd
				},
				{
					path: 'tousujianyi',
					component: tousujianyiList
				},
				{
					path: 'tousujianyiDetail',
					component: tousujianyiDetail
				},
				{
					path: 'tousujianyiAdd',
					component: tousujianyiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussdianpuxinxi',
					component: discussdianpuxinxiList
				},
				{
					path: 'discussdianpuxinxiDetail',
					component: discussdianpuxinxiDetail
				},
				{
					path: 'discussdianpuxinxiAdd',
					component: discussdianpuxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
