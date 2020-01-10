package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView counterTxt;
    private Button add;
    private Button sub;
    private int counter;
    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.b1:
                    addCounter();
                break;
                case  R.id.b2:
                subCounter();
                break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTxt=(TextView) findViewById(R.id.tv1);
        add=(Button) findViewById(R.id.b1);
        sub=(Button) findViewById(R.id.b2);
        sub.setOnClickListener(clickListener);
        add.setOnClickListener(clickListener);

        initCounter();
    }

    private void initCounter() {
        counter=0;
        counterTxt.setText(counter + "");
    }
    private void addCounter() {
        counter++;
        counterTxt.setText(counter+"");
    }
    private void subCounter() {
        counter--;
        counterTxt.setText(counter+"");
    }
}
