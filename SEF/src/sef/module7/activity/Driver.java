package sef.module7.activity;


public class Driver {

    private Moving driverMoving;
    private String name;
    public Driver(String name){
        this.name = name;
    }

    public void setMoving (Moving moving){
        driverMoving = moving;
    }
    public void driverStartsDriving(){
        System.out.print("Driver" + name );
        driverMoving.drive();
    }
}
