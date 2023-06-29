package com.codejrny.corejava.vo;

public class CustomerDetails {
    private String customerName;
    private double netWorth;

    public CustomerDetails(){
        System.out.println("CustomerDetails constructor");
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerNameParameter){
        if ( customerNameParameter.isEmpty()){
            System.out.println("empty customer name not allowed");
        } else {
            customerName=customerNameParameter;
        }
    }

    public boolean hasRelationshipManager(){
        return false;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerName='" + customerName + '\'' +
                ", netWorth=" + netWorth +
                '}';
    }
}
