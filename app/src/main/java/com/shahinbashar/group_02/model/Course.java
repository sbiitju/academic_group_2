package com.shahinbashar.group_02.model;

public class Course {
    private String courseName,courseCode,courseTeacherName,courseTeacherDesignation;

    public Course(String courseName, String courseCode, String courseTeacherName, String courseTeacherDesignation) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseTeacherName = courseTeacherName;
        this.courseTeacherDesignation = courseTeacherDesignation;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTeacherName() {
        return courseTeacherName;
    }

    public void setCourseTeacherName(String courseTeacherName) {
        this.courseTeacherName = courseTeacherName;
    }

    public String getCourseTeacherDesignation() {
        return courseTeacherDesignation;
    }

    public void setCourseTeacherDesignation(String courseTeacherDesignation) {
        this.courseTeacherDesignation = courseTeacherDesignation;
    }
}
