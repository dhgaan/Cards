package Cards.Card;

import java.util.*;

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
}
