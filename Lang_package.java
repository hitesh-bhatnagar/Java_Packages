import java.lang.*;

public class Lang_package {
    public static void main(String[] args) {
        String str1 = "Radhaswami ji";
        String str2 = "bhajan simran";

        System.out.println("subsequence of string 1 from (2,5) --> " + str1.subSequence(2, 5));
        System.out.println("substring of string 2 from (1,4) --> "+ str2.substring(1,4));

        // StringBuilder
        StringBuilder sb = new StringBuilder("bbc");
        sb.append("def");
        sb.reverse();
        sb.insert(2,  "x");
        sb.deleteCharAt(1);
        System.out.println("updated stringbuilder --> "+ sb.toString());

        // wrapper classes and parsing
        int x = Integer.parseInt("123");
        double y = Double.parseDouble("3.14");
        String string = Integer.toString(456);
        System.out.println("Parsed int : --> "+ x);
        System.out.println("Parsed double : --> "+ y);
        System.out.println("String from int : --> "+ string);

        // System class utilities
        int[] src = {1,2,3,4,5};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, src.length);

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors: " + runtime.availableProcessors());
        System.out.println("Free memory: " + runtime.freeMemory());
        System.out.println("Total memory: " + runtime.totalMemory());

        // Exceptional Handling
        try{
            int result = 10/0;

        } catch(ArithmeticException e){
            System.out.println("Caught arithmetic error : "+ e.getMessage());
        }
    }
}
