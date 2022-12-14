package xml.editornew.FileFields;

import org.jetbrains.annotations.NotNull;
import xml.editornew.MappingController.MappingController;
import xml.editornew.XmlCreator.FieldsToBeCut;
import xml.editornew.XmlCreator.FieldsToBeMatch;

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
    private String price;
    private String currency;
    private String pricePromo;
    private String quantity;
    private String urlProduct;
    private String urlImg;
    private String genderKey;
    private String genderValue;
    private String urlCategory;
    private String urlCategoryMark;
    private String popularity;
    private String season;
    private String color;
    private String addidtionalImage;
    private String intDetail1;
    private String intDetail2;
    private String intDetail3;
    @NotNull
    private FieldsToBeCut fieldsToBeCut;
    @NotNull
    private FieldsToBeMatch fieldsToBeMatch;
    @NotNull
    private MappingController mappingController;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return checkIfTheFieldIsEmpty(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewProductKey() {
        return checkIfTheFieldIsEmpty(newProductKey);
    }

    public void setNewProductKey(String newProductKey) {
        this.newProductKey = newProductKey;
    }

    public String getNewProductValue() {
        return checkIfTheFieldIsEmpty(newProductValue);
    }

    public void setNewProductValue(String newProductValue) {
        this.newProductValue = newProductValue;
    }

    public String getAvailableKey() {
        return checkIfTheFieldIsEmpty(availableKey);
    }

    public void setAvailableKey(String availableKey) {
        this.availableKey = availableKey;
    }

    public String getAvailableValue() {
        return checkIfTheFieldIsEmpty(availableValue);
    }

    public void setAvailableValue(String availableValue) {
        this.availableValue = availableValue;
    }

    public String getBestsellerKey() {
        return checkIfTheFieldIsEmpty(bestsellerKey);
    }

    public void setBestsellerKey(String bestsellerKey) {
        this.bestsellerKey = bestsellerKey;
    }

    public String getBestsellerValue() {
        return checkIfTheFieldIsEmpty(bestsellerValue);
    }

    public void setBestsellerValue(String bestsellerValue) {
        this.bestsellerValue = bestsellerValue;
    }

    public String getBrand() {
        return checkIfTheFieldIsEmpty(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategories() {
            return checkIfTheFieldIsEmpty(categories);
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCategoryMain() {
        return  checkIfTheFieldIsEmpty(categoryMain);
    }

    public void setCategoryMain(String categoryMain) {
        this.categoryMain = categoryMain;
    }

    public String getDescription() {
        return  checkIfTheFieldIsEmpty(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail1() {
        return checkIfTheFieldIsEmpty(detail1);
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getDetail2() {
        return checkIfTheFieldIsEmpty(detail2);
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public String getDetail3() {
        return checkIfTheFieldIsEmpty(detail3);
    }

    public void setDetail3(String detail3) {
        this.detail3 = detail3;
    }

    public String getDetail4() {
        return checkIfTheFieldIsEmpty(detail4);
    }

    public void setDetail4(String detail4) {
        this.detail4 = detail4;
    }

    public String getDetail5() {
        return checkIfTheFieldIsEmpty(detail5);
    }

    public void setDetail5(String detail5) {
        this.detail5 = detail5;
    }

    public String getManufacturer() {
        return checkIfTheFieldIsEmpty(manufacturer);

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @NotNull
    public String getPrice() {
        return checkIfTheFieldIsEmpty(price);
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrency() {
        return checkIfTheFieldIsEmpty(currency);
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPricePromo() {
        return checkIfTheFieldIsEmpty(pricePromo);
    }

    public void setPricePromo(String pricePromo) {
        this.pricePromo = pricePromo;
    }

    public String getQuantity() {
        return checkIfTheFieldIsEmpty(quantity);
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUrlProduct() {
        return checkIfTheFieldIsEmpty(urlProduct);
    }

    public void setUrlProduct(String urlProduct) {
        this.urlProduct = urlProduct;
    }

    public String getUrlImg() {
        return checkIfTheFieldIsEmpty(urlImg);
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getGenderKey() {
        return checkIfTheFieldIsEmpty(genderKey);
    }

    public void setGenderKey(String genderKey) {
        this.genderKey = genderKey;
    }

    public String getGenderValue() {
        return checkIfTheFieldIsEmpty(genderValue);
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public String getUrlCategory() {
        return checkIfTheFieldIsEmpty(urlCategory);
    }

    public void setUrlCategory(String urlCategory) {
        this.urlCategory = urlCategory;
    }

    public String getUrlCategoryMark() {
        return checkIfTheFieldIsEmpty(urlCategoryMark);
    }

    public void setUrlCategoryMark(String urlCategoryMark) {
        this.urlCategoryMark = urlCategoryMark;
    }

    public String getPopularity() {
        return checkIfTheFieldIsEmpty(popularity);
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getSeason() {
        return checkIfTheFieldIsEmpty(season);
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getColor() {
        return checkIfTheFieldIsEmpty(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddidtionalImage() {
        return checkIfTheFieldIsEmpty(addidtionalImage);
    }

    public void setAddidtionalImage(String addidtionalImage) {
        this.addidtionalImage = addidtionalImage;
    }

    public String getIntDetail1() {
        return checkIfTheFieldIsEmpty(intDetail1);
    }

    public void setIntDetail1(String intDetail1) {
        this.intDetail1 = intDetail1;
    }

    public String getIntDetail2() {
        return checkIfTheFieldIsEmpty(intDetail2);
    }

    public void setIntDetail2(String intDetail2) {
        this.intDetail2 = intDetail2;
    }

    public String getIntDetail3() {
        return checkIfTheFieldIsEmpty(intDetail3);
    }

    public void setIntDetail3(String intDetail3) {
        this.intDetail3 = intDetail3;
    }

    public MappingController getMappingController() {
        return mappingController;
    }

    public void setMappingController(MappingController mappingController) {
        this.mappingController = mappingController;
    }

    public FieldsToBeCut getFieldsToBeCut() {
        return fieldsToBeCut;
    }

    public void setFieldsToBeCut(FieldsToBeCut fieldsToBeCut) {
        this.fieldsToBeCut = fieldsToBeCut;
    }

    public FieldsToBeMatch getFieldsToBeMatch() {
        return fieldsToBeMatch;
    }

    public void setFieldsToBeMatch(FieldsToBeMatch fieldsToBeMatch) {
        this.fieldsToBeMatch = fieldsToBeMatch;
    }

    public String checkIfTheFieldIsEmpty(String variable) {
        if(variable == null || variable.isEmpty()){
            return variable = "UNDEFINED";
        }
        return variable;
    }

}