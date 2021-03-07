public class Creature {

    private String name;
    private Element.elements element;

    private int HP;
    private int ATK;
    private int DFS;
    private int XP;

    private Spell spell1;
    private Spell spell2;
    private Spell spell3;
    private Spell spell4;

    public Creature(String name, Element.elements element, int HP, int ATK, int DFS, int XP,
                    Spell spell1, Spell spell2, Spell spell3, Spell spell4) {
        this.name = name;
        this.element = element;
        this.HP = HP;
        this.ATK = ATK;
        this.DFS = DFS;
        this.XP = XP;
        this.spell1 = spell1;
        this.spell2 = spell2;
        this.spell3 = spell3;
        this.spell4 = spell4;
    }

    public String getName() {
        return name;
    }

    public Element.elements getElement() {
        return element;
    }

    public int getHP() {
        return this.HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDFS() {
        return DFS;
    }

    public void setDFS(int DFS) {
        this.DFS = DFS;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public Spell getSpell1() {
        return spell1;
    }

    public Spell getSpell2() {
        return spell2;
    }

    public Spell getSpell3() {
        return spell3;
    }

    public Spell getSpell4() {
        return spell4;
    }
}