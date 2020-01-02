package com.deloitte.telecom.ui;

import com.deloitte.telecom.dao.TelecomdaoImp;
import com.deloitte.telecom.entity.Customer;
import com.deloitte.telecom.service.TelecomserviceImp;

import java.util.*;

public class TelecomInterface {
    private TelecomserviceImp tele = new TelecomserviceImp(new TelecomdaoImp());
    private Set<Customer> set = new HashSet<>();
    public TelecomInterface() {
    }

    public static void main(String[] args)

    {
         TelecomInterface ex = new TelecomInterface();
         ex.execute();
    }

    public void execute()
    {
        try
        {
            Customer c1 = new Customer("1234567899","Postpaid","Sathya",1000);
            Customer c2 = new Customer("1234512345","Prepaid","Sun",1000);
            set.add(tele.createAccount(c1));
            set.add(tele.createAccount(c2));
            System.out.println("balance of c1=" + tele.balanceEnquiry(c1.getNumber()));
            System.out.println("balance of c2=" + tele.balanceEnquiry(c2.getNumber()));
            System.out.println(tele.rechargeAmount( c1.getNumber(),1000).toString());
            System.out.println(tele.rechargeAmount( c2.getNumber(),2000).toString());
        }
        catch (Exception e)
        {
            System.out.println("error in main");
        }
    }
}
