package com.codejrny.corejava;

import com.codejrny.corejava.report.CustomerReport;
import com.codejrny.corejava.vo.CustomerDetails;
import com.codejrny.corejava.vo.WealthCustomerDetails;

public class AppMain {
    public static void main(String[] args) {
        CustomerDetails customerDetails= new CustomerDetails("C1");
        CustomerDetails customerDetails2=new CustomerDetails();
        customerDetails2.setCustomerName("C2");
        WealthCustomerDetails wealthCustomerDetails=new WealthCustomerDetails("W1");

        System.out.println(customerDetails.toString());
        System.out.println(customerDetails2.toString());
        System.out.println(wealthCustomerDetails.toString());
    }

}
