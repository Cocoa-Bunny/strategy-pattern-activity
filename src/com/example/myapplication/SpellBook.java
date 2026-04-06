package com.example.myapplication;

public class SpellBook implements PlayerStrategy {
    
    private String name;

    /*
        TODO: Make a no-args constructor that will initialize this field to "Spell Book"
     */
    public SpellBook() {
        this.name = "Spell Book";
    }

    /*
        TODO: Implement the player Strategy methods so that they behave in accordance with the assignment details
            These methods should print the following: “{name of pattern} - {size of attack}” where each of the braced
                items corresponds to the name and size of method being implement
            One additional method should announce just the name of the strategy
        Hint: There are four methods that you need to implement from the PlayerStrategy class
     */
    @Override
    public void attackSmall() {
        System.out.println(this.name + " - Small");
    }

    @Override
    public void attackMedium() {
        System.out.println(this.name + " - Medium");
    }

    @Override
    public void attackLarge() {
        System.out.println(this.name + " - Large");
    }

    @Override
    public void announceStrategy() {
        System.out.println(this.name);
    }
}
