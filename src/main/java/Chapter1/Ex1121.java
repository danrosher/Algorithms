package Chapter1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Ex1121 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("%8s %7s %7s %7s\n", "Names", "Number1", "Number2", "Result");
        System.out.println(in.lines()
            .map(s -> s.split(" "))
            .map(s -> String.format("%8s %8s %8s %7.3f",
                s[0],
                s[1],
                s[2],
                Double.parseDouble(s[1])/Double.parseDouble(s[2])))
            .collect(Collectors.joining("\n")));
    }
}
