import java.util.Scanner;
import java.lang.Thread;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    int userOption;
    
    loading();
    if(login("test", "test"))
    {
      System.out.print("\033[H\033[2J");
      print("Hey There! Welcome to JavaOS");
      print("Please choose a command:");
      print("1) Math Operations");
      print("2) AI ChatBot");
      print("3) Roll the Dice");
      print("4) Meme Generator");
      print("5) Stoic Quote");
      print("6) Guessing Game");
      print("7) OS Version");
      print("8) Exit");
      userOption = input.nextInt();
      
      if(userOption == 1)
      {
        System.out.print("\033[H\033[2J" + "Which Math Operation Would You Like to Use?" + "\n" + "1) Addition" + "\n" + "2) Subtraction" + "\n" + "3) Multiplication" + "\n" + "4) Division" + "\n" + "5) Exponents" + "\n" + "6) Square Roots" + "\n");
      }
      else if(userOption == 2)
      {
        System.out.print("\033[H\033[2J" + "You chose AI ChatBot");
      }

      else if(userOption == 3)
      {
        System.out.print("\033[H\033[2J" + "You chose Roll the DIce");
      }

      else if(userOption == 4)
      {
        System.out.print("\033[H\033[2J" + "You chose Meme Generator");
      }

      else if(userOption == 5)
      {
        System.out.print("\033[H\033[2J" + "You chose Stoic Quote");
      }

      else if(userOption == 6)
      {
        System.out.print("\033[H\033[2J" + "You chose Guessing Game");
      }

      else if(userOption == 7)
      {
        System.out.print("\033[H\033[2J" + "You chose OS Version");
      }

      else if(userOption == 8)
      {
        System.out.print("\033[H\033[2J" + "You chose Exit");
      }
      else
      {
        System.out.println("Invalid Option, Please Try Again");
      }
      
    }
      
  }
          
  private static void print(String text)
  {
    System.out.println(text);

  }

  private static boolean login(String username, String password)
  {
    if(username.equals("test") && password.equals("test"))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  private static void loading(){
    try 
      {
        for (int j = 0; j < 10; j++) 
        {
          System.out.print("\033[H\033[2J");
          System.out.print("Loading");
          System.out.print(".");
          Thread.sleep(300);
          System.out.print(".");
          Thread.sleep(300);
          System.out.print(".");
          Thread.sleep(300);
        }
      for(int i = 0; i < 100; i++)
      {
        System.out.print("\033[H\033[2J");
        //System.out.println("Loading...");
        System.out.println("\rProgess: " + i + "%");
        Thread.sleep(50);
      }
      Thread.sleep(200);
    } catch (InterruptedException e) 
      {
        Thread.currentThread().interrupt();
    }
  }
}
class userInfo
{
  String username;
  String password;
}
