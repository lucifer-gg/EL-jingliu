package com.example.administrator.el_done1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-5-14.
 */

public class TreasureBGFragment extends Fragment implements View.OnClickListener{
//    MainActivity mainActivity = (MainActivity)getActivity();
//    RelativeLayout RelativeLayout = (RelativeLayout)mainActivity.findViewById(R.id.centerLayout);
    private List<TreasureBGView> BGButtonList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.treasure_bg_fragment,container,false);

        //根据主题设置背景颜色
        RelativeLayout treasure_case_layout = (RelativeLayout)getActivity().findViewById(R.id.treasure_case);
        switch (Theme.getTHEME()){
            case "SIMPLE":
                treasure_case_layout.setBackgroundColor(Color.parseColor("#ffffff"));
                break;
            case "OTAKU":
                treasure_case_layout.setBackgroundColor(Color.parseColor("#fabdf0"));
                break;
            case "PET":
                treasure_case_layout.setBackgroundColor(Color.parseColor("#ffd9c1"));
                break;
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        initBGButtonList();
        for (TreasureBGView button:BGButtonList) {
            button.setOnClickListener(this);
        }

    }
    @Override
    public void onClick(View v){
        TreasureBGView b = (TreasureBGView)v;
        switch (b.getName()){
            case "爱心海滩":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg1);
                MainActivity.backGroundId = R.drawable.bg1;
                break;
            case "阳关沙滩":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg2);
                MainActivity.backGroundId = R.drawable.bg2;
                break;
            case "醉人弯月":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg3);
                MainActivity.backGroundId = R.drawable.bg3;
                break;
            case "彩霞天空":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg4);
                MainActivity.backGroundId = R.drawable.bg4;
                break;
            case "蓝天绿地":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg5);
                MainActivity.backGroundId = R.drawable.bg5;
                break;
            case "怀旧时光":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg6);
                MainActivity.backGroundId = R.drawable.bg6;
                break;
            case "极简主义":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg7);
                MainActivity.backGroundId = R.drawable.bg7;
                break;
            case "遨游宇宙":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg8);
                MainActivity.backGroundId = R.drawable.bg8;
                break;
            case "极地冰川":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg9);
                MainActivity.backGroundId = R.drawable.bg9;
                break;
            case "闲暇湖畔":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg10);
                MainActivity.backGroundId = R.drawable.bg10;
                break;
            case "礁石视野":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg11);
                MainActivity.backGroundId = R.drawable.bg11;
                break;
            case "水天一线":
                Toast.makeText(getActivity(),b.getName(),
                        Toast.LENGTH_SHORT).show();
                getActivity().findViewById(R.id.centerLayout).
                        setBackgroundResource(R.drawable.bg12);
                MainActivity.backGroundId = R.drawable.bg12;
                break;
            default:
                break;
        }
    }
    public void setBG(Button b){

    }
    public int getBGSrc(){
        return 0;
    }

    private void initBGButtonList(){
        TreasureBGView bgButton00 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_0_0);
        bgButton00.setName("爱心海滩");
        TreasureBGView bgButton01 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_0_1);
        bgButton01.setName("阳关沙滩");
        TreasureBGView bgButton02 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_0_2);
        bgButton02.setName("醉人弯月");
        TreasureBGView bgButton10 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_1_0);
        bgButton10.setName("彩霞天空");
        TreasureBGView bgButton11 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_1_1);
        bgButton11.setName("蓝天绿地");
        TreasureBGView bgButton12 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_1_2);
        bgButton12.setName("怀旧时光");
        TreasureBGView bgButton20 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_2_0);
        bgButton20.setName("极简主义");
        TreasureBGView bgButton21 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_2_1);
        bgButton21.setName("遨游宇宙");
        TreasureBGView bgButton22 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_2_2);
        bgButton22.setName("极地冰川");
        TreasureBGView bgButton30 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_3_0);
        bgButton30.setName("闲暇湖畔");
        TreasureBGView bgButton31 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_3_1);
        bgButton31.setName("礁石视野");
        TreasureBGView bgButton32 = (TreasureBGView) getActivity().findViewById(R.id.treasure_bg_3_2);
        bgButton32.setName("水天一线");
        BGButtonList.add(bgButton00);
        BGButtonList.add(bgButton01);
        BGButtonList.add(bgButton02);
        BGButtonList.add(bgButton10);
        BGButtonList.add(bgButton11);
        BGButtonList.add(bgButton12);
        BGButtonList.add(bgButton20);
        BGButtonList.add(bgButton21);
        BGButtonList.add(bgButton22);
        BGButtonList.add(bgButton30);
        BGButtonList.add(bgButton31);
        BGButtonList.add(bgButton32);
    }
}
