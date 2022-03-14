package com.company;

public class Main {

    public static void main(String[] args) throws NotYetSetException {
        /*
        * we have three students as an example
        * put their data
        * check functions Average() , canTakeFinalExam()
        * check
        */

        // fill data of three students
        Student Bilal = new Student();
        Assignment[] a = new Assignment[4];
        for (int i = 0; i < 4; i++) {
            a[i] = new Assignment();
        }
        a[0].setMark(1); a[1].setMark(2); a[2].setMark(3);
        CourseRecord record = new CourseRecord();
        record.setStudent(Bilal);
        for (int i = 0; i < 4; i++) record.addAssignment(a[i]);
        /////



    }
}
