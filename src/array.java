import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] room=new int[3][5];
//        int[][] night=new int[3][5];
        int[] night = new int[15];

        while(true){
            int rooms = 0;
            int busy=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<5;j++){
                    rooms++;
                    if(room[i][j]==1){
                        rooms-=1;
                        busy+=1;
                    }
                }
            }
            System.out.println("Availale "+rooms);

            System.out.println("Busy "+busy);

            System.out.println("1. Check In");
            System.out.println("2. Check Out");
            System.out.print("Please choose:");
            int chack =sc.nextInt();
            while (chack<1 || chack>2){
                System.out.print("Please choose again!:");
                chack =sc.nextInt();
            }
            switch(chack){
                case 1:
                {
                    for (int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if(room[i][j]==1){
                                System.out.print("Room "+(i+1)+":"+(j+1)+" (OFF)"+"\t");
                            } else if (room[i][j]==0) {
                                System.out.print("Room "+(i+1)+":"+(j+1)+" (ON)"+"\t");
                            }

                        }
                        System.out.println();
                    }
                    boolean go;

                    do {
                        System.out.print("Floor: ");
                        int floor = sc.nextInt();
                        while (floor<1 || floor>3){
                            System.out.print("again Floor: ");
                            floor = sc.nextInt();
                        }

                        System.out.print("Room: ");
                        int room1 = sc.nextInt();
                        while (room1<1 || room1>5){
                            System.out.print("Room: ");
                            room1 = sc.nextInt();
                        }
                        int nig = 0;
                        if (floor==1){
                            nig = 0;
                        }else if (floor==2){
                            nig =5;
                        }else if (floor==3){
                            nig =10;
                        }

                        if (room[floor-1][room1-1] == 1) {
                            System.out.println("Room "+floor+":"+room1+" is already OFF.");
                            go = true;
                        } else {
                            room[floor-1][room1-1] = 1;

                            System.out.print("How many night:");
                            int night1 = sc.nextInt();
                            System.out.println("Room "+floor+":"+room1+" turned OFF.");
                            night[(nig +room1-1)] = 20*night1;
                            for (int k = 0 ; k<night.length; k++){
                                System.out.print(night[k]+" ");
                            }
                            go = false;
                        }

                    } while (go);





                }break;
                case 2:
                {

                    for (int i=0;i<3;i++){
                        for(int j=0;j<5;j++){
                            if(room[i][j]==1){
                                System.out.println("Room "+(i+1)+":"+(j+1)+" (OFF)");
                            }
                        }
//                        System.out.println();
                    }
                    boolean go;
                    do{
                        go=true;
                        System.out.print("Floor : ");
                        int floor = sc.nextInt() ;
                        while (floor<1 || floor>3){
                            System.out.print("again Floor: ");
                            floor = sc.nextInt();
                        }

                        System.out.print("Room : ");
                        int room1 = sc.nextInt();
                        while (room1<1 || room1>5){
                            System.out.print("Room: ");
                            room1 = sc.nextInt();
                        }
                        int nig = 0;
                        if (floor==1){
                            nig = 0;
                        }else if (floor==2){
                            nig =5;
                        }else if (floor==3){
                            nig =10;
                        }

                        if (room[floor-1][room1- 1] == 1) {
                            room[floor-1][room1 - 1] = 0;

                            System.out.println("Payment:$"+night[(floor-1+room1-1)]);
                            System.out.println("Room "+(floor)+":"+(room1)+" is already ON.");
                            night[(nig +room1-1)]=0;
                            break;
                        }else {
                            System.out.println("Room "+(floor)+":"+(room1)+" turned ON.");

                        }
                    }while (go);

                }break;
            }
        }

    }
}
