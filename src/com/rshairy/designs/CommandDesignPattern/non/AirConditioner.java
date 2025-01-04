package com.rshairy.designs.CommandDesignPattern.non;

public class AirConditioner {
    int temperature;
    boolean isOn;

    public void turnOnAc() {
        this.isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC() {
        try {
            if (!this.isOn){
                throw new Exception("AC is switched off...Please turn it on");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        this.isOn = false;
        System.out.println("AC id OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed to " + this.temperature);
    }

}
