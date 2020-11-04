package com.company;

import java.util.Scanner;

public class Terminals{

    DebetCard operation = new DebetCard();
    Scanner scanner = new Scanner(System.in);

    public Terminals(String name, String operation){    //////Конструктор класса, принимает название банка и вид операции
        if (name == "Сбербанк" && operation == "Перевод"){
            SberbankTerminalSend();
        }
        else if (name == "Сбербанк" && operation == "Снятие наличных"){
            SberbankTerminalCashing();
        }
        else if(name == "Альфа-Банк" && operation == "Перевод"){
            AlfaBankTerminalSend();
        }

        else if(name == "Альфа-Банк" && operation == "Снятие наличных"){
            AlfaBankTerminalCahsing();
        }
    }

    public void SberbankTerminalSend(){  ////// метод класса, если название банка сбербанк и вид опрерации перевод
        System.out.println("Введите сумму которую хотите отправить: ");
        double summ = scanner.nextInt();
        if (this.operation.getOwnMoney() >= summ){
            System.out.println("Проверка прошла успешно");
            operation.transfer(summ, "Сбербанк");
            System.out.println("Перевод успешно прошел");
        }
        else{
            System.out.println("У вас недостаточно средств");
        }
    }

    public void SberbankTerminalCashing(){
        System.out.println("Введите сумму которую хотите снять: ");
        double summ = scanner.nextInt();
        if (this.operation.getOwnMoney() >= summ){
            System.out.println("Проверка прошла успешно");
            operation.cashing(summ, "Сбербанк");
            System.out.println("Наличные деньги успешно выданы");
        }
        else{
            System.out.println("У вас недостаточно средств");
        }
    }

    public void AlfaBankTerminalSend(){
        System.out.println("Введите сумму которую хотите отправить: ");
        double summ = scanner.nextInt();
        if (this.operation.getOwnMoney() >= summ){
            System.out.println("Проверка прошла успешно");
            operation.transfer(summ, "Альфа-Банк");
            System.out.println("Перевод успешно прошел");
        }
        else{
            System.out.println("У вас недостаточно средств");
        }
    }

    public void AlfaBankTerminalCahsing(){
        System.out.println("Введите сумму которую хотите снять: ");
        double summ = scanner.nextInt();
        if (this.operation.getOwnMoney() >= summ){
            System.out.println("Проверка прошла успешно");
            operation.cashing(summ, "Альфа-Банк");
            System.out.println("Наличные деньги успешно выданы");
        }
        else{
            System.out.println("У вас недостаточно средств");
        }
    }

}

