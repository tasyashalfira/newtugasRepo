import java.util.Scanner;


class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");

        int height = scanner.nextInt();
        int currentHeight = height;

        for (int row = 1; row <= height * 2; row++) {
            if (row <= height) {
                for (int stars = 1; stars <= row; stars++) {
                    System.out.print("* ");
                }
            } else {
                for (int stars = currentHeight; stars >= 1; stars--) {
                    System.out.print("* ");
                }
                currentHeight -= 1;
            }
            System.out.println();
        }
        scanner.close();
    }
}

