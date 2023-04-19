package edu.hubu.class5;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SixActivity extends AppCompatActivity {
    TimePicker timePicker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        timePicker = findViewById(R.id.time);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                String str = (i1 < 10) ? "0" + i1 : String.valueOf(i1);
                Toast.makeText(SixActivity.this, "当前时间是 " + i + ": " + str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
