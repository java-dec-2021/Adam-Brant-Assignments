import Creature;
import Bat;
public class TestZoo2 {
    Bat bat = new Bat();
    String name = bat.name("Dracula");
    int fullness = bat.fullness(0);
    boolean full = bat.full(false);
    int Energy = bat.Energy(300);

    // below is complaining for the need of an identifier?
    bat.AttackTown();
    bat.AttackTown();
    bat.AttackTown();
    bat.eatHumans();
    bat.eatHumans();
    bat.Fly();
    bat.Fly();
}
