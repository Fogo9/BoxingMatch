![ScreenShot](https://user-images.githubusercontent.com/98576037/164995589-1d3f479d-7a10-4ec9-a60e-c01ffd7536ec.jpg)


# **BOXING MATCH**

## INFORMATION

* **Boxing match: A match played in which two specific people hurt each other and block the damage from each other.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* **Fighter** and **Match** class information has been created.

* The names of the **fighters** have been determined.

* **Fighter class**: Fighters names, damage, health, weight, and blocking chances have been determined.

* **Match class**: The damage ratio of the fighters to each other, the remaining health after the damage, the block rate and the winner of the match determines.

* Attributes determined each turn: How much damage the fighter deals, who the fighter is who blocked incoming damage, and the fighter's remaining health after damage and damage blocking are determined.

* Fighter John : Damage = 25, Health = 130, Weight = 90 and Dodge = 35.

* Fighter Olivia : Damage = 20, Health = 120, Weight = 100 and Dodge = 30.

## CODES

```Java

        public class Boxingmatch {

            public static void main(String[] args) {

                Fighter john = new Fighter("John", 25, 130, 90, 35);

                Fighter olivia = new Fighter("Olivia", 20, 120, 100, 30);

                Match a = new Match(john,olivia, 90, 100);

                a.run();

            }

        }


```

```Java

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

```
```Java

        public class Match {

            Fighter f1;

            Fighter f2;

            int minWeight;

            int maxWeight;


            Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){

                this.f1 = f1;

                this.f2 = f2;

                this.minWeight = minWeight;

                this.maxWeight = maxWeight;

            }

            void run(){

                if(checkWeight()){

                    while(f1.health > 0 && f2.health > 0){

                        System.out.println("======== NEW ROUND ===========");

                        if(Math.random() < 0.5){

                            f2.health = f1.hit(f2);

                            if (isWin()){

                                break;

                            }

                            f1.health = f2.hit(f1);

                        }else{

                            f1.health = f2.hit(f1);

                            if (isWin()){

                                break;

                            }

                            f2.health = f1.hit(f2);
                        }

                        if(isWin()){

                            break;

                        }

                        printScore();
                    }

                }else{

                    System.out.println("The weights of the athletes do not match.");

                }


            }

            boolean checkWeight(){

                return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);

            }

            boolean isWin(){

                if(f1.health == 0){

                    System.out.println("Winner of The Match : " + f2.name);

                    return true;

                }else if(f2.health == 0){

                    System.out.println("Winner of The Match : " + f1.name);

                    return true;

                }

                return false;

            }


            void printScore(){

                System.out.println("------------");

                System.out.println(f1.name + " Remaining health : " + f1.health);

                System.out.println(f2.name + " Remaining health : " + f2.health);

            }

        }

```

```bash

    ======== NEW ROUND ===========
    ------------
    John => Olivia 25 damage hit.
    Olivia blocked incoming damage.
    ------------
    Olivia => John 20 damage hit.
    ------------
    John Remaining health : 110
    Olivia Remaining health : 120
    ======== NEW ROUND ===========
    ------------
    John => Olivia 25 damage hit.
    ------------
    Olivia => John 20 damage hit.
    ------------
    John Remaining health : 90
    Olivia Remaining health : 95
    ======== NEW ROUND ===========
    ------------
    Olivia => John 20 damage hit.
    John blocked incoming damage.
    ------------
    John => Olivia 25 damage hit.
    Olivia blocked incoming damage.
    ------------
    John Remaining health : 90
    Olivia Remaining health : 95
    ======== NEW ROUND ===========
    ------------
    John => Olivia 25 damage hit.
    Olivia blocked incoming damage.
    ------------
    Olivia => John 20 damage hit.
    John blocked incoming damage.
    ------------
    John Remaining health : 90
    Olivia Remaining health : 95
    ======== NEW ROUND ===========
    ------------
    John => Olivia 25 damage hit.
    Olivia blocked incoming damage.
    ------------
    Olivia => John 20 damage hit.
    John blocked incoming damage.
    ------------
    John Remaining health : 90
    Olivia Remaining health : 95
    ======== NEW ROUND ===========
    ------------
    Olivia => John 20 damage hit.
    John blocked incoming damage.
    ------------
    John => Olivia 25 damage hit.
    ------------
    John Remaining health : 90
    Olivia Remaining health : 70
    ======== NEW ROUND ===========
    ------------
    Olivia => John 20 damage hit.
    ------------
    John => Olivia 25 damage hit.
    ------------
    John Remaining health : 70
    Olivia Remaining health : 45
    ======== NEW ROUND ===========
    ------------
    John => Olivia 25 damage hit.
    ------------
    Olivia => John 20 damage hit.
    John blocked incoming damage.
    ------------
    John Remaining health : 70
    Olivia Remaining health : 20
    ======== NEW ROUND ===========
    ------------
    John => Olivia 25 damage hit.
    Winner of The Match : John

```

<br />

## LINK

* Click here https://github.com/Fogo9/BoxingMatch.git to access the Github page for this project.

<br />

## **LICENSE**

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
