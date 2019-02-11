package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String sex;
    private boolean hasSiblings;
    private boolean isLiving;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.name = "";
        this.age= age;
    }

    public Person(String name) {
        this.name = name;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
         this.age=age;
    }


    public void setSex(String sex) {
        this.sex=sex;
    }



    public void setHasSiblings(boolean hasSiblings){
        this.hasSiblings =hasSiblings;

    }

    public boolean getHasSiblings(){

        return this.hasSiblings;

    }

    public void setIsLiving(boolean isLiving){
        this.isLiving =isLiving;

    }

    public boolean getIsLiving(){

        return this.isLiving;

    }

    public String getSex() {
        return this.sex;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
