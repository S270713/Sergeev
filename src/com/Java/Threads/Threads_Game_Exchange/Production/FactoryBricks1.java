package com.Java.Threads.Threads_Game_Exchange.Production;

import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;

//Класс - Производство кирпичей №1.
public class FactoryBricks1 implements Runnable {

    Exchange exchange;
    public FactoryBricks1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksFromFactory1();
            exchange.exchangeServer.setInfoFactory1(1);
        }
    }
}