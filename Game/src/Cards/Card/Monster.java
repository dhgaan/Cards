package Cards.Card;

public class Monster {

    private int atk;
    private int def;
    private String name;
    private int level;
    private String type;
    private String att;
    private boolean effect;

    public Monster(int attack, int defense, String n, int lvl, String t, String attribute, boolean e) {
        atk = attack;
        def = defense;
        name = n;
        level = lvl;
        type = t;
        att = attribute;
        effect = e;
    }

    public int attack() {
        return atk;
    }

    public int defense() {
        return def;
    }

    public String name() {
        return name;
    }

    public int level() {
        return level;
    }

    public String type() {
        return type;
    }

    public boolean effect() {
        return effect;
    }

}
