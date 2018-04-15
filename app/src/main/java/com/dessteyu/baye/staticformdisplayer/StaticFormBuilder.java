package com.dessteyu.baye.staticformdisplayer;

import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dessteyu.baye.staticformdisplayer.Adaptator.StaticForrmAdaptator;
import com.dessteyu.baye.staticformdisplayer.model.BaseStaticForm;

import java.util.ArrayList;

/**
 * Is for the builder Form
 * Created by leyu on 14/04/2018.
 */

public class StaticFormBuilder {
    private StaticForrmAdaptator adaptator;

    public StaticFormBuilder(Context context, RecyclerView recycleView) {
        initForm(context,recycleView);
    }

//    init the recycleView
    public void initForm(Context context,RecyclerView recyclerView){
        adaptator = new StaticForrmAdaptator(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new DividerItemDecoration(context,
                DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adaptator);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void addElements(ArrayList<BaseStaticForm> baseStaticForms){
        adaptator.addElements(baseStaticForms);
    }


}
