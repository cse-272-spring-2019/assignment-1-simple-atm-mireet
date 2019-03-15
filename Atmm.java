 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmm;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Atmm {
 private double balance  ;
private double amount ;
private int cardNumber ;
 List<Transaction> history = new ArrayList<>();
int index;

    public Atmm() {
        index =0;
      balance=1000;
        cardNumber =1234;
    }

    public List<Transaction> getHistorytot() {
        return history;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public double getBalance() {
        if (balance <0)
         balance = 0;
       return balance;
    }

    public double getAmount() {
        return amount;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    

    public void setAmount(double amount) {
      
        this.amount = amount;
    } 

    public  boolean withdraw (double amount)
    { //Scanner scan = new Scanner (System.in);
     //amount =scan.nextDouble();
    
        if (amount > balance)
            return false ;
         balance = balance - amount;
         Transaction m = new Transaction ("withdraw",amount,balance);
         System.out.println(this.hashCode());
          System.out.println(m.getBalance());
          check(m);
         //history.add(m);
         updateIndex();
         System.out.println(""+index);
         System.out.println(""+history.size());
      //  System.out.println(""+history.get(0).balance);
         
         
         
          
         
              return true  ;
              
    }
    public void deposit (double amount){
        
       balance = balance +amount ;
          Transaction x = new Transaction ("deposit",amount,balance);
          System.out.println(x.getBalance());
         // history.add(x);
         check(x);
           updateIndex();
            System.out.println(""+index);
           
         
        
    }

    
    public Transaction getHistory(int i) {
        return history.get(i);
    }


    private void updateIndex() {
        
            index++;
        }
    private void check(Transaction m){
        if(history.size()==5 ){
            --index;
            history.remove(0);}
        history.add(m);
    }
     
// public static void main(String args[]) {
 //    Atm m = new Atm ();
  //   m.withdraw();
  //   m.withdraw();
 //    m.deposit(10);
     
 
     
 //}

    
}
