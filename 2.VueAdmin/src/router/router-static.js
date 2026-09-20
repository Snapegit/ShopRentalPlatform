import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import dianpuxinxi from '@/views/modules/dianpuxinxi/list'
    import zujinxinxi from '@/views/modules/zujinxinxi/list'
    import zuke from '@/views/modules/zuke/list'
    import storeup from '@/views/modules/storeup/list'
    import qiuzushenqing from '@/views/modules/qiuzushenqing/list'
    import tousujianyi from '@/views/modules/tousujianyi/list'
    import jiaofeixinxi from '@/views/modules/jiaofeixinxi/list'
    import systemintro from '@/views/modules/systemintro/list'
    import discussdianpuxinxi from '@/views/modules/discussdianpuxinxi/list'
    import fangdong from '@/views/modules/fangdong/list'
    import tuizushenqing from '@/views/modules/tuizushenqing/list'
    import config from '@/views/modules/config/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '平台公告',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/dianpuxinxi',
        name: '店铺信息',
        component: dianpuxinxi
      }
      ,{
	path: '/zujinxinxi',
        name: '租金信息',
        component: zujinxinxi
      }
      ,{
	path: '/zuke',
        name: '租客',
        component: zuke
      }
      ,{
	path: '/storeup',
        name: '我的收藏',
        component: storeup
      }
      ,{
	path: '/qiuzushenqing',
        name: '求租申请',
        component: qiuzushenqing
      }
      ,{
	path: '/tousujianyi',
        name: '投诉建议',
        component: tousujianyi
      }
      ,{
	path: '/jiaofeixinxi',
        name: '缴费信息',
        component: jiaofeixinxi
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/discussdianpuxinxi',
        name: '店铺信息评论',
        component: discussdianpuxinxi
      }
      ,{
	path: '/fangdong',
        name: '房东',
        component: fangdong
      }
      ,{
	path: '/tuizushenqing',
        name: '退租申请',
        component: tuizushenqing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/newstype',
        name: '平台公告分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
