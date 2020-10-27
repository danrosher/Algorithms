package Chapter1;

public class Ex1113 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<a[0].length;i++){
            for (int[] ints : a) {
                System.out.print(ints[i]+",");
            }
            System.out.println();
        }
    }
}
