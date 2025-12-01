import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[0];

        while (true) {
            if(a.length==0){
                System.out.println("1.Add");
                System.out.print("Please Choose:");
                int n = in.nextInt();
                switch(n){
                    case 1:{
                        System.out.print("Input Number:");
                        int value = in.nextInt();
                        int[] b = new int[a.length+1];
                        for(int i=0;i<a.length;i++){
                            b[i] = a[i];
                        }
                        b[a.length] = value;
                        a=b;
                    }break;
                }
            } else if (a.length!=0) {
                System.out.println();
                System.out.println("1. Add");
                System.out.println("2. Insert");
                System.out.println("3. Delete");
                System.out.println("4. Update");
                System.out.println("5. Display");
                System.out.println("6. Sort");
                System.out.println("7. Search");
                System.out.print("Choose: ");
                int n = in.nextInt();
                switch(n){
                    case 1:{
                        System.out.print("Input Number:");
                        int value = in.nextInt();
                        int[] b = new int[a.length+1];
                        for(int i=0;i<a.length;i++){
                            b[i] = a[i];
                        }
                        b[a.length] = value;
                        a=b;
                    }break;
                    case 2:{
                        System.out.print("Choose Index:");
                        int index =in.nextInt();
                        while(index < 0 || index > a.length){
                            System.out.println("Invalid Index");
                            System.out.print("Enter Again Index:");
                            index =in.nextInt();
                        }
                        System.out.print("Enter Number:");
                        int value = in.nextInt();

                        int[] b = new int[a.length+1];
                        for(int i=0;i<index;i++){
                            b[i] = a[i];
                        }
                        b[index]=value;
                        for(int i=0;i<a.length;i++){
                            b[i+1]=a[i];
                        }
                        a=b;

                    }break;
                    case 3:{
                        System.out.println("Choose Index:");
                        int  index = in.nextInt();
                        while(index < 0 || index > a.length){
                            System.out.println("Invalid Index");
                            System.out.print("Choose Again Index:");
                            index =in.nextInt();
                        }
                        int[] b = new int[a.length-1];
                        for(int i=0;i<index;i++){
                            b[i] = a[i];
                        }
                        for(int i=0;i<b.length;i++){
                            b[i]=a[i+1];
                        }
                        a=b;
                    }break;
                    case 4:{
                        System.out.print("Choose Index:");
                        int index = in.nextInt();
                        while(index < 0 || index > a.length){
                            System.out.println("Invalid Index");
                            System.out.print("Enter Again Index:");
                            index =in.nextInt();
                        }
                        System.out.print("Enter Number:");
                        int value = in.nextInt();
                        a[index]=value;
                    }break;
                    case 5:{
                        System.out.println("Display Array");
                        for(int i=0;i<a.length;i++){
                            System.out.print(a[i]+" ");
//                            System.out.println();
                        }
                    }break;
                }
            }
        }

    }
}
