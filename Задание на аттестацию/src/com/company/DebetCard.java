package com.company;

import javax.lang.model.type.ArrayType;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;

public class DebetCard {
    private Double OwnMoney = 1300.0;
    public static Double limit;
    public String BankName;
    public int countOperations;//этот объект нужен для подсчёта количества операции в месяц

    ArrayList<String> ListOfOperations = new ArrayList<>();

    public double getOwnMoney(){      //метод для вывода личных денег
        return(OwnMoney);
    }
    public void operate(){          //метод для того чтобы хранить количество операций
        countOperations++;
    }

    public void cashing(Double summ, String BankName){/////   метод снятия наличных
        operate();
        if(BankName == this.BankName){
            OwnMoney = OwnMoney - summ;
            System.out.println("С вашего счета было списано " + summ + " рублей");
            System.out.println("Ваш баланс: "+ OwnMoney);
        }
        else {
            System.out.println("Вы пытаетесь снять деньги с теринала другого банка, предупреждаем, " +
                    "что за это взымается коммисия в размере 2% от суммы");
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

