package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;
//Класс - Биржа.

public class Exchange {



    public ExchangeServer actualSection;
    public ExchangeServer sectionBricks = new ExchangeServer();
    public ExchangeServer sectionMetal = new ExchangeServer();

    Report report = new Report();
    Exchange exchange;
    public ExchangeServer exchangeServer = new ExchangeServer();
    //Метод - Производство
    public synchronized void workManufacturers(int numberSection) {

        if (numberSection == 1001) { actualSection = sectionBricks; }
        if (numberSection == 1002) { actualSection = sectionMetal; }
        while (actualSection.getAmountProducts() >= actualSection.limitWarehouse) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        actualSection.setAmountProducts(1);
        report.printReport(actualSection);

        notifyAll();
    }
    //Метод - Потребители забирают товар с биржи .
    public synchronized void workConsumers(int numberSection) {
        if (numberSection == 1001) { actualSection = sectionBricks; }
        if (numberSection == 1002) { actualSection = sectionMetal; }
        while (actualSection.getAmountProducts() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        actualSection.setAmountProducts(-1);
        report.printReport(actualSection);
        notifyAll();
    }
}