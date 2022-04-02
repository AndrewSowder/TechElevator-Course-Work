 <template>
 <review-display>
  <review-list>  
</template>
<script>
import ReviewDisplay from './ReviewDisplay.vue';
import ReviewList from './ReviewList.vue';
export default {
  components: { ReviewList, ReviewDisplay },
  name: "review-table"
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
.stars {
  display: flex;
}
</style>
