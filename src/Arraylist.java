import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ASC = new ArrayList<>();
        ArrayList<Integer> DESC = new ArrayList<>();
        int l1 = 0;
        int l2 = 0;
        while (true) {

            if(list.size()==0){
                System.out.println("============ArrayList============");
                System.out.println("1.add");
                System.out.print("Please choose:");
                int n = sc.nextInt();
                if(n==1){
                    System.out.print("Enter number:");
                    int value = sc.nextInt();
                    list.add(value);
                    ASC.add(value);
                    DESC.add(value);
                }
            } else if (list.size() != 0) {

                System.out.println("============ArrayList============");
                System.out.println("1.add");
                System.out.println("2.Insert");
                System.out.println("3.Delete");
                System.out.println("4.Update");
                System.out.println("5.Display");
                System.out.println("6.Sort");
                System.out.println("7.Search");
                System.out.print("Please choose:");
                int n = sc.nextInt();
                switch (n){
                    case 1:{
                        int value=0;
                        boolean found = false;
                        do {
                            System.out.print("Enter number:");
                            int va = sc.nextInt();
                            for (int i =0; i<list.size(); i++) {
                                if (list.get(i) == va) {
                                    found = true;
                                    System.out.println("Number is have!");
                                    break;
                                }else{
                                    found = false;
                                    value = va;

                                }
                            }

                        }while(found);
                        list.add(value);
                        ASC.add(value);
                        DESC.add(value);
                    }break;
                    case 2:{
                        System.out.println();
                        System.out.print("ArrayList: ");
                        for (int i =0; i<list.size(); i++) {
                            System.out.print(list.get(i)+" ");
                        }
                        System.out.println();
                        System.out.print("Enter Index:");
                        int index = sc.nextInt();
                        while(index < 0 || index > list.size()) {
                            System.out.println("Invalid Index");
                            System.out.print("Enter Index again:");
                            index = sc.nextInt();
                        }
                        int value=0;
                        boolean found = false;
                        do {
                            System.out.print("Enter number:");
                            int va = sc.nextInt();
                            for (int i =0; i<list.size(); i++) {
                                if (list.get(i) == va) {
                                    found = true;
                                    System.out.println("Number is have!");
                                    break;
                                }else{
                                    found = false;
                                    value = va;

                                }
                            }

                        }while(found);
                        list.add(index, value);
                        ASC.add(index,value);
                        DESC.add(index,value);
                    }break;
                    case 3:{
                        System.out.println();
                        System.out.print("ArrayList: ");
                        for (int i =0; i<list.size(); i++) {
                            System.out.print(list.get(i)+" ");
                        }
                        System.out.println();
                        int value;
                        boolean found;

                        do {
                            System.out.print("Enter number to delete: ");
                            value = sc.nextInt();
                            found = true;

                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i) == value) {
                                    list.remove(i);
                                    ASC.remove(i);
                                    DESC.remove(i);// remove by index
                                    found = false;
                                    System.out.println("Deleted successfully!");
                                    break;
                                }
                            }

                            if(found){
                                System.out.println("Number hasn't been found! Try again.");
                            }

                        } while(found);
                    }break;
                    case 4:{
                        System.out.println();
                        System.out.print("ArrayList: ");
                        for (int i =0; i<list.size(); i++) {
                            System.out.print(list.get(i)+" ");
                        }
                        System.out.println();
                        int value=0;
                        int index=0;
                        boolean found = false;
                        do {
                            System.out.print("Choose Number You want to Update:");
                            int va = sc.nextInt();
                            for (int i =0; i<list.size(); i++) {
                                if (list.get(i) == va) {
                                    found = false;
                                    boolean founda = false;
                                    do {
                                        System.out.print("Enter number:");
                                        int val = sc.nextInt();
                                        for (int j =0; j<list.size(); j++) {
                                            if (list.get(j) == val) {
                                                founda = true;
                                                System.out.println("Number is have!");
                                                break;
                                            }else{
                                                founda = false;
                                                value = val;

                                            }
                                        }

                                    }while(founda);
                                    list.remove(index);
                                    ASC.remove(index);
                                    DESC.remove(index);
                                    break;

                                }else if(list.get(i)!=va){
                                    index++;

                                    found = true;
                                }
                            }
                            System.out.println("Number haven't been found!");

                        }while(found);
                        list.add(index,value);
                        ASC.add(index,value);
                        DESC.add(index,value);
                    }break;
                    case 5:{
                        if(l1 ==  0){
                            System.out.print("ArrayList:");
                            for (int i = 0; i < list.size(); i++) {
                                System.out.print(list.get(i) + " ");
                            }
                        }else if(l1==1) {
                            if(l2==1){
                                System.out.println("a.Original list");
                                System.out.println("b.Sorted list(ASC)");
                                System.out.print("Choose (a-b):");
                                String a= sc.next();
                                while (!a.equals("a") && !a.equals("b")) {
                                    System.out.println("Invalid Choice");
                                    System.out.print("Choose again(a-b):");
                                    a= sc.next();
                                }
                                if(a.equals("a")){
                                    System.out.print("ArrayList:");
                                    for (int i = 0; i < list.size(); i++) {
                                        System.out.print(list.get(i) + " ");
                                    }
                                } else if (a.equals("b")) {
                                    Collections.sort(ASC, Collections.reverseOrder());
                                    System.out.print("ArrayList:");
                                    for (int i = 0; i < ASC.size(); i++) {
                                        System.out.print(ASC.get(i) + " ");
                                    }
                                }

                            } else if (l2==2) {
                                System.out.println("a.Original list");
                                System.out.println("b.Sorted list(DESC)");
                                System.out.print("Choose (a-b):");
                                String a= sc.next();
                                while (!a.equals("a") && !a.equals("b")) {
                                    System.out.println("Invalid Choice");
                                    System.out.print("Choose again(a-b):");
                                    a= sc.next();
                                }
                                if(a.equals("a")){
                                    System.out.print("ArrayList:");
                                    for (int i = 0; i < list.size(); i++) {
                                        System.out.print(list.get(i) + " ");
                                    }
                                } else if(a.equals("b")){
                                    Collections.sort(DESC);
                                    System.out.print("ArrayList:");
                                    for (int i = 0; i < DESC.size(); i++) {
                                        System.out.print(DESC.get(i) + " ");
                                    }
                                }
                            }
                        }
                    }break;
                    case 6:{

                        System.out.println("a.ASC");
                        System.out.println("b.DESC");
                        System.out.print("Please Choose:");
                        String a = sc.next();
                        while (!a.equals("a") && !a.equals("b")){
                            System.out.println("Invalid Choice");
                            System.out.print("Please Choose again:");
                            a = sc.next();
                        }
                        if(a.equals("a")){
                            l1=1;
                            l2=1;
                        }
                        else if(a.equals("b")){
                            l1=1;
                            l2=2;
                        }

                    }break;
                    case 7:{
                        System.out.println();
                        System.out.print("Enter search value: ");
                        int value = sc.nextInt();
                        int pos = -1;
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i) == value) {
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
                System.out.println();
            }
        }


    }
}
