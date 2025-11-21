import java.util.Scanner;

public class array {
    static void In(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] room=new int[3][5];


        while(true){
            int rooms = 0;
            int busy=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<5;j++){
                    rooms++;
                    if(room[i][j]==1){
                        rooms=rooms-1;
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
                    System.out.print("Floor:");
                    int floor = sc.nextInt();
                    System.out.print("Room:");
                    int room1 = sc.nextInt();
                    room[floor][room1]=1;





                }break;
                case 2:{
                    System.out.print("Floor (1-3): ");
                    int f = sc.nextInt() - 1;

                    System.out.print("Room (1-5): ");
                    int r = sc.nextInt() - 1;
                    for(int j=0;j<3;j++){
                        for(int k=0;k<5;k++){
                            if (room[f][r] == 1) {
                                room[f][r] = 0;

                                System.out.println("Room cancelled.");
                            } else {
                                System.out.println("Room already empty.");
                            }
                        }
                    }


                }break;
            }





            if(rooms==0){
                break;
            }
        }

    }
}
