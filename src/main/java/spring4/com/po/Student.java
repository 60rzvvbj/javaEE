package spring4.com.po;

public class Student {
    private int sno;
    private String sn;
    private String ssex;
    private String snative;
    private int mno;

    public Student() {
    }

    public Student(int sno, String sn, String ssex, String snative, int mno) {
        this.sno = sno;
        this.sn = sn;
        this.ssex = ssex;
        this.snative = snative;
        this.mno = mno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
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

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sn='" + sn + '\'' +
                ", ssex='" + ssex + '\'' +
                ", snative='" + snative + '\'' +
                ", mno=" + mno +
                '}';
    }
}
