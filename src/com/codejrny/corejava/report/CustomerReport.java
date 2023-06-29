package com.codejrny.corejava.report;

import com.codejrny.corejava.vo.CustomerDetails;
import com.codejrny.corejava.vo.WealthCustomerDetails;

public class CustomerReport {
    public void printReport(CustomerDetails customerDetails){
        System.out.println("CustomerDetails printer");
    }
    public void printReport(WealthCustomerDetails customerDetails){
        System.out.println("WealthCustomerDetails printer");
    }
}
