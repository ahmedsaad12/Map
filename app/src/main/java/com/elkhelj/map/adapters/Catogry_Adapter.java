package com.elkhelj.map.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.elkhelj.map.R;
import com.elkhelj.map.activities_fragments.activity_splash.activity_my_order_detials.OrderDetialsActivity;
import com.elkhelj.map.databinding.ActivityDetialsBinding;
import com.elkhelj.map.databinding.CatogryRowBinding;
import com.elkhelj.map.models.Catogries_Model;

import java.util.List;
import java.util.Locale;

import io.paperdb.Paper;

public class Catogry_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int ITEM_DATA = 1;
    private final int LOAD = 2;
    private List<Catogries_Model> orderModelList;
    private Context context;
    private LayoutInflater inflater;
    private String lang;
    int index = -1;
private OrderDetialsActivity activity;
    public Catogry_Adapter(List<Catogries_Model> orderModelList, Context context) {
        this.orderModelList = orderModelList;
        this.context = context;
        inflater = LayoutInflater.from(context);
        Paper.init(context);
        lang = Paper.book().read("lang", Locale.getDefault().getLanguage());
activity=(OrderDetialsActivity) context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            CatogryRowBinding binding = DataBindingUtil.inflate(inflater, R.layout.catogry_row, parent, false);
            return new EventHolder(binding);



    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Catogries_Model order_orderModel = orderModelList.get(position);
        if (holder instanceof EventHolder)
        {
        final EventHolder eventHolder = (EventHolder) holder;
        eventHolder.binding.setAdmodel(order_orderModel);
        eventHolder.binding.num.setText((position+1)+"");
eventHolder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        activity.showdetialss(orderModelList.get(eventHolder.getLayoutPosition()));
    }
});
        }
    }

    @Override
    public int getItemCount() {
        return orderModelList.size();
    }

    public class EventHolder extends RecyclerView.ViewHolder {
        public CatogryRowBinding binding;

        public EventHolder(CatogryRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }


    @Override
    public int getItemViewType(int position) {
        Catogries_Model order_Model = orderModelList.get(position);
        if (order_Model!=null)
        {
            return ITEM_DATA;
        }else
        {
            return LOAD;
        }

    }


}
