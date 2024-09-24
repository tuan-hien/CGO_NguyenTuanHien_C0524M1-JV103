package ss12_java_collection_framework.model;

public abstract class Human {
    private String code;
    private String name;
    private int yearOfBirth;

    public Human() {};

    public Human(String code, String name, int yearOfBirth) {
        this.code = code;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getYearOfBirth() {return yearOfBirth;}
    public void setYearOfBirth(int yearOfBirth) {this.yearOfBirth = yearOfBirth;}

    public String toString(){
        return "Code = " + code + ", name = " + name + ", year of birth = " + yearOfBirth;
    }
}
