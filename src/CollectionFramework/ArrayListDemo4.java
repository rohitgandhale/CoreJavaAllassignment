package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<Account> accountList=new ArrayList<>();
        Account account1=new Account(1,"A",  100);
        Account account2=new Account(2,"B",200);
        Account account3=new Account(3,"C",300);
        Account account4=new Account(4,"D",400);
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        //find account whose balance is greater than 100
        for (Account account:accountList) {
            if (account.getAccountBalance()>=100){
                System.out.println(account);
            }
        }
        System.out.println("java 8 way to to find");
    //java 8 way
        accountList.stream().filter(account -> account.getAccountBalance()<=100).forEach(System.out::println);
     //   System.out.println("java 7 way to remove element");
      //  for (Account account:accountList) {
        //    if (account.getAccountnumber()==1){
                //ConcurrentModificationException
          //      accountList.remove(account);

                //remove account whose is 2
               boolean b= accountList.removeIf(account -> account.getAccountnumber()==3);{
                    System.out.println("is account removed "+b);
                }
                for (Account account:accountList) {
                    System.out.println(account);
                }

            }
        }


