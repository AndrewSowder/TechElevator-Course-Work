import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    planets: ["Mercury", "Venus", "Earth", "Mars", "Gas Giants"],
  },
  mutations: {

    PLACE_ON_TOP(state, planet){

      let planetIdx = state.planets.indexOf(planet);
      state.planets.splice(planetIdx, 1);
      state.planets.unshift(planet);

    },

    ADD_PLANET(state, newPlanet){

      state.planets.push(newPlanet)

    },


  },
  actions: {
  },
  modules: {
  }
})
