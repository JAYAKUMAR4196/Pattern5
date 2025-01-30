public class Pattern5 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Row 1: Numbers from 0 to 4
        for (int i = 0; i < n; i++) {
            System.out.print(i);
        }
        System.out.println();

        // Row 2: Single '*'
        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        // Row 3: Three '*'
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Row 4: Five '*'
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Row 5: Three '*'
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Row 6: Single '*'
        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
