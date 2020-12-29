import java.util.*;

  public class Game
{
    void main(){
        String type;
     
         Scanner sc = new Scanner(System.in);
         Random r = new Random();
    
         
         
      System.out.println("Pls type '7' for the game 7 up or 7 down or enter 'LowOrHigh' for the game Low or High");
       type = sc.next();
      UpOrDown player1 = new UpOrDown();
      LowOrHigh player2 = new LowOrHigh();
       if(type.equals("7")){
        player1.game();
     }
     else if(type.equalsIgnoreCase("LowOrHigh")){
         player2.game();
        }
     
    
    
    
  }
 }
 
 
 
  class UpOrDown{
     void game(){
         
     
          Scanner sc = new Scanner(System.in);
          Random r = new Random();
    
         
         
         
           String Choice;
            int num = 1 + r.nextInt(12);
             System.out.println("This is the explanation of the game. For example you choose 7 up and the number generated from the range 1-13 is above 7, you win, otherwise you lose");
             System.out.println("Choose 7 up by entering 'up', 7 down by entering 'down' and the number 7 by entering '7.");
             Choice = sc.next();
            
          if(Choice.equalsIgnoreCase("up")){
              System.out.println("Number generated was " + num);
          if (num>7){
              System.out.println("You have won");
            }
            else{
                System.out.println("You have lost");
            }
          }
           if(Choice.equalsIgnoreCase("down")){
               System.out.println("Number generated was " + num);
           if (num<7){
              System.out.println("You have won");
            }
            else{
                System.out.println("You have lost");
            }
          } 
          if(Choice.equalsIgnoreCase("7")){
              System.out.println("Number generated was " + num);
          if (num==7){
              System.out.println("You have won");
            }
            else{
                System.out.println("You have lost");
            }
          
    }
        }
 }
 
 
 
 class LowOrHigh{
     void game(){
         Scanner sc = new Scanner(System.in);
         Random r = new Random();
         String type;
         int number = r.nextInt(11);
         
         int randomnum = r.nextInt(11);
         System.out.println("This is the explanation of the game. You will choose High or Low and two random numbers will be generated, one is your and other is the game's. ");
         System.out.println("For example, if you choose High and your number is 8 and the random number generated was 5, you will win otherwise you will lose.");
         System.out.println("Enter 'H' if you want to choose high or enter 'L' if you want to choose low");
         type = sc.next();
        ;
         if(type.equalsIgnoreCase("H")){
             System.out.println("Your number was " + number);
             System.out.println("The random number generated was " + randomnum);
             if(number>randomnum && number<11){
                 System.out.println("You win");
                }
             else if(number == randomnum){
                 System.out.println("It is a tie");
                }
                else if(number<randomnum && number >= 0){
                    System.out.println("You lose");
                    
                }
                else{
                    System.out.println("Please enter a correct value");
                }
            }
         if(type.equalsIgnoreCase("L")){
             System.out.println("Your number was " + number);
             System.out.println("The random number generated was " + randomnum);
             if(number>randomnum && number<11){
                 System.out.println("You lose");
                }
             else if(number == randomnum){
                 System.out.println("It is a tie");
                }
                else if(number<randomnum && number >= 0){
                    System.out.println("You win");
                    
                }
                else{
                    System.out.println("Please enter a correct value");
                }
            }   
         
        }
 }
    
    
