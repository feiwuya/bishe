import Vue from 'vue'
import VueRouter from 'vue-router'
import DashBoard from '../views/DashBoard.vue'
Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  base: import.meta.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: DashBoard,
      children: [
        {
          path: '',
          component: () => import('../views/Overview.vue')
        },
        {
          path: '/app',
          component: () => import('../views/AppManager.vue')
        },
        {
          path: '/page2',
          component: () => import('../views/Page2.vue')
        },
        {
          path: '/page3',
          component: () => import('../views/Page3.vue')
        },
        {
          path: '/page4',
          component: () => import('../views/Page4.vue')
        },
      ]
    },
  ]
})

export default router
