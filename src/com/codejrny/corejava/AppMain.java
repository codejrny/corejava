package com.codejrny.corejava;

import com.codejrny.corejava.vo.CustomerDetails;
import com.codejrny.corejava.vo.WealthCustomerDetails;

public class AppMain {
    public static void main(String[] args) {
        CustomerDetails customerDetails;

        customerDetails=new CustomerDetails();
        System.out.println(customerDetails.hasRelationshipManager());

        customerDetails=new WealthCustomerDetails();
        System.out.println(customerDetails.hasRelationshipManager());

    }

}
