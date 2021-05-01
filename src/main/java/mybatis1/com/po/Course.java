package mybatis1.com.po;

public class Course {
    private int cno;
    private String cname;
    private int peroid;

    public Course() {
    }

    public Course(int cno, String cname, int peroid) {
        this.cno = cno;
        this.cname = cname;
        this.peroid = peroid;
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

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", peroid=" + peroid +
                '}';
    }
}
