package edu.hubu.class5;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_btn_1:
                        Toast.makeText(ThirdActivity.this, "第二个", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_btn_2:
                        Toast.makeText(ThirdActivity.this, "第三个", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_btn_3:
                        Toast.makeText(ThirdActivity.this, "第一个", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
