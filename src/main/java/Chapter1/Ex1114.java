package Chapter1;

public class Ex1114 {

    public static int lg(int N){
        int r = 0;
        while((N >>= 1) > 0)
            r++;
        return r;
    }

    public static void main(String[] args) {
        System.out.println(lg(Integer.parseInt(args[0])));
        System.out.println(Math.floor(Math.log(Integer.parseInt(args[0]))/Math.log(2)));
    }
}
