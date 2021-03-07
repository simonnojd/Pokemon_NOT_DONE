public class Spell {

    private String description;

    public Spell(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void buffATK(Creature creature, int amount) {
        creature.setATK(creature.getATK() + amount);
        System.out.println("ATK increased by " + amount);
    }

    public void buffDFS(Creature creature, int amount) {
        creature.setDFS(creature.getDFS() + amount);
        System.out.println("DFS increased by " + amount);
    }

    public void dmgSpell(Creature user, Creature opposingCreature, int amount, int atk, int dfs) {
        // FIRE VS GRASS
        if (user.getElement().equals(Element.elements.FIRE) && opposingCreature.getElement().equals(Element.elements.GRASS)) {
            opposingCreature.setHP((opposingCreature.getHP() + dfs)  - ((amount * 2) + atk));
        }
        // GRASS VS WATER
        else if (user.getElement().equals(Element.elements.GRASS) && opposingCreature.getElement().equals(Element.elements.WATER)) {
            opposingCreature.setHP((opposingCreature.getHP() + dfs) - ((amount * 2) + atk));
        }
        else {
            opposingCreature.setHP((opposingCreature.getHP() + dfs) - (amount + atk));
        }
    }
}