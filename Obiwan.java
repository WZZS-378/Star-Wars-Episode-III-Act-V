import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Obiwan{
Scanner scanner = new Scanner(System.in);
Random random = new Random();
String nameOb = "Obi-Wan";
int healthOb = 7;
int healthEn = 7;
int skillDe = 3;

 public void obiwanPath(){
    slowPrint("(A Jedi Master, Obi-Wan Kenobi noble man. He trained Anakin Skywalker, served as a general in the Republic Army during the Clone Wars.)");
    System.out.println();
    slowPrint("YOUR Duty is to stop your former padawan Anakin Skywalker...");
    System.out.println(); 
    System.out.println();

    //scene1
    System.out.println("---------------------------------------------------------------------------------");
    slowPrint("Anakin: (seeing Obi-Wan) Liar!");
    System.out.println();
    slowPrint("*Padme turns around and sees Obi-Wan standing in the doorway of the Naboo Cruiser*");
    System.out.println();
    slowPrint("Anakin: You're with him! You've betrayed me! You brought him here to kill me!");
    System.out.println();
    slowPrint("Padme: NO! Anakin. I swear ...");
    System.out.println();
    slowPrint("*Anakin reaches out, and Padme grabs her throat as she starts to choke*");
    System.out.println();
    slowPrint("Obi-Wan: /1: Let her go, Anakin!/ /2: *Do nothing*/ ");
    int answer5 = scanner.nextInt();
     if (answer5 == 1){
      System.out.println();
          slowPrint("*Anakin releases his grip on the unconscious Padme and she crumples to the ground*");
          System.out.println();
          slowPrint ("Anakin: You will not take her from me! *Throws off HIS cloak*");
          System.out.println();
          slowPrint("Obi-Wan: /1: Your anger and your lust for power have already done that. *Flings off HIS cloak*/ /2: Shall we start, Anakin./ ");
          int answer6 = scanner.nextInt();
           if (answer6 == 1){
            System.out.println();
            slowPrint("Anakin: Don't make me kill you!");
            System.out.println();
            slowPrint("Obi-Wan: Anakin, my allegiance is to the Republic ... to democracy!");
            System.out.println();
            slowPrint("Anakin: If you're not with me, you're my enemy.");
            System.out.println();
            slowPrint("Obi-Wan: Only a Sith Lord deals in absolutes. I will do what I must. *Ignites his lightsaber*");
            System.out.println();
            slowPrint ("Anakin: You will try. *Ignites his lightsaber*");
            System.out.println();
            duel("Anakin", 13, 9, 1, 1, 1, random, scanner);
            System.out.println();
           }
             else{
              System.out.println(" ");
              slowPrint("Anakin: You will die, master. *Ignites his lightsaber*");
              System.out.println(" ");
              slowPrint("Obi-Wan: We'll see... *Ignites his lightsaber*");
              System.out.println(" ");
              duel("Anakin", 15, 10, 1, 1, 1, random, scanner);
              System.out.println(" ");
             }
     }
      else{
        System.out.println();
        slowPrint("Anakin: *Chocke Padme to death*");
        System.out.println();
        slowPrint("Anakin: Why don't you stop me?! What have i done?! You... It's all because of you! *Ignites his lightsaber*");
        System.out.println();
        slowPrint("Obi-Wan: No, Anakin, it's all because of your anger and your lust for power...");
        System.out.println();
        slowPrint("Anakin: A-AA!");
        System.out.println();
        duel("Anakin", 16, 13, 3, 2, 3, random, scanner);
        System.out.println();
        duel("Anakin", 18, 16, 6, 5, 5, random, scanner);
        System.out.println();
        duel("Anakin", 20, 19, 7, 7, 7, random, scanner);          
        System.out.println();
      }

      //scene2
      System.out.println("---------------------------------------------------------------------------------");
      slowPrint("*Anakin and Obi-Wan move their fight toward the main control center. As the laser swords fly, bits of the hallway are cut up. Obi-Wan and Anakin jump and use every trick in the Jedi book*");
      System.out.println();
      duel("Anakin", 14, 11, 2, 2, 2, random, scanner);
      System.out.println();
  
      //scene3
      System.out.println("---------------------------------------------------------------------------------");
      slowPrint("*Anakin, following Obi-Wan, jumps down onto the flexing pipe, lands, and resumes fighting*");
      System.out.println();
      duel("Anakin", 18, 15, 4, 4, 3, random, scanner);
      System.out.println();   
  
      //scene4
      System.out.println("---------------------------------------------------------------------------------");
      slowPrint("*Obi-Wan realizes he is getting very close to the edge of the lava falls. He grabs a rope and leaps from the collection arm. Anakin follows. Anakin and Obi-Wan continue their sword fight hanging from cables as they swing past each other*");
      System.out.println();
      duel("Anakin", 17, 14, 7, 6, 7, random, scanner);
      System.out.println(); 
      
      //scene5
      System.out.println("---------------------------------------------------------------------------------");
      slowPrint("*Obi-Wan does a double hack-flip and lands squarely on the floating platform. He immediately leans to one side and moves away from the tower.*");
      System.out.println();
      slowPrint("*Anakin jumps and flips onto OBI- WAN's platform. The fighting continues again*");
      System.out.println();
      duel("Anakin", 18, 16, 7, 6, 7, random, scanner);
      slowPrint("*Obi-Wan jumps toward the safety of the black sandy edge of the lava river. He yells at Anakin.*");
      System.out.println();
      slowPrint("Obi-Wan: It's over, Anakin. I have the high ground.");
      System.out.println();
      slowPrint("Anakin: You underestimate my power!");
      System.out.println();
      slowPrint("Obi-Wan: /1: Don't try it./ /2: **/ ");
      int answer7 = scanner.nextInt();
       if (answer7 == 1){
      //Ending 1 (classical)
      System.out.println();
      slowPrint("*Anakin follows, and Obi-Wan cuts Anakins young apprentice at the knees, then cuts off his left arm in the blink of an eye. Anakin tumbles down the embankment and rolls to a stop near the edge of the lava*");
      System.out.println();
      slowPrint("*Anakin struggles to pull himself up the embankment with his mechanical hand. His thin leather glove has been burned off. He keeps sliding down in the black sand*");
      System.out.println();
      slowPrint("Obi-Wan: You were the Chosen One! It was said that you would, destroy the Sith, not join them. It was you who would bring balance to the Force, not leave it in Darkness!");
      System.out.println();
      slowPrint("*Obi-Wan picks up Anakin's light saber and begins to walk away. He stops and looks back*");
      System.out.println();
      slowPrint("Obi-Wan: You were my brother, Anakin. I loved you.");
      System.out.println();
      slowPrint("Anakin: Suddenly bursts into flames and starts SCREAMING.");
      System.out.println();
      slowPrint("*Obi-Wan looks in horror as Anakin becomes engulfed in flames. He can't watch him as he struggles to climb the embankment, covered in flames*");
      System.out.println();
      slowPrint("*Obi-Wan runs back to Padme's ship as Anakin drops, smoldering, near the top of the lava pit*");
      System.out.println();
      System.out.println("---------------------------------------------------------------------------------");
      slowPrint("*Obi-Wan makes his way to the Skiff. He looks for Padme. THREEPIO sticks his head out the door of the Skiff*");
      System.out.println();
      slowPrint("C-3PO: Master Kenobi! We have Miss Padme on board. Please, please hurry. We should leave this dreadful place.");
      System.out.println();
      slowPrint("*Obi-Wan runs on board the Naboo Skiff*");
      System.out.println();
      slowPrint("*Padme lies on a cot or bed inside the ship. Obi-Wan walks over and checks on her*");
      System.out.println();
      slowPrint("Padme: Obi-Wan? Is Anakin all right?");
      System.out.println();
      slowPrint("*Obi-Wan looks at her sadly and does not answer. He brushes her hair back. Padme drops back into unconsciousness. R2-D2 watches over her*");
      System.out.println();
      slowPrint("*Obi-Wan rides in the co-pilot's station. He sits looking pensive. C-3PO drives*");
      System.out.println();
      slowPrint("\\GAME OVER.../");
      System.exit(0);
       }
        else{
        //Ending 2 (alternative)

        }

      }


    public void duel( String nameEn, int succesAt, int succesDe, int damPar, int damDef, int damAtt, Random random, Scanner scanner){
    System.out.println("Lightsabers swing!");
    System.out.println("(The success of "+ nameOb +"s ATTACK/DEFENCE will depend on the VALUE of the d20 dice rolled (DnD system). The success VALUE is written in brackets)");
    System.out.println("(Remember that DEFENCE always requires less VALUE and less DAMAGE)");
    System.out.println();
    slowPrint("What are you going to do, " + nameOb + ": /1: Attack("+ succesAt +")/ /2: Defence("+ succesDe +")/ ");
    int answer = scanner.nextInt();
    //Attack
     if ( answer == 1){
      System.out.println();
      slowPrint("For succesfull ATTACK YOU need to throw: "+ succesAt +" or more.");
      System.out.println();
      int edge = 20;
      int yourDice = random.nextInt(edge);  
      slowPrint("YOU throwed: "+ yourDice +".");
      System.out.println();
      System.out.println("No Special Skill for ATTACK.");
       if (yourDice >= succesAt){
        slowPrint(nameOb +" successfully attacked "+ nameEn +".");
        System.out.println();
        healthEn = healthEn - damAtt;
         if (healthEn <= 0){
          slowPrint(nameOb +" splitted in half "+ nameEn +".");
          System.out.println();
          System.exit(0);
          //ending
         }
       }
         else if (yourDice <= 10){
          slowPrint(nameOb +" parried your blow and hit back.");
          System.out.println();
          healthOb = healthOb - damPar;
          if(healthOb == 6){
            slowPrint(nameOb +" have a few minor cuts.");
            System.out.println();
          }
           else if((healthOb <= 5) && (healthOb > 3)){
            slowPrint(nameOb +" have a significant cuts.");
            System.out.println();
            }
              else if((healthOb <= 3) && (healthOb >= 1)){
                slowPrint(nameOb +" badly wounded.");
                System.out.println();
              }
               else if (healthOb <= 0){
                slowPrint(nameOb + " died.");
                System.out.println();
                slowPrint(nameEn + " won "+ nameOb +" in a fair duel.");
                System.out.println();
                slowPrint("\\GAME OVER/");
                System.exit(0);
               }          
         }
          else{
            slowPrint(nameEn + " used a maneuver and dodged the lightsaber.");
            System.out.println();
           } 
      }
      //Defence
      else{
       System.out.println();
       slowPrint("For succesfull DEFENCE YOU need to throw: "+ succesDe +" or more.");
       System.out.println();
       int edge = 20;
       int yourDice = random.nextInt(edge);  
       slowPrint("YOU throwed: "+ yourDice +".");
       System.out.println();
       slowPrint("Special skill: +"+ skillDe +".");
       System.out.println();
       slowPrint("Oveall: "+ (yourDice + skillDe) +".");
       System.out.println();
        if ((yourDice + skillDe) >= succesDe){
         slowPrint(nameOb +" successfully defended himself.");
         System.out.println();
        }
         else{
           slowPrint(nameEn + " used advanced technique that you couldn't dodge.");
           System.out.println();
           healthOb = healthOb - damDef;
            if(healthOb == 6){
              slowPrint(nameOb +" have a few minor cuts.");
              System.out.println();
            }
             else if((healthOb <= 5) && (healthOb > 3)){
              slowPrint(nameOb +" have a significant cuts.");
              System.out.println();
             }
              else if((healthOb <= 3) && (healthOb >= 1) ){
                slowPrint(nameOb +" badly wounded.");
                System.out.println();
              }
               else if (healthOb <= 0){
                slowPrint(nameOb + " died.");
                System.out.println(" ");
                slowPrint(nameEn + " won "+ nameOb +" in a fair duel.");
                System.out.println();
                slowPrint("\\GAME OVER/");
                System.exit(0);
               }              
         } 
      }
    }


    public void slowPrint(String output) {
     for (int i = 0; i<output.length(); i++) {
       char c = output.charAt(i);
       System.out.print(c);
       try {
         TimeUnit.MILLISECONDS.sleep(48);
       }
       catch (Exception e) {
      }
     }
   }

}