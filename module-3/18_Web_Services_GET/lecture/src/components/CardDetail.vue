<template>
  <div>
    <h1>{{ card.title }}</h1>
    <p> {{card.description}}</p>
  </div>
</template>

<script>
import boardsService from '@/services/BoardService'

export default {
  name: "card-detail",

  data(){
    return {
      card: {},
    }
  },
  created(){
    const boardID = this.$route.params.boardID;
    const cardID = this.$route.params.cardID;
    boardsService.getCard(boardID, cardID).then(card => {
      this.card = card;
      this.isLoading = false;
    });
    
  
  }

};
</script>
