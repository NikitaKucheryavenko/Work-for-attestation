package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class CreditCard {

    public static Double limit;
    public static Double balance;
    public String BankName;
    private Double CreditMoney;
    private Double OwnMoney;

    ArrayList<String> ListOfOperations = new ArrayList<>();


    public void getCreditMoney(){
        System.out.println("Кредитные деньги: " + CreditMoney);
    }

    public void getOwnMoney(){
        System.out.println("Личные деньги: " + OwnMoney);
    }
    public void cashing(Double summ, String BankName){///// метод снятия наличных
        if(BankName == this.BankName){
            OwnMoney = OwnMoney - summ;
            System.out.println("С вашего счета было списано " + summ + " рублей");
            System.out.println("Ваш баланс: "+ OwnMoney);
        }
        else {
            System.out.println("Вы пытаетесь снять деньги с теринала другого банка, предупреждаем, " +
                    "что за это взимается коммисия в размере 2% от суммы");
            OwnMoney = OwnMoney - summ - 0.02*summ;
            double newsum = summ + 0.02*summ;
            System.out.println("С вашего счета было списано " + newsum + " рублей (вместе с комиссией)");
            System.out.println("Ваш баланс: "+ OwnMoney);
        }

        String info = String.format("Операция: Снятие наличных, Дата: %s,  Время: %s, Имя терминала: %s",
                LocalDate.now(), LocalTime.now(), BankName);
        ListOfOperations.add(info);  //добавление информации об опреации
        System.out.println(ListOfOperations);
    }

    public void transfer(Double summ, String BankName){    ///// метод перевода
        if(BankName == this.BankName){
            OwnMoney = OwnMoney - summ;
            System.out.println("С вашего счета было списано " + summ + " рублей");
            System.out.println("Ваш баланс: "+ OwnMoney);
        }
        else {
            System.out.println("Вы пытаетесь отправить деньги с теринала другого банка, предупреждаем, " +
                    "что за это взымается коммисия в размере 2% от суммы");
            OwnMoney = OwnMoney - summ - 0.02*summ;
            double newsum = summ + 0.02*summ;
            System.out.println("С вашего счета было списано " + newsum + " рублей (вместе с комиссией)");
            System.out.println("Ваш баланс: "+ OwnMoney);
        }
    }

}