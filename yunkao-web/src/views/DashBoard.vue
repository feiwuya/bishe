<template>
  <div class="dashboard">
    <Sidebar />
    <div class="content">
      <RouterView />
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
  widows: 100vm;
}

.content {
  background-color: white;
  border-radius: 20px;
  margin: 6px 6px 6px 0px;
}
</style>