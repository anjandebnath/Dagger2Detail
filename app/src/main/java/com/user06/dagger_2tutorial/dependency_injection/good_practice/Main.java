package com.user06.dagger_2tutorial.dependency_injection.good_practice;

public class Main {

    public static void main (String args[]){

        AddressVerificationService verificationService = null;
        AddressVerificationServiceProvider provider = null;

        provider = new YahooAVS();//to use YAHOO AVS
        provider = new GoogleAVS();//to use Google AVS

        verificationService = new AddressVerificationService(provider);
        String lnl = verificationService.validateAddress("HitechPark, Dhaka");
        System.out.println(lnl);
    }


}
