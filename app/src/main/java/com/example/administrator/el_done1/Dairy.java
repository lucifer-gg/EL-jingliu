package com.example.administrator.el_done1;

/**
 * Created by Administrator on 2018-5-21.
 */

public class Dairy {
    private String name;
    private int dairyFaceId;
    private boolean atLeft;   //想用这个实现布局里一左一右的脚印图片
    private int indexInList;
    private int dairyFaceSourceId;

    public Dairy(String name, int friendFaceId,int i){
        this.name = name;
        this.dairyFaceId = friendFaceId;
        this.indexInList = i;
        atLeft = friendFaceId == R.id.dairy_face_left;
        if (atLeft){
            switch (Theme.getTHEME()){
                case "SIMPLE":
                    this.dairyFaceSourceId=R.drawable.foot_simple_left;
                    break;
                case "OTAKU":
                    this.dairyFaceSourceId=R.drawable.foot_otaku_left;
                    break;
                case "PET":
                    this.dairyFaceSourceId=R.drawable.foot_cute_pet_left;
                    break;
            }
        }else {
            switch (Theme.getTHEME()){
                case "SIMPLE":
                    this.dairyFaceSourceId=R.drawable.foot_simple_right;
                    break;
                case "OTAKU":
                    this.dairyFaceSourceId=R.drawable.foot_otaku_right;
                    break;
                case "PET":
                    this.dairyFaceSourceId=R.drawable.foot_cute_pet_right;
                    break;
            }
        }
    }
    public String getName(){
        return name;
    }

    public int getDairyFaceId(){
        return dairyFaceId;
    }

    public boolean isAtLeft(){
        return this.atLeft;
    }

    public int getIndexInList() {
        return indexInList;
    }

    public int getDairyFaceSourceId(){
        return this.dairyFaceSourceId;
    }

}
