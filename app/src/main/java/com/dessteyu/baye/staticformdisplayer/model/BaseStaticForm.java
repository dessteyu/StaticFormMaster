package com.dessteyu.baye.staticformdisplayer.model;

/**
 * Created by leyu on 14/04/2018.
 */

public class BaseStaticForm {
//    The type of existing Views
    public static final int HEADER = 0;
    public static final int LABEL_AND_VALUE = 1;

    private int typeView;
    private String value;
    private String label;

    public BaseStaticForm(int typeView) {
        this.typeView = typeView;
    }

    public int getTypeView() {
        return typeView;
    }

    public BaseStaticForm setTypeView(int typeView) {
        this.typeView = typeView;
        return this;
    }

    public String getValue() {
        return value;
    }

    public BaseStaticForm setValue(String value) {
        this.value = value;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public BaseStaticForm setLabel(String label) {
        this.label = label;
        return this;
    }
}
