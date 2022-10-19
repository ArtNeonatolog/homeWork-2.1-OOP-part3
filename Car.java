public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car () {
        this.brand = "default";
        this.model = "default";
        this.productionCountry = "default";
        this.engineVolume = 1.5f;
        this.color = "белый";
        this.productionYear = 2000;
        System.out.println("Внимание! Не введены никакие данные, установлены значения по умолчанию!");
    }
    public Car (String brand) {
        this (brand, "default", 1.5f, "белый", 2000, "default");
        System.out.println("Внимание! Введен только бренд автомобиля, оставшиеся значения установлены по умолчанию!");
    }
    public Car (String brand, String model) {
        this (brand, model, 1.5f, "белый", 2000, "default");
        System.out.println("Внимание! Введен только бренд и модель автомобиля, оставшиеся значения установлены по умолчанию!");
    }
    public Car (String brand, String model, float engineVolume) {
        this (brand, model, engineVolume, "белый", 2000, "default");
        System.out.println("Внимание! Введен только бренд, модель и объем двигателя автомобиля, оставшиеся значения установлены по умолчанию!");
    }
    public Car (String brand, String model, float engineVolume, String color) {
        this (brand, model, engineVolume, color, 2000, "default");
        System.out.println("Внимание! Введен только бренд, модель, объем двигателя и цвет автомобиля, оставшиеся значения установлены по умолчанию!");
    }
    public Car (String brand, String model, float engineVolume, String color, int productionYear) {
        this (brand, model, engineVolume, color, productionYear, "default");
        System.out.println("Внимание! Введен только бренд, модель, объем двигателя, цвет и год сборки автомобиля, страна сборки установлена по умолчанию!");
    }
    public Car (String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
            this.brand = brand;
            this.model = model;
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
    }

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public float getEngineVolume () {
        return engineVolume;
    }

    public String getColor () {
        return color;
    }

    public int getProductionYear () {
        return productionYear;
    }

    public String getProductionCountry () {
        return productionCountry;
    }
    public void informationOfTheCar () {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска" + ", сборка - " + productionCountry + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + " л.");
    }
}
