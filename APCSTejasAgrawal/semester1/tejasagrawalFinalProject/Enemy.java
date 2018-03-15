public class Enemy {                                //stores enemy values
    int health, agility, attack;

    public Enemy () {                               //constructor no parameter
        health = 0;
        agility = 0;
        attack = 0;
    }

    public Enemy (int hp, int agile, int atk) {     //constructor overloaded, if statistics entered
        health = hp;
        agility = agile;
        attack = atk;
    }

    public int getHP() {                            //these methods retrieve enemy stats
        return health;
    }

    public int getAgility() {
        return agility;
    }

    public int getAttack() {
        return attack;
    }

    public Enemy getStats(int e) {                       //stores enemies in enemy array
        Enemy[] enemies = new Enemy[4];                  //declares array, 4 enemies

        enemies[0] = new Enemy  (200,   0,   50);        //enemy:    crod
        enemies[1] = new Enemy  (500,   5,   70);        //enemy:    brock
        enemies[2] = new Enemy  (750,   10,  80);        //enemy:    strut
        enemies[3] = new Enemy  (2000,  20,  125);       //enemy:    mercy

        return enemies[e];
    }
}

