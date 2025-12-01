import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] a =new int[0];
//
//        // add new value 4
//
//
//        int[] newArray = new int[a.length + 1];
//
//        for(int i = 0; i < a.length; i++) {
//            newArray[i] = a[i];
//        }
//        int newValue = 4;
//
//        newArray[a.length] = newValue;
//
//        // print
//        for(int x : newArray) {
//            System.out.print(x + " ");
//        }
        int m=0;

        while (true){
            int[] a=new int[m];



           if(a.length==0) {
               int[] b=new int[a.length+1];
               System.out.println("1.Add");
               System.out.print("Please Choose:");
               int n = in.nextInt();
               switch (n) {
                   case 1: {
                       System.out.print("Enter First Number:");
                       int c = in.nextInt();
                       b[a.length] = c;
                       m=a.length+1;
                   }
                   break;
               }

           } else if (a.length>0) {
               System.out.println("1.Add");
               System.out.println("2.Insert");
               System.out.println("3.Delete");
               System.out.println("4.Update");
               System.out.println("5.Display");
               System.out.println("6.Sort");
               System.out.println("7.Search");
               System.out.print("Please Choose:");
               int n = in.nextInt();
                   switch (n) {
                       case 1: {
                           int[] b=new int[a.length+1];
                           System.out.print("Enter First Number:");
                           int c = in.nextInt();
                           b[a.length] = c;
                           m = a.length + 1;
                       }
                       break;
                   }
           }


        }




    }
}
