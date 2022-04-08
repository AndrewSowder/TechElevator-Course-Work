
        import java.lang.reflect.Array;
        import java.util.*;
        class listUtil {

            public static void main(String[] args) {

                List<String> stringlst = new ArrayList <>(Arrays.asList("Apple", "Apple",  "Banana", "Apple", "Banana", "Banana", "Banana")) {
                };


                getMostCommon(stringlst);
            }


            static String getMostCommon(List<String> stringList) {

                Map<String, Integer> common = new HashMap<>();

                Integer count = 1;
                Integer max = 0;
                String finalKey = "";

                for (String string : stringList) {
                    if(!common.containsKey(string)) {
                        common.put(string, count);
                    }else {
                        common.put(string, common.get(string).intValue() + count);
                    }
                }
                for (String key : common.keySet()){
                    if(common.get(key) > max){
                        max = common.get(key);
                        finalKey = key;
                    }

                }
                System.out.println(finalKey);
                return finalKey;




            }
        }


