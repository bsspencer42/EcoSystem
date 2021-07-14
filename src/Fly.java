public class Fly {
    // Instance variables
    private double mass;
    private double speed;

    // Constructors
    public Fly(){
        this(5);
    }
    public Fly(double mass) {
        this(mass, 10);
    }
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    // Getters
    public double getMass(){
        return this.mass;
    }
    public double getSpeed(){
        return this.speed;
    }
    // Setters
    public void setMass(double mass){
        this.mass = mass;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    // Object method overrides
    public String toString() {
        if (isDead()) {
            return String.format("I’m dead, but I used to be a fly with a speed of %.2f.",this.speed);
        } else {
            return String.format("I’m a speedy fly with %.2f speed and %.2f mass.",this.speed,this.mass);
        }
    }

    // Methods
    public void grow(int foodMass) {
        if (this.mass + foodMass < 20) {
            this.speed += foodMass;
        }
        else if (this.mass >= 20) {
            this.speed -= 0.5*foodMass;
        }
        else {
            this.speed += 20 - this.mass;
            this.speed -= (foodMass - (20-this.mass))*0.5;
        }
        this.mass += foodMass;
    }
    public boolean isDead() {
        if (this.mass == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Fly myFly1 = new Fly();
        Fly myFly2 = new Fly(5,10);
        myFly2.grow(1);
        System.out.println(myFly2.toString());
        System.out.println(myFly2.getSpeed());
        System.out.println(myFly2.getMass());
    }
}
