package data_structure_and_algorithem.String_full_course;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz412 {

    class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if(i%3==0 && i%5==0){
                //number is divisible by both 3 and 5
                result.add("FizzBuzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }
            else if(i%5==0){
                result.add("Buzz");
            }
            else{
                //number is not divisible by 3 or 5
                result.add(Integer.toString(i));
            }
        }
        return result;
        
    }
}
}