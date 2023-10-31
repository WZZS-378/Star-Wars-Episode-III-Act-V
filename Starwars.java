import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Starwars{

 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
    intro();
    choice();
    System.out.print("Choose YOU: (write Anakin[+2 ATT] or Obi-Wan[+3 DEF]) ");
    String answer = scanner.nextLine();
    
    
      //Anakin Line
     if (answer.equalsIgnoreCase("Anakin")){
    Anakin playerAn = new Anakin();
    playerAn.anakinPath();
     }
      //Obi-Wan line
      else if (answer.equalsIgnoreCase("Obi-Wan")){
    Obiwan playerOb = new Obiwan();
    playerOb.obiwanPath();
      }

  scanner.close();
}


 static void intro(){
    slowPrint("A long time ago in a galaxy far, far away...");
    System.out.println();
    slowPrint("*main theme playing*");
    System.out.println();
    slowPrint("STAR WARS");
    System.out.println();
    slowPrint("Epsode III: REVENGE OF THE SITH");
    System.out.println();
    slowPrint("Act V: The Fall of Anakin Skywalker and The Rise of Lord Darth Vader");
    System.out.println();
    slowPrint("                    .-.");
    System.out.println();
    slowPrint("                   |_:_|");
    System.out.println();
    slowPrint("                  /(_Y_)\\ ");
    System.out.println();
    slowPrint("                 (  VMV  )");
    System.out.println();
    slowPrint("               _.'-/'-'\\-'._");
    System.out.println();
    slowPrint("             _/.--'[[[[]'--.\\_");
    System.out.println();
    slowPrint("            /   ./ |oUU| \\.' :\\");
    System.out.println();
    slowPrint("------------------------------------------");
    System.out.println();
}


  static void choice(){
    slowPrint("*YOU feel the Melting and Scorching heat of Mustafar passing through YOUR hair*");
    System.out.println();
    slowPrint("*The Force runing through YOUR whole body*");
    System.out.println();
    slowPrint("*YOU feel Regret and Anger, Sadnees that deeply stuck in YOUR Mind and Soul*");
    System.out.println();
    slowPrint("*Dark Side, Light Side, this is Unimportant now. But it Matters who are YOU*");
    System.out.println();
  }


  static void slowPrint(String output) {
    for (int i = 0; i<output.length(); i++) {
      char c = output.charAt(i);
      System.out.print(c);
      try {
        TimeUnit.MILLISECONDS.sleep(56);
      }
      catch (Exception e) {
      }
    }
  }

}