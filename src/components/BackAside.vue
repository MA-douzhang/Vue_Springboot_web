<template>
  <el-menu :default-openeds="['1', '3']" style="height: 100%;overflow-x: hidden"
           background-color="rgb(48, 65, 86)"
           text-color="#fff"
           :collapse-transition="false"
           :collapse="isCollapse"
           router
  >
    <div style="height: 60px;line-height: 60px;text-align: center">
      <img src="../assets/logo.png" alt="" style="width: 20px;position: relative;top: 5px;margin-right: 5px">
      <b style="color: white" v-show="!isCollapse">后台管理系统</b>
    </div>
    <div v-for="item in menus" :key="item.id">
      <div v-if="item.path">
        <el-menu-item :index="item.path">
          <i :class="item.icon"></i>
          <span slot="title">{{item.username}}</span>
        </el-menu-item>
      </div>
      <div v-else>
        <el-submenu :index="item.id + ''">
          <template slot="title">
            <i :class="item.icon"></i>
            <span slot="title">{{item.username}}</span>
          </template>
          <div v-for="subItem in item.children" :key="subItem.id">
            <el-menu-item :index="subItem.path">
              <i :class="subItem.icon"></i>
              <span slot="title">{{subItem.username}}</span>
            </el-menu-item>
          </div>
        </el-submenu>
      </div>
    </div>
  </el-menu>
</template>
<script>
export default {
  name: "BackAside"
}
</script>

<style >

</style>
