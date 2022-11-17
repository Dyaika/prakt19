package com.company;

public class Hand {
    private boolean is_right;

    public Hand(boolean is_right) {
        this.is_right = is_right;
    }

    public boolean isRight() {
        return is_right;
    }

    public void wave(){
        System.out.println("waving with " + toString());
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        if (is_right){
            res.append("right");
        } else {
            res.append("left");
        }
        res.append( " hand");
        return res.toString();
    }
}
