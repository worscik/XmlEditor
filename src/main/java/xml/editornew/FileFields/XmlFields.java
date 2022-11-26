package xml.editornew.FileFields;

public class XmlFields {

    private String id;
    private String url;
    private String img;
    private double price;
    private double promoPrice;

    public XmlFields(String id, String url, String img, double price, double promoPrice) {
        this.id = id;
        this.url = url;
        this.img = img;
        this.price = price;
        this.promoPrice = promoPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }
}
