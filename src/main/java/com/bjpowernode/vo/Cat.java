package com.bjpowernode.vo;

public class Cat {
    private String id;
    private String type;
   public static Integer SIZE = 100;
    
    public static String MESSAGE = "come on!";
    private String cardId;
    private String name;
    private Integer age;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
