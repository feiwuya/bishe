package com.feiwuya.yunkao_android.pojo;

import java.io.Serializable;

public class CalProblem implements Serializable{
    private String formula; // 算式
    private double correctAnswer; // 正确答案
    private String inputAnswer; // 输入答案
    private boolean error; // 是否有误差
    private double errorScope; // 误差范围
    // 做题时间
    private long time;

    public CalProblem(String formula, double correctAnswer) {
        this.formula = formula;
        this.correctAnswer = correctAnswer;
    }

    public CalProblem(String formula, double correctAnswer, String inputAnswer, boolean error, double errorScope) {
        this.formula = formula;
        this.correctAnswer = correctAnswer;
        this.inputAnswer = inputAnswer;
        this.error = error;
        this.errorScope = errorScope;
    }

    public CalProblem(String formula, double correctAnswer, String inputAnswer, boolean error) {
        this.formula = formula;
        this.correctAnswer = correctAnswer;
        this.inputAnswer = inputAnswer;
        this.error = error;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(double correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getInputAnswer() {
        return inputAnswer;
    }

    public void setInputAnswer(String inputAnswer) {
        this.inputAnswer = inputAnswer;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public double getErrorScope() {
        return errorScope;
    }

    public void setErrorScope(double errorScope) {
        this.errorScope = errorScope;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CalProblem{" +
                "formula='" + formula + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", inputAnswer='" + inputAnswer + '\'' +
                ", error=" + error +
                ", errorScope=" + errorScope +
                ", time=" + time +
                '}';
    }
}
