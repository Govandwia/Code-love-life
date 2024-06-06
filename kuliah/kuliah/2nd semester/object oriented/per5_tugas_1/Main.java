package per5_tugas_1;
import java.util.Scanner;
import java.util.HashMap;
import per5_tugas.Buku;

public class Main {
   private static final Scanner sc = new Scanner(System.in);
   private static User user = new User("blablabla", "blabla", "bla");
   private static Buku buku = new Buku("blabla", "blablabla");
   public static void main(String[] args) {
      boolean exitRequested = false;
      while (!exitRequested) {
         System.out.println("Press:" + "\n" +
                             "1.register" + "\n" + 
                             "2.login" + "\n" +
                             "3.exit" + "\n" + 
                             "4.Check book status");
                             // KURANG LOGIN NYA
      int choice = sc.nextInt();
      switch (choice) {
         case 1:
            register();
            break;
         case 2:
            login();
            break;
         case 3:
            exitRequested = true;
            break;
         case 4 :
            buku.isBukuDipinjam();
            break;
         default:
            System.out.println("???");
            break;
      }
      }
   } 

   public static void register() {
      System.out.println("==REGISTER==");
      System.out.println("Input your name: ");
      String nama = sc.next();
      System.out.println("input your role: ");
      String role = sc.next();
      System.out.println("input new password:");
      String password = sc.next();
      User newUser = new User(nama, role, password);
      user.register(newUser);
      login();
   }

   public static void login() {
      System.out.println("==LOGIN==");
      System.out.println("input ur name: ");
      String nama = sc.next();
      System.out.println("input ur password");
      String password = sc.next();

      User x = new User(); //call the User class
      HashMap<String, String> loginUser = x.getUserMap();
      find(loginUser, nama, password);
   }

   public static void find(HashMap<String, String> loginUser, String nama, String password){
      for (String i : loginUser.keySet() ) {
         if (i.equals(nama) && loginUser.get(i).equals(password)) {
            System.out.println("User is found!");
            System.out.println("Program will now terminate");
            System.exit(0);
            break;
         }
      }
      System.out.println("User not found.login again!");
      login();
   }

}
