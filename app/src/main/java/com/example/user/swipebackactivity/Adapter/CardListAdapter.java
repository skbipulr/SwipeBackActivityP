package com.example.user.swipebackactivity.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.user.swipebackactivity.Model.Item;
import com.example.user.swipebackactivity.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CardListAdapter extends RecyclerView.Adapter<CardListAdapter.MyViewHolder> {

    private Context context;
    private List<Item> list;

    public CardListAdapter(Context context, List<Item> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView=LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_list_item,viewGroup,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item item=list.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.price.setText(item.getPrice());
        Picasso.with(context).load(item.getThumbnail())
                .into(holder.thumbnail);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void removeItem(int position) {
       list.remove(position);
       notifyItemRemoved(position);
    }

    public  void  restoreItem(Item item,int position){
        list.add(position,item);
        notifyItemInserted(position);
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,description,price;
        public ImageView thumbnail;
        public RelativeLayout viewbackground, viewforeground;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            description=itemView.findViewById(R.id.description);
            price=itemView.findViewById(R.id.price);
            thumbnail=itemView.findViewById(R.id.thumbnail);
            viewbackground=itemView.findViewById(R.id.view_background);
            viewforeground=itemView.findViewById(R.id.view_foreground);
        }
    }
}
