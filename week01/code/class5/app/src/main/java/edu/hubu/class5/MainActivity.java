package edu.hubu.class5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        setButtonListener(btn2);
        setButtonListener(btn3);
        setButtonListener(btn4);
        setButtonListener(btn5);
    }

    private void setButtonListener(Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            Intent intent;
            @Override
            public void onClick(View view) {
                switch (btn.getId()) {
                    case R.id.btn_2:
                        intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_3:
                        intent = new Intent(MainActivity.this, ThirdActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_4:
                        intent = new Intent(MainActivity.this, FourthActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_5:
                        intent = new Intent(MainActivity.this, FifthActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

            }
        });

//
    }


}