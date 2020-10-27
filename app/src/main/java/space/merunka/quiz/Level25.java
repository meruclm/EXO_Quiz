package space.merunka.quiz;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Level25 extends AppCompatActivity {

    Dialog dialog;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_three);

        //Развернуть игру на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //Вызов диалогового окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //Скрыть заголовок
        dialog.setContentView(R.layout.previewdialog_end); //Путь к макету диалогового окна
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //Прозрачный фон диалогового окна
        dialog.setCancelable(false); //Окно нельзя закрыть кнопкой "Назад"

        //Кнопка закрывающая диалоговое окно - начало
        TextView btnclose = dialog.findViewById(R.id.btncontinue);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Нажатие кнопки - начало
                try {
                    //Вернуться назад к выбору уровня - начало
                    Intent intent = new Intent(Level25.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                    //Вернуться назад к выбору уровня - конец
                } catch (Exception e){

                }
                dialog.dismiss(); //закрываем диалоговое окно
                //Нажатие кнопки - конец
            }
        });
        //Кнопка закрывающая диалоговое окно - конец

        dialog.show();

        //Подключаем анимацию - начало
        final Animation a = AnimationUtils.loadAnimation(Level25.this, R.anim.alpha);
        //Подключаем анимацию - конец

    }
    //Системная кнопка "назад" - начало
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level25.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e){}
    }
    //Системная кнопка "назад" - конец
}