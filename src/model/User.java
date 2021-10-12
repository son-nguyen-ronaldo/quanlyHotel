package model;

public class User {
    private String fullName;
    private String doB;
    private String code;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public User(String fullName, String doB, String code) {
        this.fullName = fullName;
        this.doB = doB;
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
