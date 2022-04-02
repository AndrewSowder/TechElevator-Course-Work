<template>
  <div>
    <ol>
      <li v-for="planet in $store.state.planets" :key="planet" v-on:click="placeOnTop(planet)" >  {{ planet }} </li>
    </ol>
    <input type="text" href="inputPlanet" v-model="newPlanet" v-on:keypress.enter="addPlanet(newPlanet)" > 
    <button v-on:click="addPlanet(newPlanet)">Add Planet</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      newPlanet: ''
    };
  },
  methods: {
    placeOnTop(planet) {
     /*  let planetIdx = this.planets.indexOf(planet);
      this.planets.splice(planetIdx, 1);
      this.planets.unshift(planet); */
      this.$store.commit('PLACE_ON_TOP', planet)
    },

    addPlanet(newPlanet){
        this.$store.commit('ADD_PLANET', newPlanet )
        this.newPlanet = '';        
    }
  },
};
</script>

<style></style>
