import java.util.Arrays;

public class StringAndStringBuilder {
    public static void main(String[] args) {
//        System.out.println('a' + 'b');
//        System.out.println("a" + "b");
//        System.out.println((char)('a' + 3));
//        System.out.println("a" + 3);
//        System.out.println("Mohit" + new ArrayList<>());
//        System.out.println("Mohit");
//        System.out.println(new Integer(56) + "" + new ArrayList<>());



        // Performance
//        StringBuilder series = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a'+i);
//            series.append(ch);
//        }
//        System.out.println(series);

        // StringBuilder

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            builder.append((char)('a'+i));
        }
        System.out.println(builder);

        builder.deleteCharAt(0);
        System.out.println(builder);

        // Methods
        /*
            1. toCharArray()
            2. toLowerCase()
            3. toUpperCase()
            4. indexOf()
            5. lastIndexOf()
            6. replace()
            7. trim()
            8. strip()

        */

        String name = "Mohit Sabhadiya";
        System.out.println(name);
        System.out.println("  mohit".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
