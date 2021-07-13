public class Frog {
    // Instance variables
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    public static String species = "Rare Pepe";

    // Constructors
    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        if (this.age >= 1 && this.age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }
    public Frog(String name, double ageInYears, double tongueSpeed){
        this(name, (int) (ageInYears*12),tongueSpeed);
    }
    public Frog(String name){
        this(name, 5, 5);
    }

    // Object method overrides

    // Methods
    public void grow(int numMonths){
        for (int i = 0; i < numMonths; i++) {
            this.age += 1;
            if (this.age <= 12) {
                this.tongueSpeed += 1;
            }
            else if (this.age > 30) {
                if (this.tongueSpeed > 5){
                    this.tongueSpeed -= 1;
                }
            }
        }
        if (this.age >= 1 && this.age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }
    public void grow(){
        this.grow(1);
    }


    public static void main(String[] args) {
        Frog myFrog1 = new Frog("Tom",6,10);
        Frog myFrog2 = new Frog("Brad");
        System.out.println(myFrog1.isFroglet);
        myFrog1.grow();
        System.out.println(myFrog1.isFroglet);
    }
}
