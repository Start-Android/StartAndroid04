package start.android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button을 배열 안에 넣어서 쉽게 관리할 수 있도록 함
        //이해가 되지 않는다면 기본 Java 문법을 복습할 필요가 있음

        Button[] buttons = new Button[]{
                findViewById(R.id.btnLayout01),
                findViewById(R.id.btnLayout02),
                findViewById(R.id.btnLayout03),
                findViewById(R.id.btnView01),
                findViewById(R.id.btnView02)
        };

        for(int i = 0; i<5; i++)
        {
            int finalI = i; //에러가 나는 경우 final 사용(저같은 킹-반인들은 왜 final을 안 쓰면 에러가 나는지 이해 못함..)
            buttons[i].setOnClickListener(v -> {
                Intent intent;
                switch (finalI) // switch문 정도는 이해되시죠?
                {
                    case 0 : intent = new Intent(getApplicationContext(), LinearLayoutTest01.class); startActivity(intent); break;
                    case 1 : intent = new Intent(getApplicationContext(), LinearLayoutTest02.class); startActivity(intent); break;
                    case 2 : intent = new Intent(getApplicationContext(), LinearLayoutTest03.class); startActivity(intent); break;
                    case 3 : intent = new Intent(getApplicationContext(), View01.class); startActivity(intent); break;
                    case 4 : intent = new Intent(getApplicationContext(), View02.class); startActivity(intent); break;
                }

            });
        }

    }
}