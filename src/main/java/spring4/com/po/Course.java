package spring4.com.po;

public class Course {
    private int cno;
    private String cn;
    private int chours;

    public Course() {
    }

    public Course(int cno, String cn, int chours) {
        this.cno = cno;
        this.cn = cn;
        this.chours = chours;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getChours() {
        return chours;
    }

    public void setChours(int chours) {
        this.chours = chours;
    }
}
