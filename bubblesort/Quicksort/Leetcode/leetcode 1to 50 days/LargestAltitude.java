public class LargestAltitude {
    public static void main(String[] args){
        int [] gain = {2,3,-5,1,2};
        Solution s = new Solution();
        int result = s.largestAltitude(gain);
        System.out.println(result);
    }
}

class Solution{
    public int largestAltitude(int [] gain){
        int currentAltitude = 0;
        int maxAltitude = 0;

        for(int i=0; i<gain.length; i++){
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }
}
