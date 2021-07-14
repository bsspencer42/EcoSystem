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
    public void grow(){
        grow(1);
    }
    public void grow(int numMonths){
        int previousAge = this.age;
        this.age += numMonths;

        if (previousAge <= 12) {
            if (this.age > 12) {
                tongueSpeed += 12 - previousAge;
            }
            else {
                tongueSpeed += this.age - previousAge;
            }
        }
        if (this.age > 30) {
            if (previousAge < 30) {
                tongueSpeed -= this.age - 30;
            }
            else {
                tongueSpeed -= this.age - previousAge;
            }
        }
        // Correct tongueSpeed if less than 5
        if (tongueSpeed < 5){
            tongueSpeed = 5;
        }
        // Update froglet variable
        if (this.age >= 1 && this.age < 7){
            isFroglet = true;
        }
        else {
            isFroglet = false;
        }
    }


    public static void main(String[] args) {
        Frog myFrog1 = new Frog("Tom",30,50);
        Frog myFrog2 = new Frog("Brad");
        System.out.println(myFrog1.isFroglet);
        System.out.println("Froglet = " + myFrog1.isFroglet + "\nTongueSpeed = " + myFrog1.tongueSpeed);
        myFrog1.grow();
        System.out.println("Froglet = " + myFrog1.isFroglet + "\nTongueSpeed = " + myFrog1.tongueSpeed);
    }
}
