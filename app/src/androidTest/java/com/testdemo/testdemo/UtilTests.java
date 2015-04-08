package com.testdemo.testdemo;

import android.content.Intent;
import android.net.Uri;
import android.test.InstrumentationTestCase;
import android.util.Log;


public class UtilTests extends InstrumentationTestCase {
    
    public void testBrowserOpenUrl() throws Exception {
        String url = "https://www.google.com";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setData(Uri.parse(url));
        getInstrumentation().getTargetContext().startActivity(intent);

        Log.d("URLTag", "finished open URL in browser");
    }

}
