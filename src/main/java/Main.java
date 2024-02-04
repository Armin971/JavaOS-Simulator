public class Main 
{
  public static void main(String[] args) 
  {


    System.out.println("Lugi");
    
    if(login("test", "test"))
    {
      print("hey there");
    }
 
    
  }
  private static void print(String text)
  {
    System.out.println(text);

  }


  private static boolean login(String username, String password){
    if(username.equals("test") && password.equals("test")){
      return true;
    }
    else
    {
      return false;
    }
  }
}