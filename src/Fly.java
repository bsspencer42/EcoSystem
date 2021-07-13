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
        if (this.mass == 0) {
            return String.format("I’m dead, but I used to be a fly with a speed of %.2f.",this.speed);
        } else {
            return String.format("I’m a speedy fly with %.2f speed and %.2f mass.",this.speed,this.mass);
        }
    }

    // Methods
    public void grow(int foodMass) {
        for (int i = 0; i < foodMass; i++) {
            this.mass += 1;
            if (this.mass <= 20) {
                this.speed += 1;
            }
            else {
                this.speed -= 0.5;
            }
        }
    }

    public static void main(String[] args) {
        Fly myFly1 = new Fly();
        Fly myFly2 = new Fly(19);
        myFly2.grow(60);
        System.out.println(myFly2.getSpeed());
        System.out.println(myFly2.getMass());
    }
}
