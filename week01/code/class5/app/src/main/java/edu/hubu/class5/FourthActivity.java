package edu.hubu.class5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        progressBar = findViewById(R.id.progress_1);
        button = findViewById(R.id.progress_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int progress = progressBar.getProgress();
                if (progress + 10 > 100) {
                    progressBar.setProgress(10 - (100 - progress));
                } else {
                    progressBar.setProgress(progress + 10);
                }
                button.setText("加载中..."+progressBar.getProgress()+"%");
            }
        });
    }
}
