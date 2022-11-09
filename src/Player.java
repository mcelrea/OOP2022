/*
 * This class acts as a blueprint. It itself is not
 * a player, it describes and allows the creation
 * of players
 */

//class declaration
public class Player {

    //fields, instance variables, attributes
    private String name;
    private int health;
    private int dexterity; //how well a player uses dex weapons (bows, daggers)
    private int strength; //how well a player uses str weapons (swords, axes)
    private int intelligence; //how well a player can cast a spell

    //constructor(s), how to create new Players

    //methods, actions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
