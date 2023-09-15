<template>
<div class="overview">
    <div class="dashboard">
        <div class="head">
            早上好！管理员
        </div>
        <div class="card">

        </div>
    </div>
</div>
</template>

<script>
export default {
    beforeCreate: function() {
        console.log('test');
    }
}
</script>

<style scoped>

.overview {
    padding: 40px;
}
.head{
    font-size: 30px;
    font-weight: 900;
    color: teal;
    font-style: italic;
    text-align: left;
    margin-bottom: 30px;
}

.card {
    width: 400px;
    height: 300px;
    background-color: #000;
    border-radius: 20px;
    background-image: linear-gradient(to right, #80CF7F 0%, #B9E576 100%);
}


</style>