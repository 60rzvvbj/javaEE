package mybatis1.com.po;

public class SC {
    private String sno;
    private int cno;
    private int tno;
    private float participation;
    private float final_;
    private float total;

    public SC() {
    }

    public SC(String sno, int cno, int tno, float participation, float final_, float total) {
        this.sno = sno;
        this.cno = cno;
        this.tno = tno;
        this.participation = participation;
        this.final_ = final_;
        this.total = total;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
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

    public float getParticipation() {
        return participation;
    }

    public void setParticipation(float participation) {
        this.participation = participation;
    }

    public float getFinal() {
        return final_;
    }

    public void setFinal(float final_) {
        this.final_ = final_;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "SC{" +
                "sno='" + sno + '\'' +
                ", cno=" + cno +
                ", tno=" + tno +
                ", participation=" + participation +
                ", final=" + final_ +
                ", total=" + total +
                '}';
    }
}
