package NinthAssignment;

public class Vehicle {
    private String brand;
    private String modelName;
    private String releaseYear;


    public Vehicle(String brand,String modelName,String releaseYear){
        this.modelName=modelName;
        this.brand=brand;
        this.releaseYear=releaseYear;
    }


    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }
    public String getReleaseYear(){
        return releaseYear;
    }
    public void setReleaseYear(String releaseYear){
        this.releaseYear=releaseYear;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }


    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + modelName + ", Release Year: " + releaseYear;
    }

}
