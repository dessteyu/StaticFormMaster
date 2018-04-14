package com.dessteyu.baye.staticformdisplayer.Adaptator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.dessteyu.baye.staticformdisplayer.model.BaseStaticForm;

import java.util.ArrayList;

/**
 * Created by leyu on 14/04/2018.
 */

public class StaticForrmAdaptator extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private RecyclerView recyclerView;
    private ArrayList<BaseStaticForm> baseStaticForms;

    public StaticForrmAdaptator(Context context, RecyclerView recyclerView) {
        this.context = context;
        this.recyclerView = recyclerView;
        baseStaticForms = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HeaderHolder extends RecyclerView.ViewHolder{

        public HeaderHolder(View itemView) {
            super(itemView);
        }
    }
}
