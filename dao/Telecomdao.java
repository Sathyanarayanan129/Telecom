package com.deloitte.telecom.dao;

import com.deloitte.telecom.entity.Customer;

import java.util.Set;


public interface Telecomdao {
    Customer createAccount(Customer c);

    double balanceEnquiry(String number);

    Customer rechargeAmount(String number, double recharge);

}