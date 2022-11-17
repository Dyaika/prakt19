package com.company;

public class Leg {
    private boolean is_right;

    public Leg(boolean is_right) {
        this.is_right = is_right;
    }

    public boolean isRight() {
        return is_right;
    }

    public void step(){
        System.out.println("step with " + toString());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        if (is_right){
            res.append("right");
        } else {
            res.append("left");
        }
        res.append( " leg");
        return res.toString();
    }
}
