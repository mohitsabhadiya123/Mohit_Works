public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Pattern1");
        pattern1(n);
        System.out.println();

        System.out.println("Pattern2");
        pattern2(n);
        System.out.println();

        System.out.println("Pattern3");
        pattern3(n);
        System.out.println();

        System.out.println("Pattern4");
        pattern4(n);
        System.out.println();

        System.out.println("Pattern5");
        pattern5(n);
        System.out.println();

        System.out.println("Pattern6");
        pattern6(n);
        System.out.println();

        System.out.println("Pattern7");
        pattern7(n);
        System.out.println();

        System.out.println("Pattern8");
        pattern8(n);
        System.out.println();

        System.out.println("Pattern9");
        pattern9(n);
        System.out.println();

        System.out.println("Pattern10");
        pattern10(n);
        System.out.println();

        n=4;
        System.out.println("Pattern11");
        pattern11(n);
        System.out.println();
    }

    static int row=1;
    static int col=1;
    public static void pattern1 (int n) {
        /*
            *****
            *****
            *****
            *****
            *****
        */

        for (row=1;row<=n;row++) {
            for (col =1; col <=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2 (int n) {
        /*
         *
         **
         ***
         ****
         *****
         */

        for (row=1;row<=n;row++) {
            for (col =1; col <=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern3 (int n) {
        /*
         *****
         ****
         ***
         **
         *
         */

        for (row=n;row>=1;row--) {
            for (col=row;col>=1;col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4 (int n) {
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        for (row=1;row<=n;row++) {
            for (col =1; col <=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5 (int n) {
        /*
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
         */

        for (row=1;row<=n;row++) {
            for (col =1; col <=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (row=n-1;row>=1;row--) {
            for (col=row;col>=1;col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        /*
            *
           * *
          * * *
         * * * *
        * * * * *
         */
        for (row=1;row<=n;row++) {
            for (int sp=n-row;sp>=0;sp--) {
                System.out.print(" ");
            }

            for (col=1;col<=row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        /*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
         */

        // For first part
        /*
             *
            * *
           * * *
          * * * *
         * * * * *
        */
        for (row=1;row<=n;row++) {
            for (int sp=n-row;sp>=0;sp--) {
                System.out.print(" ");
            }

            for (col=1;col<=row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // For Second Part
        /*
         * * * *
          * * *
           * *
            *
         */
        for (row=1;row<=n-1;row++) {
            for (int sp=0;sp<=row;sp++) {
                System.out.print(" ");
            }

            for (col=n-1;col>=row;col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern8 (int n) {
        /*
             *
            ***
           *****
          *******
         *********
         */

        for (row=1;row<=n;row++) {
            for (int sp=n-row;sp>=0;sp--) {
                System.out.print(" ");
            }

            for (col=1;col<=(2*row)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9 (int n) {
        /*
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
         */
        for (row = 1;row <=n ;row++) {
            for (int sp=2*(n-row);sp>=0;sp--) {
                System.out.print(" ");
            }
            for (col=row;col>=1;col--) {
                System.out.print(col + " ");
            }
            for (col=2;col<=row;col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern10 (int n) {
        /*
      1
     212
    32123
   4321234
    32123
     212
      1
         */
        for (row = 1;row <=n ;row++) {
            for (int sp=2*(n-row);sp>=0;sp--) {
                System.out.print(" ");
            }
            for (col=row;col>=1;col--) {
                System.out.print(col + " ");
            }
            for (col=2;col<=row;col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        for (row = 1;row <=n-1 ;row++) {
            for (int sp=1;sp<=2*row+1;sp++) {
                System.out.print(" ");
            }
            for (col=n-row;col>=1;col--) {
                System.out.print(col + " ");
            }
            for (col=2;col<=n-row;col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern11 (int n) {
        /*

        4 4 4 4 4 4 4 4 4
        4 3 3 3 3 3 3 3 4
        4 3 2 2 2 2 2 3 4
        4 3 2 1 1 1 2 3 4
        4 3 2 1 0 1 2 3 4
        4 3 2 1 1 1 2 3 4
        4 3 2 2 2 2 2 3 4
        4 3 3 3 3 3 3 3 4
        4 4 4 4 4 4 4 4 4

        */
        int origN = n;
        n = 2*n;
        for (row =0;row<=n;row++) {
            for (col=0;col<=n;col++) {
                int atEveryIndex = origN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
