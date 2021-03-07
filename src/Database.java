public class Database {

    Spell spell1 = new Spell("Ember: A powerful attack that deals 10 damage");
    Spell spell2 = new Spell("Quick Attack: A fast attack that deals 5 damage");
    Spell spell3 = new Spell("Growl: Buffs users ATK");
    Spell spell4 = new Spell("Leer: Buffs users DFS");

    Creature bulbasaur = new Creature("Bulbasaur", Element.elements.GRASS,
                    20, 5, 5, 0, spell1, spell2, spell3, spell4);

    Creature charizard = new Creature("Charizard", Element.elements.FIRE,
            50, 5, 5, 0, spell1, spell2, spell3, spell4);

    @Override
    public String toString() {
        return "Database{" +
                "spell1=" + spell1 +
                ", spell2=" + spell2 +
                ", spell3=" + spell3 +
                ", spell4=" + spell4 +
                '}';
    }
}
