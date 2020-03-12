package com.example.administrator.el_done1;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class DairyActivity extends AppCompatActivity {
    private List<Dairy> dairyList = new ArrayList<>();

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
        setContentView(R.layout.dairy_activity);

        //存入ActivityManager
        ActivityManager.addActivity(this);



        //隐藏应用默认标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null){
            actionBar.hide();
        }

        initDairy();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.dairy_recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DairyAdapter adapter = new DairyAdapter(dairyList);
        recyclerView.setAdapter(adapter);

        Button back_button = (Button)findViewById(R.id.dairy_title_back);
        Button more_button = (Button)findViewById(R.id.dairy_title_more);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityManager.removeActivity(DairyActivity.this);
            }
        });

        more_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void initDairy(){
        Dairy d1 = new Dairy("暂无数据",R.id.dairy_face_left,1);
        dairyList.add(d1);
        Dairy d2 = new Dairy("暂无数据",R.id.dairy_face_right,2);
        dairyList.add(d2);
        Dairy d3 = new Dairy("暂无数据",R.id.dairy_face_left,3);
        dairyList.add(d3);
        Dairy d4 = new Dairy("暂无数据",R.id.dairy_face_right,4);
        dairyList.add(d4);
        Dairy d5 = new Dairy("暂无数据",R.id.dairy_face_left,5);
        dairyList.add(d5);
        Dairy d6 = new Dairy("暂无数据",R.id.dairy_face_right,6);
        dairyList.add(d6);
        Dairy d7 = new Dairy("暂无数据",R.id.dairy_face_left,7);
        dairyList.add(d7);
        Dairy d8 = new Dairy("暂无数据",R.id.dairy_face_right,8);
        dairyList.add(d8);
        Dairy d9 = new Dairy("暂无数据",R.id.dairy_face_left,9);
        dairyList.add(d9);
        Dairy d10 = new Dairy("暂无数据",R.id.dairy_face_right,10);
        dairyList.add(d10);
        Dairy d11 = new Dairy("暂无数据",R.id.dairy_face_left,11);
        dairyList.add(d11);
        Dairy d12 = new Dairy("暂无数据",R.id.dairy_face_right,12);
        dairyList.add(d12);
    }


}
