package space.merunka.quiz;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
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

public class Level23 extends AppCompatActivity {

    Dialog dialog;
    Dialog dialogEnd;

    public int numLeft; //Переменная для левой картинки + текст
    public int numRight; //Переменная для правой картинки + текст
    Array array = new Array();
    Random random = new Random();
    public int count =0;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        TextView text_levels = findViewById(R.id.text_levels);
        text_levels.setText(R.string.level23); //Установить текст

        //Скругляем углы
        final ImageView img_left = findViewById(R.id.img_left);
        img_left.setClipToOutline(true);

        //Скругляем углы
        final ImageView img_right = findViewById(R.id.img_right);
        img_right.setClipToOutline(true);

        //Путь к левой TextView
        final TextView text_left = findViewById(R.id.text_left);
        //Путь к правой TextView
        final TextView text_right = findViewById(R.id.text_right);

        //Развернуть игру на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //Вызов диалогового окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //Скрыть заголовок
        dialog.setContentView(R.layout.previewdialog); //Путь к макету диалогового окна
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //Прозрачный фон диалогового окна
        dialog.setCancelable(false); //Окно нельзя закрыть кнопкой "Назад"

        //Устанавливаем картину диалогового окна - начало
        ImageView previewimg = dialog.findViewById(R.id.previewimg);
        previewimg.setImageResource(R.drawable.levels_five__img_back);
        //Устанавливаем картину диалогового окна - конец


        //Устанавливаем описание задания - начало
        TextView textdesc = dialog.findViewById(R.id.textdescription);
        textdesc.setText(R.string.level_23);
        //Устанавливаем описание задания - конец

        //Кнопка закрывающая диалоговое окно - начало
        TextView btnclose = dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Нажатие кнопки - начало
                try {
                    //Вернуться назад к выбору уровня - начало
                    Intent intent = new Intent(Level23.this, GameLevels.class);
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

        //Кнопка "Продолжить" - начало
        Button btncontinue = dialog.findViewById(R.id.btncontinue);
        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss(); //закрываем диалоговое окно
            }
        });
        //Кнопка "Продолжить" - конец

        dialog.show();

        //__________________________________________________
        //Вызов диалогового окна в конце игры
        dialogEnd = new Dialog(this);
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE); //Скрыть заголовок
        dialogEnd.setContentView(R.layout.dialogend); //Путь к макету диалогового окна
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //Прозрачный фон диалогового окна
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd.setCancelable(false); //Окно нельзя закрыть кнопкой "Назад"

        //Меняем текст диалога в конце - начало
        TextView textdescEnd = dialogEnd.findViewById(R.id.textdescriptionEnd);
        textdescEnd.setText(R.string.level_23End);
        //Меняем текст диалога в конце - конец

        //Кнопка закрывающая диалоговое окно - начало
        TextView btnclose2 = dialogEnd.findViewById(R.id.btnclose);
        btnclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Нажатие кнопки - начало
                try {
                    //Вернуться назад к выбору уровня - начало
                    Intent intent = new Intent(Level23.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                    //Вернуться назад к выбору уровня - конец
                } catch (Exception e){

                }
                dialogEnd.dismiss(); //закрываем диалоговое окно
                //Нажатие кнопки - конец
            }
        });
        //Кнопка закрывающая диалоговое окно - конец

        //Кнопка "Продолжить" - начало
        Button btncontinue2 = dialogEnd.findViewById(R.id.btncontinue);
        btncontinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level23.this, Level24.class); //HEREEEEEEEEEE
                    startActivity(intent);
                    finish();
                }catch (Exception e){}

                dialogEnd.dismiss(); //закрываем диалоговое окно
            }
        });
        //Кнопка "Продолжить" - конец

        //__________________________________________________

        //Кнопка "Назад" - начало
        Button btn_back = findViewById(R.id.button_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level23.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){}
            }
        });
        //Кнопка "Назад" - конец

        //Массив для прогресса игры - начало
        final int[] progress ={
                R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5, R.id.point6
        };
        //Массив для прогресса игры - конец

        //Подключаем анимацию - начало
        final Animation a = AnimationUtils.loadAnimation(Level23.this, R.anim.alpha);
        //Подключаем анимацию - конец

        numLeft = random.nextInt(16); //Генерация случайных чисел 0-15
        img_left.setImageResource(array.images_chan[numLeft]);
        text_left.setText(" ");

        numRight = random.nextInt(16); //Генерация случайных чисел 0-15

        //Убираем равенство чисел
        while (array.strong[numLeft] == array.strong[numRight]){
            numRight = random.nextInt(16);
        }
        img_right.setImageResource(array.images_chan[numRight]);
        text_right.setText(" ");

        //Нажатие на левую картинку - начало
        img_left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                //Условие касания картинки - начало
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    //Если коснулись картинки - начало
                    img_right.setEnabled(false);
                    if(array.strong[numLeft] > array.strong[numRight]){
                        img_left.setImageResource(R.drawable.img_true);
                    } else {
                        img_left.setImageResource(R.drawable.img_false);
                    }
                    //Если коснулись картинки - конец
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    //Если отпустил палец - начало
                    if(array.strong[numLeft] > array.strong[numRight]){
                        if(count < 6){
                            count = count +1;
                        }
                        for(int i=0; i<6; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //Filling by green - start
                        for(int i =0; i<count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //Filling by green - end
                    }else{
                        //Если левая картинка меньше
                        if(count > 0){
                            if(count == 1){
                                count =0;
                            } else {
                                count = count -2;
                            }
                        }
                        for(int i=0; i<6; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //Filling by green - start
                        for(int i =0; i<count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    //Если отпустил палец - конец
                    if(count ==6){
                        //Выход из уровня
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("Level", 1);
                        if(level >23){

                        } else {
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("Level",24);
                            editor.commit();
                        }
                        dialogEnd.show();
                    } else {
                        numLeft = random.nextInt(16); //Генерация случайных чисел 0-15
                        img_left.setImageResource(array.images_chan[numLeft]);
                        img_left.startAnimation(a);

                        numRight = random.nextInt(16); //Генерация случайных чисел 0-15

                        //Убираем равенство чисел
                        while (array.strong[numLeft] == array.strong[numRight]){
                            numRight = random.nextInt(16);
                        }
                        img_right.setImageResource(array.images_chan[numRight]);
                        img_right.startAnimation(a);


                        img_right.setEnabled(true);
                    }
                }
                //Условие касания картинки - конец
                return true;
            }
        });
        //Нажатие на левую картинку - конец

        //Нажатие на правую картинку - начало
        img_right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                //Условие касания картинки - начало
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    //Если коснулись картинки - начало
                    img_left.setEnabled(false);
                    if(array.strong[numLeft] < array.strong[numRight]){
                        img_right.setImageResource(R.drawable.img_true);
                    } else {
                        img_right.setImageResource(R.drawable.img_false);
                    }
                    //Если коснулись картинки - конец
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    //Если отпустил палец - начало
                    if(array.strong[numLeft] < array.strong[numRight]){
                        if(count < 6){
                            count = count +1;
                        }
                        for(int i=0; i<6; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //Filling by green - start
                        for(int i =0; i<count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                        //Filling by green - end
                    }else{
                        //Если правая картинка меньше
                        if(count > 0){
                            if(count == 1){
                                count =0;
                            } else {
                                count = count -2;
                            }
                        }
                        for(int i=0; i<6; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }
                        //Filling by green - start
                        for(int i =0; i<count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }
                    //Если отпустил палец - конец
                    if(count ==6){
                        //Выход из уровня
                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                        final int level = save.getInt("Level", 1);
                        if(level >23){

                        } else {
                            SharedPreferences.Editor editor = save.edit();
                            editor.putInt("Level",24);
                            editor.commit();
                        }
                        dialogEnd.show();
                    } else {
                        numLeft = random.nextInt(16); //Генерация случайных чисел 0-15
                        img_left.setImageResource(array.images_chan[numLeft]);
                        img_left.startAnimation(a);

                        numRight = random.nextInt(16); //Генерация случайных чисел 0-15

                        //Убираем равенство чисел
                        while (array.strong[numLeft] == array.strong[numRight]){
                            numRight = random.nextInt(16);
                        }
                        img_right.setImageResource(array.images_chan[numRight]);
                        img_right.startAnimation(a);

                        img_left.setEnabled(true);
                    }
                }
                //Условие касания картинки - конец
                return true;
            }
        });
        //Нажатие на правую картинку - конец
    }
    //Системная кнопка "назад" - начало
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level23.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e){}
    }
    //Системная кнопка "назад" - конец
}