import java.util.Arrays;

public class glab3033part7 {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
        // spitting the string at "::"
        // storing the results in an array of strings

        String[] result = vowels.split("::");

        //converting array to string and printing it

        System.out.println("result = " + Arrays.toString(result));



    }
}
