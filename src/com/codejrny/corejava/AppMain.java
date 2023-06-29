package com.codejrny.corejava;

import com.codejrny.corejava.vo.WealthCustomerDetails;

public class AppMain {
    public static void main(String[] args) {
        WealthCustomerDetails customerDetails1=new WealthCustomerDetails();
        customerDetails1.setCustomerName("W X");
        customerDetails1.setNetWorth(200000);

        System.out.println(customerDetails1.toString());

        boolean result=customerDetails1.hasRelationshipManager();
        System.out.println("result:"+result);
    }
}
