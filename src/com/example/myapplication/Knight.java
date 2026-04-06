package com.example.myapplication;

public class Knight {
    private PlayerStrategy playerStrategy;

    /*
        TODO: This method needs to set the current PlayerStrategy instance to the new behavior (parameter)
     */
    public void setPlayerStrategy(PlayerStrategy playerStrategy) {
        this.playerStrategy = playerStrategy;
    }

    /*
        Todo: Using the PlayerStrategy instance in the Knight class, invoke the small, medium, and large attack
            methods (in that order).
        Hint: There should simply be three method invocations in this method.
     */
    public void attack() {
        playerStrategy.attackSmall();
        playerStrategy.attackMedium();
        playerStrategy.attackLarge();
    }

    /*
        Todo: Have the name of the current strategy be printed out by using this method (in accordance with the
            assignment details).

     */
    public void announceStrategy() {
        playerStrategy.announceStrategy();
    }
}
