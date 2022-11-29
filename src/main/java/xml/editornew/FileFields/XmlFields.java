package xml.editornew.FileFields;

import xml.editornew.MappingController.ChoosenMappings;

public class XmlFields {


    private String id;
    private String name;
    private String newProductKey;
    private String newProductValue;
    private String availableKey;
    private String availableValue;
    private String bestsellerKey;
    private String bestsellerValue;
    private String brand;
    private String categories;
    private String categoryMain;
    private String description;
    private String detail1;
    private String detail2;
    private String detail3;
    private String detail4;
    private String detail5;
    private String manufacturer;
    private double price;
    private String currency;
    private double pricePromo;
    private String quantity;
    private String urlProduct;
    private String genderKey;
    private String genderValue;
    private String urlCategory;
    private String urlCategoryMark;
    private String popularity;
    private String season;
    private String color;
    private String intDetial1;
    private String intDetial2;
    private String decDetial1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewProductKey() {
        return newProductKey;
    }

    public void setNewProductKey(String newProductKey) {
        this.newProductKey = newProductKey;
    }

    public String getNewProductValue() {
        return newProductValue;
    }

    public void setNewProductValue(String newProductValue) {
        this.newProductValue = newProductValue;
    }

    public String getAvailableKey() {
        return availableKey;
    }

    public void setAvailableKey(String availableKey) {
        this.availableKey = availableKey;
    }

    public String getAvailableValue() {
        return availableValue;
    }

    public void setAvailableValue(String availableValue) {
        this.availableValue = availableValue;
    }

    public String getBestsellerKey() {
        return bestsellerKey;
    }

    public void setBestsellerKey(String bestsellerKey) {
        this.bestsellerKey = bestsellerKey;
    }

    public String getBestsellerValue() {
        return bestsellerValue;
    }

    public void setBestsellerValue(String bestsellerValue) {
        this.bestsellerValue = bestsellerValue;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCategoryMain() {
        return categoryMain;
    }

    public void setCategoryMain(String categoryMain) {
        this.categoryMain = categoryMain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail1() {
        return detail1;
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public String getDetail3() {
        return detail3;
    }

    public void setDetail3(String detail3) {
        this.detail3 = detail3;
    }

    public String getDetail4() {
        return detail4;
    }

    public void setDetail4(String detail4) {
        this.detail4 = detail4;
    }

    public String getDetail5() {
        return detail5;
    }

    public void setDetail5(String detail5) {
        this.detail5 = detail5;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPricePromo() {
        return pricePromo;
    }

    public void setPricePromo(double pricePromo) {
        this.pricePromo = pricePromo;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUrlProduct() {
        return urlProduct;
    }

    public void setUrlProduct(String urlProduct) {
        this.urlProduct = urlProduct;
    }

    public String getGenderKey() {
        return genderKey;
    }

    public void setGenderKey(String genderKey) {
        this.genderKey = genderKey;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public String getUrlCategory() {
        return urlCategory;
    }

    public void setUrlCategory(String urlCategory) {
        this.urlCategory = urlCategory;
    }

    public String getUrlCategoryMark() {
        return urlCategoryMark;
    }

    public void setUrlCategoryMark(String urlCategoryMark) {
        this.urlCategoryMark = urlCategoryMark;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIntDetial1() {
        return intDetial1;
    }

    public void setIntDetial1(String intDetial1) {
        this.intDetial1 = intDetial1;
    }

    public String getIntDetial2() {
        return intDetial2;
    }

    public void setIntDetial2(String intDetial2) {
        this.intDetial2 = intDetial2;
    }

    public String getDecDetial1() {
        return decDetial1;
    }

    public void setDecDetial1(String decDetial1) {
        this.decDetial1 = decDetial1;
    }

    public String requiredFeidlsChecker(String checkVariable){
        if(checkVariable.isEmpty() || checkVariable == null) {
            return checkVariable + " is empty or null. Check it out!";
        }
        return checkVariable;
    }

    public String checkNotRequiredFields(String checkVariable){
        if(checkVariable.isEmpty() || checkVariable == null) {
            return checkVariable = "UNDEFINED";
        }
        return checkVariable;
    }

}
