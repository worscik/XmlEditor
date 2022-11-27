package xml.editornew.FileFields;

import xml.editornew.MappingController.ChoosenMappings;

public class XmlFields {

    private String id;
    private String url;
    private String img;
    private String price;
    private double promoPrice;
    ChoosenMappings choosenMappings;

    public XmlFields(String id, String url, String img, String price, double promoPrice, ChoosenMappings choosenMappings) {
        this.id = id;
        this.url = url;
        this.img = img;
        this.price = price;
        this.promoPrice = promoPrice;
        this.choosenMappings = choosenMappings;
    }

    public String getId() {
        checkStringNullOrEmpty(id);
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ChoosenMappings getChoosenMappings() {
        return choosenMappings;
    }

    public void setChoosenMappings(ChoosenMappings choosenMappings) {
        this.choosenMappings = choosenMappings;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String checkStringNullOrEmpty(String checkVariable){
        if(checkVariable.isEmpty() || checkVariable == null) {
            return checkVariable + " is empty or null. Check it out!";
        }
        return checkVariable;
    }

}
