package com.project.flyingchess.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/13.
 */
public class Plane implements Serializable{
    private int planeTag;
    private boolean isFinish;
    private boolean isSelect;

    public Plane(int planeTag, boolean isFinish, boolean isSelect) {
        this.planeTag = planeTag;
        this.isFinish = isFinish;
        this.isSelect = isSelect;
    }

    public int getPlaneTag() {
        return planeTag;
    }

    public void setPlaneTag(int planeTag) {
        this.planeTag = planeTag;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }
}
