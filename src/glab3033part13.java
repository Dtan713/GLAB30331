public class glab3033part13 {
    public static void main(String[] args) {
        String str1 = "abc cba";

        // all occurrences of 'a' os replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        //all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));

        //character not in the string
        System.out.println("Hello".replace('4', 'J'));

        // all occurences of "aa" is replaced with "zz"}
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        //substring not in the string
        System.out.println("Java".replace("C++", "C"));
    }
}