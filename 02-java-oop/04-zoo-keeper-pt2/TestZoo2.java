// import Creature;
// import Bat;
public class TestZoo2 {

    public static void main(String[] args){

        Bat bat = new Bat();
        bat.name = "Dracula";
        bat.fullness = 0;
        bat.full = false;
        bat.Energy = 300;
    
        bat.AttackTown();
        bat.AttackTown();
        bat.AttackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.Fly();
        bat.Fly();
    }
}
