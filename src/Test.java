import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[0];  // array main

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Display");
            System.out.println("6. Sort");
            System.out.println("7. Search");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int n = in.nextInt();

            // ADD value
            if (n == 1) {
                System.out.print("Enter number: ");
                int value = in.nextInt();

                int[] b = new int[a.length + 1];
                for (int i = 0; i < a.length; i++) {
                    b[i] = a[i];
                }
                b[a.length] = value;
                a = b; // replace old array

            }

            // INSERT index
            else if (n == 2) {
                System.out.print("Enter index: ");
                int index = in.nextInt();
                System.out.print("Enter value: ");
                int value = in.nextInt();

                if (index < 0 || index > a.length) {
                    System.out.println("❌ Index out of range");
                    continue;
                }

                int[] b = new int[a.length + 1];
                for (int i = 0; i < index; i++) b[i] = a[i];
                b[index] = value;
                for (int i = index; i < a.length; i++) b[i + 1] = a[i];

                a = b;
            }

            // DELETE index
            else if (n == 3) {
                System.out.print("Enter index delete: ");
                int index = in.nextInt();

                if (index < 0 || index >= a.length) {
                    System.out.println("❌ Index out of range");
                    continue;
                }

                int[] b = new int[a.length - 1];
                for (int i = 0; i < index; i++) b[i] = a[i];
                for (int i = index; i < b.length; i++) b[i] = a[i + 1];

                a = b;
            }

            // UPDATE index
            else if (n == 4) {
                System.out.print("Enter index update: ");
                int index = in.nextInt();
                System.out.print("Enter new value: ");
                int value = in.nextInt();

                if (index < 0 || index >= a.length) {
                    System.out.println("❌ Index out of range");
                    continue;
                }

                a[index] = value;
            }

            // DISPLAY
            else if (n == 5) {
                System.out.print("Array: ");
                for (int x : a) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }

            // SORT
            else if (n == 6) {
                for (int i = 0; i < a.length - 1; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] > a[j]) {
                            int tmp = a[i];
                            a[i] = a[j];
                            a[j] = tmp;
                        }
                    }
                }
                System.out.println("✔️ Sorted!");
            }

            // SEARCH value
            else if (n == 7) {
                System.out.print("Enter search value: ");
                int value = in.nextInt();

                int pos = -1;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == value) {
                        pos = i;
                        break;
                    }
                }

                if (pos == -1) System.out.println("Not found!");
                else System.out.println("Found at index: " + pos);
            }

            else if (n == 0) {
                break;
            }

        }
    }
}

