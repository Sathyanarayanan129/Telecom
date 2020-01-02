package com.deloitte.telecom.service;

import com.deloitte.telecom.dao.TelecomdaoImp;
import com.deloitte.telecom.entity.Customer;

public class TelecomserviceImp {
    private TelecomdaoImp dao = new TelecomdaoImp();

    public TelecomserviceImp(TelecomdaoImp dao) {
        this.dao = dao;
    }

    public Customer createAccount(Customer c)
    {
        return dao.createAccount(c);
    }

    public double balanceEnquiry(String number)
    {
        return dao.balanceEnquiry(number);
    }
    public Customer rechargeAmount(String number,double recharge)
    {
        return dao.rechargeAmount(number,recharge);
    }
}

