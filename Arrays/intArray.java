package Arrays;

public class intArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] multi = {{1,2,3},{4,5,6}};
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i = 0;i<multi.length;i++){
            for(int j =0;j<multi[i].length;j++)
                System.out.println(multi[i][j]);
        }
    }
}
