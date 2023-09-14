<template>
  <div class="dashboard">

    <Sidebar />

    <div class="content-container">

      <div class="menu-bar">

      </div>

      <div class="content">
        <RouterView />
      </div>

    </div>

  </div>
</template>

<script>
import { RouterView } from 'vue-router';
import Sidebar from '../components/Sidebar.vue'
export default {
  name: 'Home',
  components: {
    Sidebar,
    RouterView
  }
}
</script>

<style scoped>
.dashboard {
  display: grid;
  grid-template-columns: 1fr 5fr;
  background-color: teal;
  height: 100vh;
  width: 100vm;
}

.content {
  background-color: white;
  border-radius: 20px;
  margin: 6px 6px 6px 0px;
}

.content-container {
  display: grid;
  grid-template-rows: auto 1fr;
}

.menu-bar {
  display: flex;
  background-color: #fff;
  margin: 6px 6px 6px 0px;
  border-radius: 10px;
  height: 80px;
  justify-content: center;
  align-items: center;
}
</style>