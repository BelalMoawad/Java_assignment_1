package com.company;

import java.util.Vector;
import java.util.Enumeration;

public class CourseRecord {
    private Student student;
    private Vector assignments;

    CourseRecord() {
        assignments = new Vector();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        student = s;
    }

    public void addAssignment(Assignment a) {
        assignments.addElement(a);
    }

    public Enumeration getAssignments() {
        return assignments.elements();
    }

    public double Average() throws NotYetSetException {
        double sum = 0.0;
        int cnt = 0 , sz = assignments.size();
        for (int i = 0 ; i < sz ; i++) {
            try {
                Assignment assignment = (Assignment) assignments.get(i);
                sum += assignment.getMark();
                cnt++;
            }
            catch (Exception ex) {
            }
        }
        return sum / cnt;
    }

    public boolean canTakeFinalExam() throws NotYetSetException {
        int cnt = 0 , sz = assignments.size();
        for (int i = 0 ; i < sz ; i++) {
            try {
                Assignment assignment = (Assignment) assignments.get(i);
                assignment.getMark();
                cnt++;
            }
            catch (Exception ex) {
            }
        }
        return cnt >= 3;
    }
}
