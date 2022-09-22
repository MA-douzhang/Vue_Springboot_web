<template>
<div style="line-height: 60px;display: flex">
    <div style="flex: 1;font-size: 18px">
      <span :class="collapseBtnClass" style="cursor: pointer" @click="collapse"></span>
    </div>
    <el-dropdown style="width: 120px;cursor: pointer">
      <div style="display: inline-block">
        <img :src="user.avatarUrl" alt="" style="width: 30px; border-radius: 50%;position: relative;top: 10px;right: 5px">
        <span>{{user.nickname}}</span><i class="el-icon-arrow-down"style="margin: 5px" ></i>
      </div>
      <el-dropdown-menu slot="dropdown" style="width: 100px;text-align: center">
        <el-dropdown-item style="font-size: 14px;padding: 5px 0">
          <router-link to="/person">个人信息</router-link>
        </el-dropdown-item>
        <el-dropdown-item style="font-size: 14px;padding: 5px 0">
          <span style="text-decoration: none" @click="logout">退出</span>
        </el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>
</div>
</template>

<script>
import {resetRouter} from "@/router";

export default {
  name: "BackHeader",
  props:{
    collapseBtnClass:String,
    collapse:"",
    user:Object
  },
  data(){
    return{

    }
  },
  methods:{
    logout(){
      localStorage.removeItem("user")
      localStorage.removeItem("menus")
      this.$message.success("退出成功")
      this.$router.push("/login")

      //重置路由
      resetRouter()
    },
  }
}
</script>

<style scoped>

</style>
