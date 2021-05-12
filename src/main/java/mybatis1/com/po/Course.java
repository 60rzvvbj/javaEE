package mybatis1.com.po;

import java.util.List;

public class Course {
    private int cno;
    private String cname;
    private int peroid;
    private Book book;
    private List<Student> studentList;

    public Course() {
    }

    public Course(int cno, String cname, int peroid, Book book, List<Student> studentList) {
        this.cno = cno;
        this.cname = cname;
        this.peroid = peroid;
        this.book = book;
        this.studentList = studentList;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPeroid() {
        return peroid;
    }

    public void setPeroid(int peroid) {
        this.peroid = peroid;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", peroid=" + peroid +
                ", book=" + book +
                ", studentList=" + studentList +
                '}';
    }
}
