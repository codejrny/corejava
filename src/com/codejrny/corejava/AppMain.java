package com.codejrny.corejava;

import com.codejrny.corejava.report.CustomerReport;
import com.codejrny.corejava.vo.CustomerDetails;
import com.codejrny.corejava.vo.WealthCustomerDetails;

public class AppMain {
    public static void main(String[] args) {
        CustomerDetails customerDetails= new CustomerDetails();
        WealthCustomerDetails wealthCustomerDetails=new WealthCustomerDetails();

        CustomerReport customerReport = new CustomerReport();
        customerReport.printReport(wealthCustomerDetails);
        customerReport.printReport(customerDetails);

    }

}
