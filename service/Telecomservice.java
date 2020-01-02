package com.deloitte.telecom.service;

import com.deloitte.telecom.entity.Customer;

public interface Telecomservice {

    Customer createAccount(Customer c);

    double balanceEnquiry(String number);

    Customer rechargeAccount(String number, double recharge);

}
