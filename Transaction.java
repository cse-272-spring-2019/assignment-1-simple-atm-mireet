/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmm;

import java.awt.List;
import java.util.ArrayList;


public class Transaction {
    String type; 
    double money ;
    double balance ;

    public Transaction(String type, double money,double balance) {
        this.type = type;
        this.money = money;
        this.balance=balance ;
    }

    public String getType() {
        return type;
    }

    public double getMoney() {
        return money;
    }

    public double getBalance() {
        return balance;
    }

    

         
                 
                 }