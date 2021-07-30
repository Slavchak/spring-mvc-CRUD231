package web.model;

public class Car {

    private String carBrand;
    private String carModel;
    private int yearOfIssue;

    public Car(String carBrand, String carModel, int yearOfIssue) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfIssue = yearOfIssue;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}

