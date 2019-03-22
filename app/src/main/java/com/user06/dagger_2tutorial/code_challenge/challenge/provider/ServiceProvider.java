package com.user06.dagger_2tutorial.code_challenge.challenge.provider;

import com.user06.dagger_2tutorial.code_challenge.challenge.validator.Validator;

public interface ServiceProvider {

    Validator getValidator();
}
