package data_structure_and_algorithem.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class opentheClock752 {
    class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if(dead.contains("0000")) return -1;
        if("0000".equals(target)) return 0;

        Queue<String> q = new ArrayDeque<>();
        Set<String> seen = new HashSet<>();
        q.offer("0000");
        seen.add("0000");

        int steps = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int s = 0; s<size; s++){
                String cur = q.poll();
                if(dead.contains(cur)) continue; // skip block states
                if(cur.equals(target)) return steps;


                // generate neighbour by turing each wheel +/-1
                char[] cs = cur.toCharArray();
                for(int i = 0; i<4; i++){
                    char orig = cs[i];
                    int d = orig - '0';

                    // turn up
                    cs[i] = (char)('0' + ((d+1)%10));
                    String up = new String(cs);
                    if(!dead.contains(up) && seen.add(up))q.offer(up);
                        //turn down
                        cs[i] = (char)('0' + ((d+9)%10)); // (d-1+10)%10
                        String down = new String(cs);
                        if(!dead.contains(down) && seen.add(down)) q.offer(down);
                        cs[i] = orig; // restore for next wheel
                    }

                }
            steps++;
            }
            return -1;
        }
    }

    
}
