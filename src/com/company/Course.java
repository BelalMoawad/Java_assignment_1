package com.company;

import java.util.Vector;
import java.util.Enumeration;
public class Course {
    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    public void printCourseStudent() {
        int sz = courseRecords.size();
        System.out.println("Names of students enrolled in course : ");
        for (int i = 0; i < sz; i++) {
            CourseRecord courseRecord = (CourseRecord) courseRecords.get(i);
            System.out.println(courseRecord.getStudent().getName());
        }
    }

    public void printBestStudent() throws NotYetSetException {
        // put curAverge that can't be exist to maximize the answer
        double curAverage = -1 , sz = courseRecords.size();
        Student bestStudent = null;
        for (int i = 0; i < sz; i++) {
            CourseRecord courseRecord = (CourseRecord) courseRecords.get(i);
            if (courseRecord.Average() > curAverage) {
                curAverage = courseRecord.Average();
                bestStudent = courseRecord.getStudent();
            }
        }
        System.out.println("The name of best student is " + bestStudent.getName());
    }

    public void printFinalExamStudent() throws NotYetSetException {
        int sz = courseRecords.size();
        System.out.println("Names of final exam students enrolled in course : ");
        for (int i = 0; i < sz; i++) {
            CourseRecord courseRecord = (CourseRecord) courseRecords.get(i);
            if (courseRecord.canTakeFinalExam()) {
                System.out.println(courseRecord.getStudent().getName());
            }
        }
    }
}
