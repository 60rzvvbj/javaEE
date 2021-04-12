package spring4.com.po;

public class SC {
    private int sno;
    private int cno;
    private int tno;
    private double ps;
    private double ks;
    private double zp;

    public SC() {
    }

    public SC(int sno, int cno, int tno, double ps, double ks, double zp) {
        this.sno = sno;
        this.cno = cno;
        this.tno = tno;
        this.ps = ps;
        this.ks = ks;
        this.zp = zp;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }

    public double getKs() {
        return ks;
    }

    public void setKs(double ks) {
        this.ks = ks;
    }

    public double getZp() {
        return zp;
    }

    public void setZp(double zp) {
        this.zp = zp;
    }
}
