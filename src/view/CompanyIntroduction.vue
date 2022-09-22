<template>
    <div id="CompanyIntroduction">
        <div class="banner container-fuild text-center">关于我们</div>
        <div class="container">
            <div class="row CompanyIntroduction-container">
                <div class="col-xs-12 col-sm-12 col-md-6 wow zoomIn">
                    <img class="img-responsive center-block" src="@/assets/img/about_img.png">
                </div>
                <div class="col-xs-12 col-sm-12 col-md-6">
                    <h3>校园星系有限公司</h3>
<!--                    <p class=".text-justify">{{res.length}}</p>-->
                    <p class=".text-justify">应用程序以交友为基础，致力于营造3D化数字时代的互动性和创造性，将线上平面转化成立体表现，努力营造趣味性和创新力共存在社交局面。同时针对大学生配置设立服务型功能，旨在给大学生带来高效率、多功能、低时间成本的社交匹配模式。</p>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import { WOW } from 'wowjs';
export default {
    name: 'CompanyIntroduction',
    data(){
        return{
          // res:[]
        }
    },
    methods: {

    },
  created() {
    // fetch("http://localhost:9091/").then(res =>res.json()).then(res =>{
    //   console.log(res)
    //   this.res=res
    //   console.log(res.length)
    // })
  },
  mounted(){
        var wow = new WOW();
        wow.init();
    }
}
</script>
<style scoped>
.banner{
    color: #fff;
    font-size: 30px;
    height: 150px;
    line-height: 150px;
    background-image: url('../assets/img/banner1.png');
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: scroll;
    background-position: center center;
}
.row{
    margin-right: 0;
    margin-left: 0;
}
.CompanyIntroduction-container{
    padding: 100px 0;
    color: #808080;
    transition: all ease 0.5s;
}
.CompanyIntroduction-container>div>p{
    font-size: 14px;
    line-height: 2.5rem;
}
@media screen and (max-width: 997px){
    .CompanyIntroduction-container{
    padding: 10px 0;
    color: #808080;
}
}
</style>

