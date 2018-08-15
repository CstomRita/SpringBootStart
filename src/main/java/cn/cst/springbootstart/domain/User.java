package cn.cst.springbootstart.domain;

import org.springframework.context.annotation.Configuration;
@Configuration
public class User {
    private int userId;

    private String userName;

    private int sex;

    private int age;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
