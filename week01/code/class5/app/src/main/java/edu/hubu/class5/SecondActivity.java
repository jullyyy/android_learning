package edu.hubu.class5;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    List<CheckBox> checkBoxes = new ArrayList<>();
    CheckBox basketballBox, soccerBox, volleyballBox;
    TextView textView;
    StringBuilder str = new StringBuilder();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.text);

        basketballBox = findViewById(R.id.basketball_box);
        soccerBox = findViewById(R.id.soccer_box);
        volleyballBox = findViewById(R.id.volleyball_box);
        checkBoxes.add(basketballBox);
        checkBoxes.add(soccerBox);
        checkBoxes.add(volleyballBox);

        for (CheckBox checkBox : checkBoxes) {
            checkBox.setOnCheckedChangeListener(this);
        }
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<CheckBox> checkItems = new ArrayList<>();
                StringBuilder result = new StringBuilder();
                for (CheckBox checkBox : checkBoxes) {
                    if (checkBox.isChecked()) {
                        checkItems.add(checkBox);
                    }
                }
                int i;
                for (i = 0; i < checkItems.size() - 1; i++) {
                    result.append(checkItems.get(i).getText() + "-");
                }
                result.append(checkItems.get(i).getText());
                textView.setText(result.toString());
            }
        });


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        Toast.makeText(SecondActivity.this, isChecked + String.valueOf(compoundButton.getText()), Toast.LENGTH_SHORT).show();
    }
}

    

