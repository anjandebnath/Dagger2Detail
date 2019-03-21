package com.user06.dagger_2tutorial.dependency_injection.good_practice;

public class YahooAVS implements AddressVerificationServiceProvider {

    @Override
    public String validateAddress(String address) {
        System.out.println("Verifying address using YAHOO AddressVerificationService");
        return yahooAVSAPI.validate(address);
    }
}


//   Here we implement the AddressVerificationServiceProvider with multiple provider services.