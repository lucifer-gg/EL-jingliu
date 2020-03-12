package com.example.administrator.el_done1;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FocusSuccessDialogActivity extends AppCompatActivity {

    private TextView focus_success_text;
    private Button focus_success_true_button;
    private TextView focus_success_pet_talk_text;
    private ImageView focus_success_desk_pet_view;


    //重写活动销毁方式，用ActivityManager来销毁
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityManager.removeActivity(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //根据主题设置字体
        switch (Theme.getTHEME()){
            case "SIMPLE":
                setTheme(R.style.SIMPLE_THEME);
                break;
            case "OTAKU":
                setTheme(R.style.OTAKU_THEME);
                break;
            case "PET":
                setTheme(R.style.PET_THEME);
                break;
        }

        //设立layout
        setContentView(R.layout.focus_success_dialog_activity);

        //存入ActivityManager
        ActivityManager.addActivity(this);



        //隐藏应用默认标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null){
            actionBar.hide();
        }

        focus_success_true_button = (Button)findViewById(R.id.focus_success_dialog_true);
        focus_success_true_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        focus_success_desk_pet_view = (ImageView)findViewById(R.id.focus_success_dialog_deskPetView);

        int i =0;
        switch (MainActivity.DeskPetName){
            case "DeskPetWanzi":
                focus_success_desk_pet_view.setImageResource(DeskPetWanzi.getImageIdOf(i));
                break;
            case "DeskPetMoli":
                focus_success_desk_pet_view.setImageResource(DeskPetMoli.getImageIdOf(i));
                break;
            case "DeskPetChuyin":
                focus_success_desk_pet_view.setImageResource(DeskPetChuyin.getImageIdOf(i));
                break;
            case "DeskPetGumingdijue":
                focus_success_desk_pet_view.setImageResource(DeskPetGumingdijue.getImageIdOf(i));
                break;
            case "DeskPetMaoerniang":
                focus_success_desk_pet_view.setImageResource(DeskPetMaoerniang.getImageIdOf(i));
                break;
            case "DeskPetMaoerkunan":
                focus_success_desk_pet_view.setImageResource(DeskPetMaoerkunan.getImageIdOf(i));
                break;
            case "DeskPetYinshi":
                focus_success_desk_pet_view.setImageResource(DeskPetYinshi.getImageIdOf(i));
                break;
            case "DeskPetMaolaoshi":
                focus_success_desk_pet_view.setImageResource(DeskPetMaolaoshi.getImageIdOf(i));
                break;
            case "DeskPetPikaqiu":
                focus_success_desk_pet_view.setImageResource(DeskPetPikaqiu.getImageIdOf(i));
                break;
            default:
                break;
        }

    }
}
