public class Weapon {                                   //stores weapon values
    int lightdmg, heavydmg, fortify;

    public Weapon () {                                  //constructor no parameter
        lightdmg = 0;
        heavydmg = 0;
        fortify = 0;
    }

    public Weapon (int light, int heavy, int fort) {    //constructor overloaded, if statistics entered
        lightdmg = light;   //saves input
        heavydmg = heavy;
        fortify = fort;
    }

    public int getLight() {                             //these methods retrieve weapon stats
        return lightdmg;
    }

    public int getHeavy() {
        return heavydmg;
    }

    public int getFortify() {
        return fortify;
    }

    public Weapon getStats(int e) {                      //stores weapons in a weapon array
        Weapon[] weapons = new Weapon[4];                //declares array, 4 weapons

        weapons[0] = new Weapon (40,  100, 100);         //weapon:  basic sword
        weapons[1] = new Weapon (80,  200, 125);         //weapon:  cutlass
        weapons[2] = new Weapon (120, 300, 150);         //weapon:  bludgeon
        weapons[3] = new Weapon (200, 500, 200);         //weapon:  scythe

        return weapons[e];
    }
}