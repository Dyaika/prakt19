package com.company;

public class Human {
    private Hand leftHand, rightHand;
    private Leg leftLeg, rightLeg;
    private Head head;
    public Human() {
        leftHand = new Hand(false);
        rightHand = new Hand(true);
        leftLeg = new Leg(false);
        rightLeg = new Leg(true);
        head = new Head();
    }
    public void exist(){
        leftHand.wave();
        rightHand.wave();
        leftLeg.step();
        rightLeg.step();
        head.think();
    }
}
