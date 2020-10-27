package Chapter1;

public class Ex1111 {
    public static void main(String[] args) {
        boolean [][] p = {{true,false,true,false,false,true},{true,false,false,false,true,true}};
        for (boolean[] booleans : p) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean ? "*" : " ");
            }
            System.out.println();
        }
    }
}
