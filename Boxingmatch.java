public class Boxingmatch {
    public static void main(String[] args) {

        Fighter john = new Fighter("John", 25, 130, 90, 35);

        Fighter olivia = new Fighter("Olivia", 20, 120, 100, 30);

        Match a = new Match(john,olivia, 90, 100);

        a.run();

    }

}
