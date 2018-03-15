//**********************************************************************
//  NoMercy Text based battle game
//  By      Tejas Agrawal
//  Date    December 2015
//  FINAL PROJECT AP COMP SCI SEMESTER ONE
//**********************************************************************

import java.util.Scanner;                                //allows keyboard input
import java.util.Random;                                 //allows RNG

public class NoMercy {
    public static void main (String[] args) {
        //STARTING OBJECTS AND VARIABLES
        Scanner scan = new Scanner(System.in);           //keyboard input
        Random generator = new Random();                 //random number generator

        final int USER_MAX_HP = 1000, FORTIFY_LIMIT = 10;//how much user starts with and the cap
        final int LIGHT_ODDS = 75, HEAVY_ODDS = 60, FORTIFY_ODDS = 80;
        //gives chances of hitting

        int lightchance, heavychance, fortifychance;     //stats for calculating chances of hitting based on attack
        int choice = 0;                                  //users choice of attack

        int userhp = USER_MAX_HP;                        //instantiates user at max health
        int fortifynum = FORTIFY_LIMIT;                  //instantiates fortifications remaining at max

        //EXTRACTS INFORMATION FROM CLASSES AND STORES IN ARRAYS OF OBJECTS
        Enemy[] enemies = new Enemy[4];                  //declares array, 4 enemies
        Weapon[] weapons = new Weapon[4];                //declares array, 4 weapons

        for (int e = 0; e<=3; e++) {                     //make loop that takes information from class and puts it into an array
            enemies[e] = new Enemy();
            enemies[e] = enemies[e].getStats(e);

            weapons[e] = new Weapon();
            weapons[e] = weapons[e].getStats(e);
        }

        //INTRODUCTION
        System.out.println("*******************************************************");
        System.out.println("-------------------------------------------------------");
        System.out.println("Hello and welcome to NoMercy: A text-based battle game.");

        System.out.print("Would you like instructions? (1 = Yes, 2 = No): ");
        int instruction = scan.nextInt();                //tells us if the user wants instructions

        //INSTRUCTIONS
        if (instruction == 1) {
            System.out.println("-------------------------------------------------------");
            System.out.println("In this game, you are a noble warrior competing in a knights tournament. The objective of the");
            System.out.println("game is to defeat your enemies before they defeat you.");
            System.out.println();
            System.out.println("The battles are turn-based, and each turn both you and your opponnent get a chance to attack.");
            System.out.println("When attacking you have three options. A light attack, a heavy attack or a fortification.");
            System.out.println();
            System.out.println("A light attack is the basic attack. It does a good amount of damage and doesn't miss much.");
            System.out.println();
            System.out.println("A heavy attack deals much more damage than a light attack, but has much fewer odds of success.");
            System.out.println();
            System.out.println("Fortification is a defensive move which heals your user if done succesfully. It has the highest");
            System.out.println("chances of success and also when fortified, the enemy cannot attack you. Fortifications are very");
            System.out.println("a very powerful and useful move. For this reason, you are limited to "+FORTIFY_LIMIT+" of them.");
            System.out.println();
            System.out.println("Note: Only succesful fortifications count. If you attempt to fortify with none left, you will be");
            System.out.println("automatically unsuccessful.");
            System.out.println();
            System.out.println("Every turn, after you attack, your opponent has the chance to attack too, but your opponenents");
            System.out.println("don't vary their attacks. This means that you can expect the same amount of damage from them every");
            System.out.println("turn. They also usually never miss their attacks.");
            System.out.println();
            System.out.println("The damage you deal and how much you heal is dependant on the weapon you possess. You begin with");
            System.out.println("a basic weapon, but you will unlock better weapons as you progress the game.");
            System.out.println();
            System.out.println("Your opponents health, damage dealt, and chances of dodging attacks are dependant on them. As you");
            System.out.println("progress the game, your enemies will get stronger, more dangerous and quicker.");
            System.out.println("-------------------------------------------------------");
        }
        System.out.println();
        System.out.print("BEWARE: NO RESPAWNS. IN THE ARENA THERE IS NO MERCY.");
        System.out.println();
        System.out.println("You approach your first opponent; Crod. He is weak and possesses a lowly 200 health. Weilding your");
        System.out.println("basic sword, you charge into battle.");
        System.out.println();

        //FOR LOOP RUNS ONCE FOR EACH ENEMY
        for (int i = 0; i<=3; i++) {

            if (i==3 && userhp > 0)                 //restores user to full health if facing boss and hasn't lost
                userhp = USER_MAX_HP;

            //CALCULATES BATTLE VALUES FOR THIS SPECIFIC ENEMY AND WEAPON
            int enemyhp = enemies[i].getHP();

            lightchance = LIGHT_ODDS - enemies[i].getAgility();    //all battle odds are base odds minus opponents dodge stat
            heavychance = HEAVY_ODDS - enemies[i].getAgility();    //chance should get a int between 1-100
            fortifychance = FORTIFY_ODDS - enemies[i].getAgility();//eg. 60 means 60% chance of hitting, 70 means 70%

            //BATTLE ENGINE LOOP
            while (userhp > 0 && enemyhp > 0) {     //one loop is one turn for both sides

                int hitchance = 0, random = 0;      //users chance of hitting and whether they hit or not
                int outgoingdmg = 0, heal = 0;      //choice variable lets user choose attack
                System.out.println();
                System.out.println("-------------------------------------------------------");
                System.out.print("Choose your move (Light attack = 1, Heavy attack = 2, Fortify = 3): ");
                choice = scan.nextInt();            //user chooses what attack
                int bonus = generator.nextInt(11);  //a random number from 0-10, to add some randomness
                int enemybonus = generator.nextInt(6);//a random number from 0-5, to add some randomness

                switch (choice) {                   //will retrieve damage and calculate chance depending on attack
                    case 1:     //light
                    outgoingdmg = weapons[i].getLight() + bonus;
                    heal = 0;                       //dmg will be swords light stat plus a random range of 10
                    hitchance = lightchance;        //chance will be light odds
                    break;

                    case 2:     //heavy
                    outgoingdmg = weapons[i].getHeavy() + bonus;
                    heal = 0;                       //dmg will be swords heavy stat plus a random range of 10
                    hitchance = heavychance;        //chance will be heavy odds
                    break;

                    case 3:     //fortify
                    outgoingdmg = 0;                //heal will be swords fortify stat plus a random range of 10
                    heal = weapons[i].getFortify() + bonus;
                    hitchance = fortifychance;      //chance will be fortify odds
                    break;
                }

                random = generator.nextInt(100)+1;  //chooses a number between 1-100
                if (fortifynum <= 0) {              //no more fortifications left
                    System.out.println("You're move was unsuccessful. You're out of fortifications!!");
                    heal = 0;
                }
                else if (random > hitchance) {      //unsuccessful move
                    System.out.println("You're opponent was too quick, you weren't able to execute your move.");
                    outgoingdmg = 0;                //no damage done
                    heal = 0;                       //no heal
                }

                if (heal != 0) {                     //successful fortification
                    fortifynum--;
                    System.out.println("You have successfully fortified. You healed yourself for "+heal+" health.");
                }

                enemyhp -= outgoingdmg;             //user attacks
                if (outgoingdmg !=0 )
                    System.out.println("You succesfully attacked your opponent for " + outgoingdmg + " health.");

                //user heals
                if ( userhp + heal > 1000) {        //heals yourself
                    userhp = 1000;                  //caps userhp at a thousand
                }
                else {
                    userhp += heal;
                }

                //enemy attacks     
                int incomingdmg = enemies[i].getAttack() + enemybonus; //determines how much enemy hurts you

                if (heal == 0 && enemyhp > 0) {     //user cannot be fortified and enemy must be alive to attack
                    System.out.println("Your opponent attacked you for " +incomingdmg+ " health.");
                    userhp -= incomingdmg;          //subtracts incoming damage from user health
                }

                if (userhp < 0)                      //disallows negative health
                    userhp = 0;

                if (enemyhp < 0)
                    enemyhp = 0;

                System.out.println();
                System.out.println("YOUR HEALTH: " + userhp + "\t ENEMY HEALTH: " + enemyhp + "\t FORTIFIES LEFT: " + fortifynum);

                if (enemyhp <= 0) {                  //when an enemy is defeated

                    switch (i) {    //prepares for next battle
                        case 0:                      //defeated Crod
                        System.out.println();
                        System.out.println("-------------------------------------------------------");
                        System.out.println("You have successfully defeated Crod. You take Crod's Cutlass as a reward of your"); 
                        System.out.println("victory and march towards your second battle.");
                        System.out.println();
                        System.out.println("You now face Brock. A stronger creature than Crod, yet still relatively weak. He");
                        System.out.println("possesses 500 health, however your weapon is stronger. Cutlass in hand you charge!");
                        break;

                        case 1:                      //defeated Brock
                        System.out.println();
                        System.out.println("-------------------------------------------------------");
                        System.out.println("You have successfully defeated Brock. You take Brock's Bludgeon as a reward of your"); 
                        System.out.println("victory and march towards your third battle. This will be your last battle before");
                        System.out.println("facing the almighty champion, Mercy.");
                        System.out.println();
                        System.out.println("You now face Strut. A much stronger creature than anyone faced before. He possesses");
                        System.out.println("a gigantic 1000 health, however your weapon is stronger.");
                        System.out.println("Note: Health will be restored before your final battle. Fortifications will not be.");
                        break;

                        case 2:                      //defeated Strut
                        System.out.println();
                        System.out.println("-------------------------------------------------------");
                        System.out.println("A thunderous applause from the crowd as Strut falls. You pick up his mighty scythe"); 
                        System.out.println("and march to the healing chamber. Your health is restored in preperation for the");
                        System.out.println("fight with the powerful, Mercy. This battle will be your last and most difficult.");
                        System.out.println();
                        System.out.println("You now face Mercy. The strongest creature in the land. He possesses an unthinkable");
                        System.out.println("2000 health, however your weapon is one of the strongest. Defeat Mercy and all the ");
                        System.out.println("glory is yours. Watch out, not only is he big and strong, he's also quick.");
                        System.out.println();
                        System.out.println("For one last time, you step into the battle arena. The crowd screams as you begin.");
                        break;

                        case 3:                      //game ends, no next battle
                        break;
                    }
                }
            }
        }

        System.out.println("-------------------------------------------------------");

        if (userhp > 0) {   //ending messages for winning
            System.out.println("Congratulations! You have beaten Mercy and won the tournament! You were able to defeat him");
            System.out.println("with " + userhp + " health left. The crowd goes wild as you pick up Mercy's Marauder and wave");
            System.out.println("it around. You keep the marauder as a trophy and become the new arena champion.");
            System.out.println("The new Mercy.");
            System.out.println("THE END");
        }
        else                //ending losing message
            System.out.println("Oh no! You have been defeated. You may try again from the beginning.");

        System.out.println("-------------------------------------------------------");
        System.out.println("*******************************************************");
    }
}