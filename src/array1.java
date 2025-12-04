import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[0];
        int[] aso = new int[0];
        int[] des = new int[0];





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
                        int value;
                        boolean tr = true;
                        do{
                            System.out.print("Input Number:");
                            int va = in.nextInt();

                            for(int i=0;i<a.length;i++){
                                if(a[i]==va) {
                                    tr = true;
                                    System.out.println("Number is have.");
                                    break;
                                } else {
                                    tr = false;
                                }
                            }
                            value=va;
                        }while (tr);
                        int[] b = new int[a.length+1];
                        for(int i=0;i<a.length;i++){
                            b[i] = a[i];
                        }
                        b[a.length] = value;
                        a=b;
                    }break;
                    case 2:{
                        for(int i=0;i<a.length;i++){
                            System.out.print("Index("+i+"):"+a[i]+" ");
                        }
                        System.out.println();
                        System.out.print("Choose Index:");
                        int index =in.nextInt();
                        while(index < 0 || index >= a.length){
                            System.out.println("Invalid Index");
                            System.out.print("Enter Again Index:");
                            index =in.nextInt();
                        }
                        int value;
                        boolean tr = true;
                        do{
                            System.out.print("Input Number:");
                            int va = in.nextInt();

                            for(int i=0;i<a.length;i++){
                                if(a[i]==va) {
                                    tr = true;
                                    System.out.println("Number is have.");
                                    break;
                                } else {
                                    tr = false;
                                }
                            }
                            value=va;
                        }while (tr);

                        int[] b = new int[a.length+1];
                        for(int i=0;i<index;i++){
                            b[i] = a[i];
                        }
                        b[index]=value;
                        for(int i=index;i<a.length;i++){
                            b[i+1]=a[i];
                        }
                        a=b;

                    }break;
                    case 3:{
                        for(int i=0;i<a.length;i++){
                            System.out.print(a[i]+" ");
                        }
                        System.out.println();
                        int value;
                        int va;
                        boolean tr = true;
                        do{
                            System.out.print("Choose Number:");
                            va = in.nextInt();
                            for(int i=0;i<a.length;i++){
                                if(a[i]==va) {
                                    tr = false;

                                    break;
                                }else {
                                    tr = true;
                                }
                            }
                            System.out.println("Look the NUmber!");
                        }while(tr);
                        value = va;

                        int index=0;
                        int[] b = new int[a.length-1];
                        for(int i=0;i<a.length;i++){

                            if(a[i]==value) {

                                break;
                            }else {

                                b[i] = a[i];
                                index++;

                            }
                        }
//                        sum = index;
//                        System.out.println(index);
                        for(int i=index;i<b.length;i++){
                            b[i]=a[i+1];
                        }
                        a=b;
                    }break;
                    case 4:{
                        for(int i=0;i<a.length;i++){
                            System.out.print("Index("+i+"):"+a[i]+" ");
                        }
                        System.out.println();
                        System.out.print("Choose Index:");
                        int index = in.nextInt();
                        while(index < 0 || index > a.length){
                            System.out.println("Invalid Index");
                            System.out.print("Enter Again Index:");
                            index =in.nextInt();
                        }
                        int value;
                        boolean tr = true;
                        do{
                            System.out.print("Input Number:");
                            int va = in.nextInt();

                            for(int i=0;i<a.length;i++){
                                if(a[i]==va) {
                                    tr = true;
                                    System.out.println("Number is have.");
                                    break;
                                } else {
                                    tr = false;
                                }
                            }
                            value=va;
                        }while (tr);
                        a[index]=value;
                    }break;
                    case 5:{

                        if (aso.length == 0 && des.length == 0 ) {
                            System.out.print("Display Array: ");
                            for(int i=0;i<a.length;i++){

                                System.out.print(a[i]+" ");
                            }
                        } else if (aso.length != 0  || des.length == 0 ) {
                            System.out.println("a.Original list");
                            System.out.println("b.Sorted list(aso)");
                            System.out.print("Choose (a-b):");
                            String choose = in.next();
                            while (!choose.equals("a") && !choose.equals("b")) {
                                System.out.println("Invalid Choice");
                                System.out.print("Choose again:");
                                choose = in.next();
                            }
                            if (choose.equals("b")){
                                int[] d = new int[a.length];
                                for(int i=0;i<aso.length;i++){
                                    d[i] = aso[i];
                                }
                                for (int i = 0; i < d.length - 1; i++) {
                                    for (int j = i + 1; j < d.length; j++) {
                                        if (d[i] > d[j]) {
                                            int tmp = d[i];
                                            d[i] = d[j];
                                            d[j] = tmp;
                                        }
                                    }
                                }
                                aso = d;
                                System.out.print("Display Array: ");
                                for (int i=0;i<aso.length;i++){
                                    System.out.print(aso[i]+" ");
                                }
                            } else if (choose.equals("a")) {
                                System.out.print("Display Array: ");
                                for(int i=0;i<a.length;i++){

                                    System.out.print(a[i]+" ");
                                }
                            }
                        }else if (aso.length == 0  || des.length != 0 ) {
                            System.out.println("a.Original list");
                            System.out.println("b.Sorted list(DES)");
                            System.out.print("Choose (a-b):");
                            String choose = in.next();
                            while (!choose.equals("a") && !choose.equals("b")) {
                                System.out.println("Invalid Choice");
                                System.out.print("Choose again:");
                                choose = in.next();
                            }
                            if (choose.equals("b")){
                                int[] d = new int[a.length];
                                for(int i=0;i<a.length;i++){
                                    d[i] = a[i];
                                }
                                for (int i = 0; i < d.length - 1; i++) {
                                    for (int j = i + 1; j < d.length; j++) {
                                        if (d[i] < d[j]) {
                                            int tmp = d[i];
                                            d[i] = d[j];
                                            d[j] = tmp;
                                        }
                                    }
                                }
                                des=d;
                                System.out.print("Display Array: ");
                                for (int i=0;i<des.length;i++){
                                    System.out.print(des[i]+" ");
                                }
                            } else if (choose.equals("a")) {
                                System.out.print("Display Array: ");
                                for(int i=0;i<a.length;i++){

                                    System.out.print(a[i]+" ");
                                }
                            }
                        }
                    }break;
                    case 6:{
                        System.out.println("a.ASO");
                        System.out.println("b.Desc");
                        System.out.print("Choose:");
                        String value = in.next();
                        while (!value.equals("a" ) && !value.equals("b")){
                            System.out.print("Choose again:");
                            value = in.nextLine();
                        }

                        if (value.equals("a")){
                            aso=a;
                            des = new int[0];

                        } else if (value.equals("b")) {
                            des = a;
                            aso = new int[0];
                        }
                    }break;
                    case 7:{
                        for (int i=0;i<a.length;i++){
                            System.out.print(a[i]+" ");
                        }
                        System.out.println();
                        System.out.print("Enter search value: ");
                        int value = in.nextInt();

                        int pos = -1;
                        for (int i = 0; i < a.length; i++) {
                            if (a[i] == value) {
                                pos = i;
                                break;
                            }
                        }

                        if (pos == -1) {
                            System.out.println("Not found!");
                        }else{
                            System.out.println("Found at index: " + pos);
                        }
                    }break;
                }
            }
        }

    }
}
