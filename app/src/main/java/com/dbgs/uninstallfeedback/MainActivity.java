package com.dbgs.uninstallfeedback;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dbgs.uninstallfeedbacklibrary.UninstallFeedbackUtil;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);

        UninstallFeedbackUtil util = new UninstallFeedbackUtil();
        util.load(Build.VERSION.SDK_INT,"/data/data/com.dbgs.uninstallfeedback");
    }

    /**
     * A native method that is 0implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
}
