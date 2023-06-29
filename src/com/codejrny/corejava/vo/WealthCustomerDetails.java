package com.codejrny.corejava.vo;

public class WealthCustomerDetails extends CustomerDetails {
    public WealthCustomerDetails() {
        super();
        System.out.println("WealthCustomerDetails constructor");
    }

    public boolean hasRelationshipManager() {
        return true;
    }
}
