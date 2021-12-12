public class Creature {
    public int Energy = 100;
    public boolean full = false;
    public int fullness = 100;
    public String name = "";
    // create a method to move
    public String Move(int amount){
        this.Energy -= amount;
        return "my energy is now "+ Energy;
    }
    // create a method to eat
    public void Eat(Object target){
        this.fullness += 10;
        System.out.print(this.name + "rends the meat off the bone of " + target);
    }

    // create a method to attack
    public String Attack(){
        return "attacking";
    }

    //create a method to restore energy
    public void Recover(int amount){
        this.Energy += amount;
        System.out.print("my energy recovered by " + amount);
    }
}
