import axios from 'axios';


const http = axios.create({
  baseURL: "https://api.dictionaryapi.dev"
})

export default {
    

  getDefinition(word) {
    return http.get(`/api/v2/entries/en/${word}`);
  }

}