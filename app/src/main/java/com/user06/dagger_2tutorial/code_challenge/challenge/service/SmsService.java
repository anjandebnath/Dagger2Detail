package com.user06.dagger_2tutorial.code_challenge.challenge.service;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {

        //logic to send SMS
        System.out.println("SMS sent to "+rec+ " with Message="+msg);
    }
}
