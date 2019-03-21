package com.user06.dagger_2tutorial.dependency_injection.good_practice;

public class AddressVerificationService {

    private AddressVerificationServiceProvider serviceProvider;

    public AddressVerificationService(AddressVerificationServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String validateAddress(String address)
    {
        return this.serviceProvider.validateAddress(address);
    }
}


// Here we are injecting the AddressVerificationService dependency AddressVerificationServiceProvider.