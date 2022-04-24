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
