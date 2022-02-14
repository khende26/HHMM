package com.company;

import com.apple.laf.AquaInternalFrameBorderMetrics;

public class Main {

    public static void main(String[] args) {
        int seconds = 86400;
        int hours = (seconds / 3600);
        int minutes = (seconds / 60) - (hours* 60);
        int even = (hours -12);
        int morn = (hours);
        if(hours > 12) {
            System.out.println(even + ":" + minutes + "PM");
        }  else if (hours <= 12) {
            System.out.println(morn + ":" + minutes + "AM");
        } else {
            System.out.println(even + ":" + minutes + "PM");

        }
    }}
