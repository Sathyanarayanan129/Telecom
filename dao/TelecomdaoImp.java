package com.deloitte.telecom.dao;

import com.deloitte.telecom.entity.Customer;

import java.util.*;

import com.deloitte.telecom.exception.*;

public class TelecomdaoImp implements Telecomdao {

    private Map<String, Customer> store = new HashMap<>();

    public Customer createAccount (Customer customer)
    {

            if(customer.getNumber().length() != 10)
            {
                throw new NumberInvalidException("Please check the number typed!");
            }
            if(customer.getBalance() < 0) {
                throw new BalanceException("Enter Balance greater than 0");
            }
            store.put(customer.getNumber(),customer);
            return customer;
    }

    public double balanceEnquiry(String number)
    {
            if(number.length()!= 10)
            {
                throw  new NumberInvalidException("Please check the number typed");
            }
            Customer c = store.get(number);
            return c.getBalance();
    }

    public Customer rechargeAmount(String number, double recharge)
    {
          Customer c=store.get(number);
            c.setBalance(c.getBalance() + recharge);
            return c;

    }
}
