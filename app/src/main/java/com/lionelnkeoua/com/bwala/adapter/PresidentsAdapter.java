package com.lionelnkeoua.com.bwala.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.view.fragment.youlou.debat.MassambaActivity;
import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.lissouba.LissoubaActivity;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.ngouabi.NgouabiActivity;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.opangault.OpangaultActivity;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.sassou.SassouActivity;
import com.lionelnkeoua.com.bwala.view.fragment.youlou.youlou.YoulouActivity;
import com.lionelnkeoua.com.bwala.model.Acceuil;

import java.util.List;

/**
 * Created by Lionel on 08/02/2018.
 */
public class PresidentsAdapter extends RecyclerView.Adapter<PresidentsAdapter.MyViewHolder> {
    List<Acceuil> acceuilList;
    Context context;

    public PresidentsAdapter(List<Acceuil> acceuilList, Context context) {
        this.acceuilList = acceuilList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.presidents_card_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, 2);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.image.setImageResource(acceuilList.get(position).getImage());
        holder.tv1.setText(acceuilList.get(position).getTitle());
        holder.tv2.setText(acceuilList.get(position).getDescription());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                     Intent itent = new Intent(context, YoulouActivity.class);
                     holder.linearLayout.getContext().startActivity(itent);
                } else if (position==1){
                    Intent itent = new Intent(context, MassambaActivity.class);
                    holder.linearLayout.getContext().startActivity(itent);
                } else if (position==2){
                    Intent intent = new Intent(context, NgouabiActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                } else if (position==3){
                    Intent intent = new Intent(context, OpangaultActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                } else if (position==4){
                    Intent intent = new Intent(context, LissoubaActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                } else if (position==5){
                    Intent intent = new Intent(context, SassouActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return acceuilList!=null? acceuilList.size(): 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2;
        ImageView image;
        LinearLayout linearLayout;

        public MyViewHolder(View itemView, final int position) {
            super(itemView);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.presidents_item);
            image = (ImageView)itemView.findViewById(R.id.presidents_image);
            tv1 = (TextView)itemView.findViewById(R.id.name);
            tv2 = (TextView)itemView.findViewById(R.id.name_desc);
        }
    }
}
