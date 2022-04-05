import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    private static int startHealth1 = 100;
    private static int startHealth2 = 100;
    private Scanner scan = new Scanner(System.in);
    private Random r = new Random();
    private int current1 = startHealth1;
    private int current2 = startHealth2;
    private int critalhit1= startHealth1 - 40;
    private int critalhit2= startHealth2 - 40;
    private int weakHit1 = startHealth1 - 20;
    private int weakHit2 = startHealth2 - 20;
    private boolean isPlaying = true;
    Squirtle s= new Squirtle();
    private int wHit = 20;
    private int cHit = 40;
    boolean inFight = true;



    public void startGame (){
        System.out.println("**************************** Crazy Music *********\n");
        System.out.println("A Wild Pikachu has appeared!\n");
        System.out.println("*Pikachu \n heath: " + startHealth2);
        meFight();
        while(inFight){


        if(chance()== true) {
            meFight();
        }
        else{
            AIfight();
        }}



    }

   private void meFight(){
       System.out.println("press x to use " + "waterGun\n");
       String choice = scan.nextLine();
       if(choice.toUpperCase().equals("X")){
           System.out.println(s.pokemoNname + " uses water gun!\n");
           if(chance()== true) {
               System.out.println("Direct hit! " + "this pokemon lost " + cHit + "hp " );
               System.out.println("New health: " + critalhit2 +"\n" );
           }
           else {
               System.out.println("weak hit! " + "this pokemon lost " + wHit + " hp" );
               System.out.println("New health: " + weakHit2 +"\n");
           }
       }

   }


    private boolean chance() {
        return this.r.nextInt(2) == 0;
    }
    private void AIfight(){
            System.out.println(" Oh no The pokemon attacked you !");
               chance();
                if(chance()== true) {
                    System.out.println("Direct hit! " + "you lost " + cHit + " hp" );
                    System.out.println("New health: " + critalhit1+"\n" );
                }
                else {
                    System.out.println("weak hit! " + "you lost " + wHit + " hp" );
                    System.out.println("New health: " + weakHit1+"\n" );
                }

    }
}
