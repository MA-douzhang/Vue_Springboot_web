<template>
<div id="BackApp">
  <el-container>
    <el-aside width="sideWidth+px" style="background-color: rgb(238, 241, 246); box-shadow: 2px 0 6px rgb(0 21 41 / 35%)" >
      <BackAside :isCollapse="isCollapse"/>
    </el-aside>

    <el-container>
      <el-header style=" font-size: 12px;border-bottom: 1px solid #ccc">
        <BackHeader :collapseBtnClass="collapseBtnClass" :collapse="collapse" :user="user"/>
      </el-header>

      <el-main :style="{ height: screenHeight + 'px' }">
        <!--          表示当前页面子路由显示-->
        <router-view @refreshUser="getUser"/>
      </el-main>

    </el-container>
  </el-container>
</div>
</template>

<script>
import BackAside from "../../components/BackAside";
import BackHeader from "../../components/BackHeader";
export default {
  name: "BackApp",
  components: {BackHeader, BackAside},
  component:{
    BackHeader,
    BackAside
  }
}
</script>

<style scoped>

</style>
