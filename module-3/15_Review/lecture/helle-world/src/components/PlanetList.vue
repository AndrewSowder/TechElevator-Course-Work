<template>
  <div>
    <ol>
      <li
        v-for="planet in planets"
        :key="planet"
        v-on:click="placeOnTop(planet)"
      >
        {{ planet }}
      </li>
    </ol>
  </div>
</template>

<script>
export default {
  data() {
    return {
      planets: ["Mercury", "Venus", "Earth", "Mars", "Gas Giants"],
    };
  },
  methods: {
    placeOnTop(planet) {
      let planetIdx = this.planets.indexOf(planet);
      this.planets.splice(planetIdx, 1);
      this.planets.unshift(planet);
    },
  },
};
</script>

<style></style>
