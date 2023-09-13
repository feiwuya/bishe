<template>
    <div class="sidebar">
        <div class="title">
            云考管理平台
        </div>
        <div class="menu-items">
            <RouterLink to="/" active-class="active" exact tag="button" class="side-btn">
                <div class="link-container">
                    监控面板
                </div>
            </RouterLink>
            <RouterLink to="/page1" active-class="active" exact tag="button" class="side-btn">
                <div class="link-container">
                    用户管理
                </div>
            </RouterLink>
            <RouterLink to="/page2" active-class="active" exact tag="button" class="side-btn">
                <div class="link-container">
                    题目管理
                </div>
            </RouterLink>
            <RouterLink to="/page3" active-class="active" exact tag="button" class="side-btn">
                <div class="link-container">
                    页面3
                </div>
            </RouterLink>
            <RouterLink to="/page4" active-class="active" exact tag="button" class="side-btn">
                <div class="link-container">
                    页面4
                </div>
            </RouterLink>
        </div>
    </div>
</template>
<script>
import { RouterLink } from 'vue-router';

</script>

<style scoped>
.title {
    color: white;
    font-size: 24px;
    margin-top: 50px;
}

.menu-items {
    display: flex;
    flex-direction: column;
    margin-top: 20px;
    margin-left: 6px;
}

.menu-items> * {
    margin-top: 60px;
}

.side-btn:focus {
    outline: none;
}

.side-btn.active {
    position: relative;
    background-color: white;
    color: teal;
    font-weight: 500;
    margin-left: 10px;
    border-radius: 30px 0 0 30px;


}

.active::before {
    position: absolute;
    content: "";
    top: -30px;
    right: 0;
    height: 30px;
    width: 30px;
    background-color: white;
}

.active::after {
    position: absolute;
    content: "";
    bottom: -30px;
    right: 0;
    height: 30px;
    width: 30px;
    background-color: white;
}

.side-btn {
    border: none;
    padding: 25px 0px;
    cursor: pointer;
    font-size: 16px;
    color: white;
    background-color: transparent;
}
.side-btn.active .link-container::before {
    position: absolute;
    top: -60px;
    right: 0;
    content: "";
    height: 60px;
    width: 60px;
    border-radius: 50%;
    background-color: teal;
}

.side-btn.active .link-container::after {
    position: absolute;
    bottom: -60px;
    right: 0;
    content: "";
    height: 60px;
    width: 60px;
    border-radius: 50%;
    background-color: teal;
    z-index: 99;
}
</style>
