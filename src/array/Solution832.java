package array;

public class Solution832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i<image.length;i++){
            for(int j =0;j<image[0].length/2;j++){
                int temp = image[i][image.length-1-j];
                image[i][image.length-1-j] = image[i][j];
                image[i][j] = temp;
            }
            for(int j =0;j<image[0].length;j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
