import java.util.*;

/**
 * @author created by Ying
 * Date: 2018-09-07
 */
public class DemoCollections {
    public static int countUniqueWords(List<String> words){
        Set<String> uniqueSet = new HashSet<>();
        for(String ithword : words){
            uniqueSet.add(ithword);
        }
        //Set<String> uniqueSet = new HashSet<>(words);
   /*     for (int i = 0; i < words.size(); i++){
            if (uniqueSet.contains(words.get(i))) {
                break;
            } else {
                uniqueSet.add(words.get(i));
            }
        }*/
        return uniqueSet.size();
    }

    public static Map<String, Integer> collectWordCount(List<String> words){
        Map<String, Integer> wordmap = new HashMap<>();
        for( String w : words ){
            if (wordmap.containsKey(w)){
                int i = wordmap.get(w);
                wordmap.put(w, i+1);
            } else {
                wordmap.put(w, 1);
            }
        }
         return wordmap;
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("i");
        list.add("like");
        list.add("always");
        list.add("tempor");
        list.add("like");
        list.add("i");
        list.add("like");
        //System.out.println(countUniqueWords(list));
        Map<String, Integer> hm = collectWordCount(list);
        for (String key : hm.keySet()) {
            System.out.println("Key = " + key + "------value =" + hm.get(key));
        }

    }
}
