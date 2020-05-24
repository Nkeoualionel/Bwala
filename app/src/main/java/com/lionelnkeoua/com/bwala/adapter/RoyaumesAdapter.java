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

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.model.Acceuil;
import com.lionelnkeoua.com.bwala.royaumes.kongo.KongoActivity;
import com.lionelnkeoua.com.bwala.royaumes.loango.LoangoActivity;
import com.lionelnkeoua.com.bwala.royaumes.teke.TekeActivity;

import java.util.List;

/**
 * Created by Lionel on 31/03/2018.
 */
public class RoyaumesAdapter extends RecyclerView.Adapter<RoyaumesAdapter.MyViewHolder> {
    private Context context;
    private List<Acceuil> acceuilList;

    public RoyaumesAdapter(Context context, List<Acceuil> acceuilList) {
        this.context = context;
        this.acceuilList = acceuilList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_royaumes_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, 9);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
         holder.imageView.setImageResource(acceuilList.get(position).getImage());
         holder.titre.setText(acceuilList.get(position).getTitle());
         holder.desc.setText(acceuilList.get(position).getDescription());
         holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent = new Intent(holder.linearLayout.getContext(), KongoActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                } else if (position==1){
                    Intent intent = new Intent(holder.linearLayout.getContext(), TekeActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                } else if (position==2){
                    Intent intent = new Intent(holder.linearLayout.getContext(), LoangoActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return acceuilList != null ? acceuilList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titre, desc;
        LinearLayout linearLayout;

        public MyViewHolder(View itemView, final int position) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.royaume_image);
            titre = (TextView)itemView.findViewById(R.id.title_royaume);
            desc = (TextView)itemView.findViewById(R.id.desc_royaume);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.royaume_parent);
        }
    }
}
