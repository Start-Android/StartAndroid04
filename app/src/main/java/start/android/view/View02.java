package start.android.view;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class View02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_02);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //람다식 미사용
            }
        });

        /*
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            //람다식 사용
        });
        */


        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //자동으로 implement됨(implement 하지 않으면 오류 발생)
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //자동으로 implement됨(implement 하지 않으면 오류 발생)
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //자동으로 implement됨(implement 하지 않으면 오류 발생)
            }
        });


    }
}
