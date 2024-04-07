package com.ignateva.tags_task.entity;

public class Student {
    private int id;
    private String F_name;
    private String L_name;

    private int score;

    public String getF_name() {
        return F_name;
    }

    public void setF_name(String f_name) {
        F_name = f_name;
    }

    public String getL_name() {
        return L_name;
    }

    public void setL_name(String l_name) {
        L_name = l_name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String f_name, String l_name, int score) {
        this.id = id;
        F_name = f_name;
        L_name = l_name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "F_name='" + F_name + '\'' +
                ", L_name='" + L_name + '\'' +
                ", score=" + score +
                '}';
    }
}
