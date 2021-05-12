package mybatis1.com.po;

public class Book {

    private int id;
    private String bName;
    private float price;
    private String pub;

    public Book() {
    }

    public Book(int id, String bName, float price, String pub) {
        this.id = id;
        this.bName = bName;
        this.price = price;
        this.pub = pub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bName='" + bName + '\'' +
                ", price=" + price +
                ", pub='" + pub + '\'' +
                '}';
    }
}
