package com.camille.java.primitiveTypes;



/*

 */
public class UserClass {
    static private String name;
    static private String gender;
    static private int age;

    public UserClass() {
    }

    public UserClass(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public static String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public static void setName(String name) {
        UserClass.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public static String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public static void setGender(String gender) {
        UserClass.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public static int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public static void setAge(int age) {
        UserClass.age = age;
    }

    public String toString() {
        return "UserClass{name = " + name + ", gender = " + gender + ", age = " + age + "}";
    }
}
