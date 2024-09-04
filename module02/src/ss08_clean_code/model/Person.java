package ss08_clean_code.model;

import java.time.LocalDate;

public abstract class Person {
    private String code;
    private String name;
    private LocalDate onBoardDate;
    private String email;

    private Person() {
    }

    private Person(String code, String name, LocalDate onBoardDate, String email) {
        this.code = code;
        this.name = name;
        this.onBoardDate = onBoardDate;
        this.email = email;
    }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public LocalDate getOnBoardDate() { return onBoardDate; }

    public void setOnBoardDate(LocalDate onBoardDate) { this.onBoardDate = onBoardDate; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String toString(){
        return "Code = " + code + ", name = " + name + ", onboard date = " + onBoardDate + ", email = " + email;
    }
}
