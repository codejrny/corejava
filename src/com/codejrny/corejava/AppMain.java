package com.codejrny.corejava;

import com.codejrny.corejava.vo.CustomerDetails;

public class AppMain {
    public static void main(String[] args) {
        CustomerDetails customerDetails1=new CustomerDetails();
        CustomerDetails customerDetails2=new CustomerDetails();

        customerDetails1.setCustomerName("A B");
        customerDetails2.setCustomerName("M N");
        customerDetails1.setCustomerName("");

        System.out.println("customerDetails1 "+customerDetails1.getCustomerName());
        System.out.println("customerDetails2 "+customerDetails2.getCustomerName());
    }
}
