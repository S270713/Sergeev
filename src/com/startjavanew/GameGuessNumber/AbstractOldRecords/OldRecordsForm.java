package com.startjavanew.GameGuessNumber.AbstractOldRecords;

public interface OldRecordsForm {

    String tableRecordsForm = "\nТаблица рекордов:";

    default void printTableRecordsForm() {
        System.out.println(tableRecordsForm);
    }
}