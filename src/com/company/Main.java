package com.company;

public class Main {

    public static void main(String[] args) throws NotYetSetException {
        /*
        * test case to check the program
        * put their data
        * check functions Average() , canTakeFinalExam()
        * check functions printCourseStudent() , printBestStudent() , printFinalExamStudent()
        */

        // fill data of three students
        Student Bilal = new Student();
        Bilal.setName("Bilal");
        Assignment[] a = new Assignment[4];
        for (int i = 0; i < 4; i++) {
            a[i] = new Assignment();
        }
        a[0].setMark(80); a[1].setMark(90); a[2].setMark(95);
        CourseRecord record1 = new CourseRecord();
        record1.setStudent(Bilal);
        for (int i = 0; i < 4; i++) record1.addAssignment(a[i]);
        /////
        Student Ali = new Student();
        Ali.setName("Ali");
        Assignment[] b = new Assignment[4];
        for (int i = 0; i < 4; i++) {
            b[i] = new Assignment();
        }
        b[0].setMark(50); b[1].setMark(60);
        CourseRecord record2 = new CourseRecord();
        record2.setStudent(Ali);
        for (int i = 0; i < 4; i++) record2.addAssignment(b[i]);
        ////
        Student Fady = new Student();
        Fady.setName("Fady");
        Assignment[] c = new Assignment[4];
        for (int i = 0; i < 4; i++) {
            c[i] = new Assignment();
        }
        c[0].setMark(50); c[1].setMark(60); c[2].setMark(70); c[3].setMark(80);
        CourseRecord record3 = new CourseRecord();
        record3.setStudent(Fady);
        for (int i = 0; i < 4; i++) record3.addAssignment(c[i]);

        // Adding three records to math record
        Course math = new Course();
        math.addCourseRecord(record1);
        math.addCourseRecord(record2);
        math.addCourseRecord(record3);
        // check average function
        System.out.println(record1.Average());
        // check canTakeFinalExam function
        System.out.println(record2.canTakeFinalExam());
        // check printCourseStudent function
        math.printCourseStudent();
        // check printBestStudent function
        math.printBestStudent();
        // check printFinalExamStudent function
        math.printFinalExamStudent();
    }
}
