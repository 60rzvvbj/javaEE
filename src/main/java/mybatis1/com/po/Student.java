package mybatis1.com.po;

import java.util.List;

public class Student {
    String sno;
    String sname;
    String ssex;
    String snative;
    int mno;
    List<SC> listScore;
    List<Course> listCourse;

    public Student() {
    }

    public Student(String sno, String sname, String ssex, String snative, int mno, List<SC> listScore, List<Course> listCourse) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.snative = snative;
        this.mno = mno;
        this.listScore = listScore;
        this.listCourse = listCourse;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSnative() {
        return snative;
    }

    public void setSnative(String snative) {
        this.snative = snative;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public List<SC> getListScore() {
        return listScore;
    }

    public void setListScore(List<SC> listScore) {
        this.listScore = listScore;
    }

    public List<Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(List<Course> listCourse) {
        this.listCourse = listCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", snative='" + snative + '\'' +
                ", mno=" + mno +
                ", listScore=" + listScore +
                ", listCourse=" + listCourse +
                '}';
    }
}
