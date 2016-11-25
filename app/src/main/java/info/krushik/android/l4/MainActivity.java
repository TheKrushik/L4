package info.krushik.android.l4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Создать класс «игра в крестики-нолики». Поле класса - массив из (3х3) или целые числа. Ставить можно только на свободные.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
