package com.testdemo.testdemo;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.InstrumentationTestCase;
import android.util.Log;



public class EmailTest extends InstrumentationTestCase {



    public void testEmail() throws Exception {
        String to = "user@edx.com";
        String subject = "edX Test Email";
        String email = "hi, this is test email";
        EmailUtil.sendEmail(getInstrumentation()
                .getTargetContext(), to, subject, email);
        Log.d("Tag","sending email...");
    }
}