package spring4.com.po;

public class Teacher {
    private int tno;
    private String tn;
    private String tsex;
    private String trank;
    private String tdel;

    public Teacher() {
    }

    public Teacher(int tno, String tn, String tsex, String trank, String tdel) {
        this.tno = tno;
        this.tn = tn;
        this.tsex = tsex;
        this.trank = trank;
        this.tdel = tdel;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTrank() {
        return trank;
    }

    public void setTrank(String trank) {
        this.trank = trank;
    }

    public String getTdel() {
        return tdel;
    }

    public void setTdel(String tdel) {
        this.tdel = tdel;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tno=" + tno +
                ", tn='" + tn + '\'' +
                ", tsex='" + tsex + '\'' +
                ", trank='" + trank + '\'' +
                ", tdel='" + tdel + '\'' +
                '}';
    }
}
