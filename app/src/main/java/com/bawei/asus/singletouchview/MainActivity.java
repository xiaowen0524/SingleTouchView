package com.bawei.asus.singletouchview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private XCGuaguakaView xcGuaguakaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xcGuaguakaView = (XCGuaguakaView) findViewById(R.id.ggk);
        xcGuaguakaView.setOnCompleteListener(new XCGuaguakaView.OnCompleteListener() {
            @Override
            public void complete() {
                Toast.makeText(getApplicationContext(), "您已经刮的差不多啦", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
