class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        
        for(String s : operations){
            value += (44 - s.charAt(1));
        }
        
        return value;
    }
}