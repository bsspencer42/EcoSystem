
public class Pond {
    public static void main(String[] args) {
        // Setup frog objects
        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", 10, 15);
        Frog Peepaw = new Frog("Peepaw", 4.6, 5);
        Frog Princess = new Frog("Princess", 69, 420);

        // Setup fly objects
        Fly f1 = new Fly(1,3);
        Fly f2 = new Fly(6);
        Fly f3 = new Fly(8,15);

        // Operations
        Peepo.setSpecies("1331 Frogs"); // 1
        System.out.println(Peepo.toString()); // 2
        Peepo.eat(f2); // 3
        System.out.println(f2.toString()); // 4
        Peepo.grow(8); // 5
        Peepo.eat(f2); // 6
        System.out.println(f2.toString()); // 7
        System.out.println(Peepo.toString()); // 8
        System.out.println(Princess.toString()); // 9
        Peepaw.grow(4); // 10
        System.out.println(Peepaw.toString()); // 11
        System.out.println(Pepe.toString());

    }
}
