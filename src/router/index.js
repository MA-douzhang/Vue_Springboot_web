import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'FrontApp',
      component:() => import('../view/Front'),
      children: [
        {
          path: '/',
          redirect: '/home'
        }, {
          path: '/home',
          name: 'home',
          component:() => import('../view/HomePage'),
          meta: {
            title: '首页'
          }
        }, {
          path: '/software',
          name: 'software',
          component:() => import('../view/Software'),
          meta: {
            title: '软件产品'
          },
          children: [
            {
              path: '/software',
              redirect: '/software/smartTown'
            },
            {
              path: '/software/smartTown',
              name: 'software',
              component:() => import('../view/Software_smartTown'),
              meta: {
                title: '软件产品丨智能小镇管理系统'
              }
            },
            {
              path: '/software/bigData',
              name: 'software',
              component:() => import('../view/Software_bigData'),
              meta: {
                title: '软件产品丨大数据管理系统'
              }
            }
          ]
        }, {
          path: '/service',
          name: 'service',
          component:() => import('../view/Service'),
          meta: {
            title: '相关服务'
          }
        }, {
          path: '/newsinformation',
          name: 'newsinformation',
          component:() => import('../view/NewsInformation'),
          meta: {
            title: '新闻动态'
          }
        }, {
          path: '/companyintroduction',
          name: 'companyintroduction',
          component:() => import('../view/CompanyIntroduction'),
          meta: {
            title: '公司介绍'
          }
        }, {
          path: '/jobchance',
          name: 'jobchance',
          component:() => import('../view/JobChance'),
          meta: {
            title: '工作机会'
          }
        }, {
          path: '/contactus',
          name: 'contactus',
          component:() => import('../view/ContactUs'),
          meta: {
            title: '联系我们'
          }
        },
        {
          path: '/servicedetail',
          name: 'servicedetail',
          component:() => import('../view/ServiceDetail'),
          meta: {
            title: '相关服务'
          }
        }
      ]
    },
    {
      path: '/backApp',
      name: 'BackApp',
      component:() => import('../view/back/BackApp')
    }
  ]
})
