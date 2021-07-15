public class Frog {
    // Instance variables
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    // Constructors
    public Frog(String name){
        this(name, 5, 5);
    }
    public Frog(String name, double ageInYears, double tongueSpeed){
        this(name, (int) (ageInYears*12),tongueSpeed);
    }
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

    // Getters
    public String getSpecies(){
        return this.species;
    }

    // Setters
    public void setSpecies(String species){
        this.species = species;
    }

    // Object method overrides
    public String toString() {
        if (this.isFroglet) {
            return String.format("My name is %s and I’m a rare froglet! I’m %d months old and my tongue has a speed of %.2f.",this.name,this.age,this.tongueSpeed);
        }
        else {
            return String.format("My name is %s and I’m a rare frog! I’m %d months old and my tongue has a speed of %.2f.",this.name,this.age,this.tongueSpeed);
        }
    }

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
    public void eat(Fly myFly) {
        // Return if dead
        if (myFly.isDead())
            return;
        // Fly is caught
        if (this.tongueSpeed > myFly.getSpeed()) {
            if (myFly.getMass()/this.age > 0.5)
                grow();
            myFly.setMass(0);
        }
        // Fly is not caught
        else{
            myFly.grow(1);
        }
    }
}
