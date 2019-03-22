package com.user06.dagger_2tutorial.code_challenge.solution.service;

public class EmailService implements MessageService {


    @Override
    public void sendMessage(String msg, String rec) {

        //logic to send email
        System.out.println("Email sent to "+rec+ " with Message="+msg);
    }
}
