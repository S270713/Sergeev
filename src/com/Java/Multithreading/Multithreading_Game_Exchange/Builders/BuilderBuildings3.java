package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Report;

//Класс - Застройщик3.
public class BuilderBuildings3 implements Runnable {

    Exchange exchange;
    public BuilderBuildings3(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 101; i++) {
            exchange.workConsumers(5);
            exchange.sectionBricks.setInfoFloors3(1);

            //exchange.setBricks(-1);
        }
        Report.reportComplete(3);

    }
}