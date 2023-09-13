<script setup>
import DashBoard from './views/DashBoard.vue';
</script>

<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: 'Roboto', sans-serif;
  -webkit-font-somoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

</style>
