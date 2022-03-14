package com.company;

public class Assignment {
    private double mark;
    Assignment() {
        mark = -1;
    }
    public double getMark() throws NotYetSetException {
        if (mark == -1) {
            throw new  NotYetSetException("Mark is not yet set");
        }
        return mark;
    }
    public void setMark(int m) {
        mark = m;
    }
}
