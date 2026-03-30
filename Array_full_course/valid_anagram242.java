public class valid_anagram242 {
    public static void main(String[] args) {
        
    }

    public boolean isAnagram(String s, String t) {
        //length not equal is it not anagram
        if(s.length() != t.length()){
            return false;
        }
        
        // create an array to count character frequencies
        int[] charCount = new int[26]; // sirf lowercase english letter ho

        // increament count for each charactaer in 's' and decreament for each in 't'
        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        //check if all count are zero
        for(int count : charCount){
            if(count != 0){ 
                return false;
            }
        }
        return true; // sare count zero hai , isliye s ka angram t hai
        
    }
}

