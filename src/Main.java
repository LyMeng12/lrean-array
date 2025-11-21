import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many student:");
        int n = in.nextInt();
        int total = 0;
        double average = 0;
        int[][] scor =new int[n][6];
        String[] name = new String[n];

        for(int i = 0; i<n;i++ ){
            System.out.print("Enter name of student:");
            name[i] = in.next();
            for(int j = 0; j<6;j++){
                switch (j){
                    case 0:{
                            System.out.print("Enter MIS:");
                            scor[i][j]=in.nextInt();
                        }break;
                    case 1:{
                        System.out.print("Enter SA:");
                        scor[i][j]=in.nextInt();
                    }break;
                    case 2:{
                        System.out.print("Enter SM:");
                        scor[i][j]=in.nextInt();
                    }break;
                    case 3:{
                        System.out.print("Enter Java:");
                        scor[i][j]=in.nextInt();
                    }break;
                    case 4:{
                        System.out.print("Enter WED2:");
                        scor[i][j]=in.nextInt();
                    }break;
                    case 5:{
                        System.out.print("Enter 2D:");
                        scor[i][j]=in.nextInt();
                    }break;

                }
                total += scor[i][j];



            }
        }
        System.out.println("======================================================");
        System.out.println("List Student"+n);
        System.out.println("ID"+"\t"+"Name"+"\t"+"MIS"+"\t"+"SA"+"\t"+"SM"+"\t"+"JV"+"\t"+"WD"+"\t"+"2D"+"\t"+"Total"+"\t"+"Average"+"\t");
        for(int i = 0; i<n;i++ ){
            System.out.print((i+1)+"\t" +name[i]+"\t\t" );
            for(int j = 0; j<6;j++){
                System.out.print(scor[i][j]+"\t");

            }
            System.out.print(total+"\t\t");
            System.out.println((total / n));
            System.out.println();
        }
    }
}