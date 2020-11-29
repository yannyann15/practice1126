package com.company;

class Master {

    public String name;
    public int age;
    public String type;
    Master(String name,int age,String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }


    public void printData(){
        System.out.println("名前:"+this.name);
        System.out.println("年齢:"+this.age);
        System.out.println("属性:"+this.type);
    }


}

