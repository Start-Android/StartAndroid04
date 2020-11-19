package start.android.view;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class View01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_01);

        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);

        textView.setText("Text is changed.");
        editText.setText("EditText 내용이 바뀌었습니다. 이걸로");



        Button button = findViewById(R.id.button);
        ImageButton imageButton = findViewById(R.id.imageButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //클릭했을 때 실행됨(자동완성 가능)
            }
        });

        imageButton.setOnClickListener(v -> {
            //클릭했을 때 실행됨(자동완성 가능, 람다식)
        });


        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_launcher_background) ;




    }
}