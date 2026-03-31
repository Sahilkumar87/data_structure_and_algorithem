import java.util.HashMap;
import java.util.Map;

public class alien_dictionary953 {
    class Solution {
    public boolean isAlienSorted(String[] word, String order) {
        Map<Character, Integer> orderMap  = new HashMap<>();
        for(int i = 0; i<order.length(); i++){
            orderMap.put(order.charAt(i), i);
        }

        for(int i = 0; i<word.length-1; i++){
            for(int j = 0; j<word[i].length(); j++){


                if(j >= word[i+1].length()){
                    return false;
                }
                if(word[i].charAt(j) != word[i+1].charAt(j)){
                    int currentLetter = orderMap.get(word[i].charAt(j));
                    int nextLetter = orderMap.get(word[i+1].charAt(j));
                    if(nextLetter < currentLetter){
                        return false;

                    }
                    else{
                        break;
                    }
                }
            }
        }
        
        return true;
        
}
}
    
}
