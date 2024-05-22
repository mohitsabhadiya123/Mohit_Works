package Recursion;

public class pro1 {
    public static void main(String[] args) {
//        printMessage1();
//        printMessage2();
//        printMessage3();
//        printMessage4();
//        printMessage5();
//        printMessage6();

        printMessage();
    }

//    static void printMessage1 () {
//        System.out.println("Hello World");
//    }static void printMessage2 () {
//        System.out.println("Hello World");
//    }static void printMessage3 () {
//        System.out.println("Hello World");
//    }static void printMessage4 () {
//        System.out.println("Hello World");
//    }static void printMessage5 () {
//        System.out.println("Hello World");
//    }static void printMessage6 () {
//        System.out.println("Hello World");
//    }
    static int  i=0;
    static void printMessage() {
        if (i == 6){
            return;
        }
        i++;
        System.out.println("Hello World");
        printMessage();
    }
}
