class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //int[][] ans = new int[image.length][];
        
        for (int row = 0; row < image.length; row++) {
            reverse(image[row]);
        }
        
        for (int row = 0; row < image.length; row++) {
            for(int col = 0 ; col < image[row].length; col++){
                if(image[row][col] == 0){
                    image[row][col] = 1;
                }else{
                    image[row][col] = 0;
                }
            }
        }
        
        return image;
        
    }
    
    void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        
    }
    
    void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}