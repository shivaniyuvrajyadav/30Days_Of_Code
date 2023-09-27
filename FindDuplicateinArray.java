public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
       
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i:A){
            if(!map.containsKey(i)) map.put(i,1);
            else return i;
        }return -1;
        
    }

}
