package com.dessteyu.baye.staticformdisplayer.Adaptator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dessteyu.baye.staticformdisplayer.R;
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
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case BaseStaticForm.HEADER:
                holder = new HeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.header_layout, null));
            case BaseStaticForm.LABEL_AND_VALUE:
                holder = new HeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.label_and_value_layout, null));
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BaseStaticForm baseForm = baseStaticForms.get(position);
        switch (baseForm.getTypeView()) {
            case BaseStaticForm.HEADER:
                HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;
                headerViewHolder.headerElement.setText(baseForm.getValue() != null ? baseForm.getValue() : baseForm.getLabel());
                break;
            case BaseStaticForm.LABEL_AND_VALUE:
                LabelAndValueViewHolder labelAndValueViewHolder = (LabelAndValueViewHolder) holder;
                labelAndValueViewHolder.valueElement.setText(baseForm.getValue());
                labelAndValueViewHolder.labelElement.setText(baseForm.getLabel());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return baseStaticForms.size();
    }


    //    return the corresponding View


    @Override
    public int getItemViewType(int position) {
        return baseStaticForms.get(position).getTypeView();
    }


    // this class is for displaying header
//    TODO:: add listener
    public class HeaderViewHolder extends RecyclerView.ViewHolder {
        private TextView headerElement;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            headerElement = (TextView) itemView.findViewById(R.id.header_element);
        }
    }

    //    this class is for displaying label and value text
//    TODO:: add listener
    public class LabelAndValueViewHolder extends RecyclerView.ViewHolder {
        private TextView labelElement;
        private TextView valueElement;

        public LabelAndValueViewHolder(View itemView) {
            super(itemView);
            labelElement = (TextView) itemView.findViewById(R.id.label_element);
            valueElement = (TextView) itemView.findViewById(R.id.value_element);
        }
    }

    public void addElements(ArrayList<BaseStaticForm> baseStaticForms) {
        this.baseStaticForms = baseStaticForms != null ? baseStaticForms : new ArrayList<BaseStaticForm>();
    }
}
