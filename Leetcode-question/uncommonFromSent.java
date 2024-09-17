import java.util.*;

public class uncommonFromSent {

    public static String[] uncomStrings(String s1, String s2){
        
        
        Map<String, Integer> wordcount = new HashMap<>();

        for(String st: s1.split(" ")){
            wordcount.put(st,(wordcount.getOrDefault(st,0 ) +1 ));
        }

        for(String st : s2.split(" ")){
            wordcount.put(st, wordcount.getOrDefault(st, 0)+ 1);
        }

        List<String> unique = new ArrayList<>();

        for(Map.Entry<String, Integer> map : wordcount.entrySet()){
            if(map.getValue() == 1){
                unique.add(map.getKey());
            }

        }
        return unique.toArray(new String[0]);


    }

    public static void main(String args[]){
        String s1 = "this apple is sweet";
        String s2 = s2 = "this apple is sour";
        uncommonFromSent u = new uncommonFromSent();
        String st [] = u.uncomStrings(s1, s2);
        for(String s: st){
            System.out.print(s+ " ");
        }

    }
}