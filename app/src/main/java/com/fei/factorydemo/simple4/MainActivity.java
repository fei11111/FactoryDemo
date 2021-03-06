package com.fei.factorydemo.simple4;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fei.factorydemo.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        IOHandler ioHandler = IOHandlerFactory.getInstance().createIOHandler(SPIOHandler.class);
        ioHandler.saveString("name", "Fei");
        ioHandler.saveString("age", "18");


    }

    public void click(View view) {
        IOHandler ioHandler = IOHandlerFactory.getInstance().createIOHandler(SPIOHandler.class);
        String name = ioHandler.getString("name", "");
        String age = ioHandler.getString("age", "");
        tv.setText("name = " + name + " age = " + age);
    }
}