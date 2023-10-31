import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Anakin{
Scanner scanner = new Scanner(System.in);
Random random = new Random();
String nameAn = "Anakin";
int healthAn = 7;
int healthEn = 7;
int skillAt = 2;


   public void anakinPath(){
    slowPrint("(Anakin Skywalker born on Tatooine. He served the Galactic Republic as a Jedi Knight, and recently the Galactic Empire as the Sith Lord Darth Vader.)");
    System.out.println();
    slowPrint("YOUR mission is to convince YOUR former master Obi-Wan Kenobi to join The Dark Side of The Force or kill him...");
    System.out.println(); 
    System.out.println();

    //scene1
      System.out.println("---------------------------------------------------------------------------------");
      slowPrint("Anakin: (seeing Obi-Wan) Liar!");
      System.out.println();
      slowPrint("*Padme turns around and sees Obi-Wan standing in the doorway of the Naboo Cruiser*");
      System.out.println();

      slowPrint("Anakin: /1: You're with him! You've betrayed me! You brought him here to kill me!/ /2: *Start choking HER*/ ");
      int answer1 = scanner.nextInt();
       if (answer1 == 1){
        System.out.println();
        slowPrint("Padme: NO! Anakin. I swear ...");
        System.out.println();
        slowPrint("*Anakin reaches out, and Padme grabs her throat as she starts to choke*");
       }
       System.out.println();
       slowPrint("Obi-Wan: Let her go, Anakin!");
       System.out.println();
       slowPrint("Anakin: /1: *Let HER go*/ /2: *Chouke HER to death*/ ");
       int answer2 = scanner.nextInt();
        if (answer2 == 1){
          System.out.println();
          slowPrint("*Anakin releases his grip on the unconscious Padme and she crumples to the ground*");
          System.out.println();
          slowPrint ("Anakin: You will not take her from me! *Throws off HIS cloak*");
          System.out.println();
          slowPrint("Obi-Wan: Your anger and your lust for power have already done that. *Flings off HIS cloak*");
          System.out.println();
          slowPrint("Anakin: /1: Don't make me kill you!/ /2: You will die./ ");
           int answer3 = scanner.nextInt();
            if (answer3 == 1){
             System.out.println();
             slowPrint("Obi-Wan: Anakin, my allegiance is to the Republic ... to democracy!");
             System.out.println();
             slowPrint("Anakin: If you're not with me, you're my enemy.");
             System.out.println();
             slowPrint("Obi-Wan: Only a Sith Lord deals in absolutes. I will do what I must. *Ignites his lightsaber*");
             System.out.println();
             slowPrint ("Anakin: You will try. *Ignites his lightsaber*");
             System.out.println();
             duel("Obi-Wan", 13, 9, 1, 1, 1, random, scanner);
             System.out.println();
            }
             else{
              System.out.println();
              slowPrint("Obi-Wan: We'll see... *Ignites his lightsaber*");
              System.out.println();
              slowPrint("Anakin: *Ignites his lightsaber*");
              System.out.println();
              duel("Obi-Wan", 15, 10, 1, 1, 1, random, scanner);
              System.out.println();
             }
        } 

        else{
          System.out.println();
          slowPrint("Obi-Wan: NO! *Fast ignites his lightsaber*");
          System.out.println();
          duel("Obi-Wan", 16, 13, 3, 2, 3, random, scanner);
          System.out.println();
          duel("Obi-Wan", 18, 16, 6, 5, 5, random, scanner);
          System.out.println();
          duel("Obi-Wan", 20, 19, 7, 7, 7, random, scanner);
          System.out.println();
        }

    //scene2
    System.out.println("---------------------------------------------------------------------------------");
    slowPrint("*Anakin and Obi-Wan move their fight toward the main control center. As the laser swords fly, bits of the hallway are cut up. Obi-Wan and Anakin jump and use every trick in the Jedi book*");
    System.out.println();
    duel("Obi-Wan", 14, 11, 2, 2, 2, random, scanner);
    System.out.println();

    //scene3
    System.out.println("---------------------------------------------------------------------------------");
    slowPrint("*Anakin, following Obi-Wan, jumps down onto the flexing pipe, lands, and resumes fighting*");
    System.out.println();
    duel("Obi-Wan", 18, 15, 4, 4, 3, random, scanner);
    System.out.println();   

    //scene4
    System.out.println("---------------------------------------------------------------------------------");
    slowPrint("*Obi-Wan realizes he is getting very close to the edge of the lava falls. He grabs a rope and leaps from the collection arm. Anakin follows. Anakin and Obi-Wan continue their sword fight hanging from cables as they swing past each other*");
    System.out.println();
    duel("Obi-Wan", 17, 14, 7, 6, 7, random, scanner);
    System.out.println(); 
    
    //scena5
    System.out.println("---------------------------------------------------------------------------------");
    slowPrint("*Obi-Wan does a double hack-flip and lands squarely on the floating platform. He immediately leans to one side and moves away from the tower.*");
    System.out.println();
    slowPrint("*Anakin jumps and flips onto OBI- WAN's platform. The fighting continues again*");
    System.out.println();
    duel("Obi-Wan", 18, 16, 7, 6, 7, random, scanner);
    slowPrint("*Obi-Wan jumps toward the safety of the black sandy edge of the lava river. He yells at Anakin.*");
    System.out.println();
    slowPrint("Obi-Wan: It's over, Anakin. I have the high ground.");
    System.out.println();
    slowPrint("Anakin: You underestimate my power!");
    System.out.println();
    slowPrint("Obi-Wan: Don't try it.");
    System.out.println();
    slowPrint("Anakin: /1: *Try to kill Obi-Wan*/ /2: *Throw YOUR lightsaber*/ ");
    int answer3 = scanner.nextInt();
     if (answer3 == 1){
      //Ending 1 (classical)
      System.out.println();
      slowPrint("*Obi-Wan cuts Anakins young apprentice at the knees, then cuts off his left arm in the blink of an eye. Anakin tumbles down the embankment and rolls to a stop near the edge of the lava*");
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
      slowPrint("*An Imperial Shuttle closes its wings and settles on the highest of the Mustafar Landing Platforms. A platoon of Clone Troopers exits the craft, followed by Darth Sidious.*");
      System.out.println();
      slowPrint("*Darth Sidious discovers what remains of ANAKIN and checks him out. He turns to the Clones.*");
      System.out.println();
      slowPrint("Darth Sidious: Anakin! Anakin! There he is. He's still alive. Get a medical capsule, immediately!");
      System.out.println();
      slowPrint("Clone Captain: Yes sir. Right away.");
      System.out.println();
      slowPrint("\\GAME OVER..?/");
      System.exit(0);
     }
     
      else{
       //Ending 2 (alternative)
       System.out.println();
       slowPrint("*Obi Wan: Not expecting this, jumps towards YOU and the final battle begins*");
       System.out.println();
       duel("Obi-Wan", 18, 17, 7, 7, 7, random, scanner);
       System.out.println();
       slowPrint("*Anakin has defeated his master and awaits the arrival of Lord Sidious*");
       System.out.println();
       System.out.println("---------------------------------------------------------------------------------");
       slowPrint("*An Imperial Shuttle closes its wings and settles on the highest of the Mustafar Landing Platforms. A platoon of Clone Troopers exits the craft, followed by Darth Sidious.*");
       System.out.println();
       slowPrint("Darth Sidious: Lord Vader, excelent work. The Galaxy is ours now...");
       System.out.println();
       slowPrint("Anakin: /1: *Bend the knee*/ /2: *Sneaky kill Darth Sisious*/ /3:*Challenge to a duel*/ ");
       int answer4 = scanner.nextInt();
       if (answer4 == 1){
        slowPrint("Darth Sidious: We'll protect the Galaxy from the Jedi...");
        System.out.println();
        slowPrint("\\GAME OVER/");
        System.exit(0);
       }
        else if (answer4 == 2){
          slowPrint("Darth Sidious: A-AH...");
          System.out.println();
          slowPrint("*Darth Sidious: slowly sliding down with a hole in his chest*");
          System.out.println();
          slowPrint("Anakin: No. The Galaxy belongs to me. It's MINE.");
          System.out.println();
          slowPrint("\\GAME OVER/");
          System.exit(0);
        }
         else{
          slowPrint("Darth Sidious: What?! It's treason then... *Ignites his lightsaber*");
          System.out.println();
          duel("Darth Sidious", 20, 19, 7, 7, 7, random, scanner);
          System.out.println();
          slowPrint("*Darth Sidious: slowly sliding down splited in half*");
          System.out.println();
          slowPrint("Anakin: I am Emperor Vader.");
          System.out.println();
          slowPrint("\\GAME OVER/");
          System.exit(0);         
         }
        
        }
    }

    
    public void duel(String nameEn, int succesAt, int succesDe, int damPar, int damDef, int damAtt, Random random, Scanner scanner){
    System.out.println("Lightsabers swing!");
    System.out.println("(The success of "+ nameAn +"s ATTACK/DEFENCE will depend on the VALUE of the d20 dice rolled (DnD system). The success VALUE is written in brackets)");
    System.out.println("(Remember that DEFENCE always requires less VALUE and less DAMAGE)");
    slowPrint("What are you going to do, " + nameAn + ": /1: Attack("+ succesAt +")/ /2: Defence("+ succesDe +")/ ");
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
      slowPrint("Special skill: +"+ skillAt +".");
      System.out.println();
      slowPrint("Oveall: "+ (yourDice + skillAt) +".");
      System.out.println();
       if ((yourDice + skillAt) >= succesAt){
        slowPrint(nameAn +" successfully attacked "+ nameEn +".");
        System.out.println();
        healthEn = healthEn - damAtt;
         if (healthEn <= 0){
          slowPrint(nameAn +" splitted in half "+ nameEn +".");
          System.out.println();
          System.exit(0);
          //ending
         }
       }
         else if (yourDice <= 10){
          slowPrint(nameEn +" parried your blow and hit back.");
          System.out.println();
          healthAn = healthAn - damPar;
          if(healthAn == 6){
            slowPrint(nameAn +" have a few minor cuts.");
            System.out.println();
          }
           else if((healthAn <= 5) && (healthAn > 3)){
            slowPrint(nameAn +" have a significant cuts.");
            System.out.println();
            }
              else if((healthAn <= 3) && (healthAn >= 1)){
                slowPrint(nameAn +" badly wounded.");
                System.out.println();
              }
               else if (healthAn <= 0){
                slowPrint(nameAn + " died.");
                System.out.println();
                slowPrint(nameEn + " won "+ nameAn +" in a fair duel.");
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
       System.out.println("No Special Skill for DEFENCE.");
        if (yourDice >= succesDe){
         slowPrint(nameAn +" successfully defended himself.");
         System.out.println();
        }
         else{
           slowPrint(nameEn + " used advanced technique that you couldn't dodge.");
           System.out.println();
           healthAn = healthAn - damDef;
            if(healthAn == 6){
              slowPrint(nameEn +" have a few minor cuts.");
              System.out.println();
            }
             else if((healthAn <= 5) && (healthAn > 3)){
              slowPrint(nameAn +" have a significant cuts.");
              System.out.println();
             }
              else if((healthAn <= 3) && (healthAn >= 1) ){
                slowPrint(nameAn +" badly wounded.");
                System.out.println();
              }
               else if (healthAn <= 0){
                slowPrint(nameAn + " died.");
                System.out.println(" ");
                slowPrint(nameEn + " won "+ nameAn +" in a fair duel.");
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