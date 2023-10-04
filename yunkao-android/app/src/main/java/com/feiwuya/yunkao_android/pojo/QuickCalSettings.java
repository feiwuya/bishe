package com.feiwuya.yunkao_android.pojo;

import java.io.Serializable;

public class QuickCalSettings implements Serializable {
    private int number; // 题目数量
    private int type; // 题目类型
    private int qualifyingTime; // 合格时间
    private int goodTime; // 良好时间
    private int excellentTime; // 优秀时间
    private float errorScope; // 误差范围

    public QuickCalSettings() {
    }

    public QuickCalSettings(int number, int type, int qualifyingTime, int goodTime, int excellentTime, float errorScope) {
        this.number = number;
        this.type = type;
        this.qualifyingTime = qualifyingTime;
        this.goodTime = goodTime;
        this.excellentTime = excellentTime;
        this.errorScope = errorScope;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getQualifyingTime() {
        return qualifyingTime;
    }

    public void setQualifyingTime(int qualifyingTime) {
        this.qualifyingTime = qualifyingTime;
    }

    public int getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(int goodTime) {
        this.goodTime = goodTime;
    }

    public int getExcellentTime() {
        return excellentTime;
    }

    public void setExcellentTime(int excellentTime) {
        this.excellentTime = excellentTime;
    }

    public float getErrorScope() {
        return errorScope;
    }

    public void setErrorScope(float errorScope) {
        this.errorScope = errorScope;
    }
}
