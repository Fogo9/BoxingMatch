public class Fighter {

    String name;

    int damage;

    int health;

    int weight;

    double dodge;



    Fighter(String name, int damage, int health, int weight, double dodge){

        this.name = name;

        this.damage = damage;

        this.health = health;

        this.weight = weight;

        this.dodge = dodge;

    }

    int hit(Fighter foe){

        System.out.println("------------");

        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " damage hit. ");

        if (foe.dodge()){

            System.out.println(foe.name + " blocked incoming damage. ");

            return foe.health;

        }

        return Math.max(foe.health - this.damage, 0);

    }

    boolean dodge(){

        double randomValue = Math.random() * 100;

        return randomValue <= this.dodge;
        
    }

}
