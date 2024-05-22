package Spring_And_Microservices.JUNIT;

public class pro1 {
    public static void main(String[] args) {
        pro1_Demo d = new pro1_Demo();
        int result = d.divide(10,5);
        int result2 = d.multiply(10,0);

        if (result == 2 && result2 == 0) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}
