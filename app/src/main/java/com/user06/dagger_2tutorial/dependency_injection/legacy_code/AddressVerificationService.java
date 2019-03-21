package com.user06.dagger_2tutorial.dependency_injection.legacy_code;

public class AddressVerificationService {

    //This method validates the given address and return longitude/latitude details.
    public String validateAddress(String address)
    {
        GoogleAddressVerificationService gavs = new GoogleAddressVerificationService();
        String result = gavs.validateAddress(address);
        return result;
    }
}
