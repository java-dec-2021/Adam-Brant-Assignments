public class Bat extends Creature{
    public void Fly(){
        this.Move(50);
        this.fullness -= 10;
        System.out.print("flying to find food");
    }

    public void eatHumans(){
        if(!full){
            this.fullness += 20;
            this.Recover(25);
            System.out.print(this.name + " just devoured a random human");
        }
        else{
            System.out.print(this.name + "is too full to eat any more.");
        }
    }

    public void AttackTown(){
        if(this.Energy > 0){
            this.Energy -= 100;
            System.out.print("the town is ravaged by a flurry of vicious attacks!");
        }
        else{
            System.out.print("not enough energy to attack.");
        }
    }
}
