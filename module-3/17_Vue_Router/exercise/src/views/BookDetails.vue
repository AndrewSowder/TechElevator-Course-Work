<template>
  <div id="app" class="main">
    
    <h2 class="book-title">{{ book.title }}</h2>
    <h2 class="book-author">{{ book.author }}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h3> {{book.read ? "I have read this book" : "I haven't read this book" }}</h3>
    


  </div>
</template>

<script>
export default {
    name:"book-details",

     computed: {
        book(){
            return this.$store.state.books.find(b => b.isbn == this.$route.params.isbn);
        }

    },

}
</script>

<style>

</style>