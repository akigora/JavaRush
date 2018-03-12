package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Ukraine. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
