//Uri Problem Solve
import java.util.Scanner;
public class GameTime {
    public static void main(String[] args) {  
         Scanner sc = new Scanner(System.in);
         int start_h,end_h,start_m,end_m ,hour=0,min=0;
          start_h=sc.nextInt();
          start_m=sc.nextInt();
          end_h=sc.nextInt();
          end_m=sc.nextInt();
          if(start_h >=0 && start_h <= 24 && end_h>=0
                  && end_h<=24 && start_m >=0 && start_m<=
                  60 && end_m >=0 && end_m<=60){
              if(end_m>start_m){
                  min=end_m-start_m;
              }
                else if (end_m < start_m){
                    min=(end_m-start_m)+60;
                          end_h=end_h -1;
                }
                          if(end_h >= start_h){
                              hour=end_h-start_h;
                          }
                          else if(end_m<start_m){
                              hour=end_h-start_h+24;
                          }
                          if(hour==0 && min==0 ){
                              hour=24;
                          }
              }
           System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+min+" MINUTO(S)");
         
     }
}
        

