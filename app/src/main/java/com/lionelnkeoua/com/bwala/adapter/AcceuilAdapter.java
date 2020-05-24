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
import com.lionelnkeoua.com.bwala.view.DatesActivity;
import com.lionelnkeoua.com.bwala.model.Acceuil;
import com.lionelnkeoua.com.bwala.view.PresidentsActivity;
import com.lionelnkeoua.com.bwala.view.RoyaumesActivity;

import java.util.List;

/**
 * Created by Lionel on 04/02/2018.
 */
public class AcceuilAdapter extends RecyclerView.Adapter<AcceuilAdapter.MyViewHolder> {
    public List<Acceuil> acceuilList;
    public Context context;

    public AcceuilAdapter(List<Acceuil> acceuilList, Context context) {
        this.acceuilList = acceuilList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_acceuil, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view, 0);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.imageView.setImageResource(acceuilList.get(position).getImage());
        holder.title.setText(acceuilList.get(position).getTitle());
        holder.description.setText(acceuilList.get(position).getDescription());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position==0){
                    Intent intent = new Intent(context,PresidentsActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                } else if (position==1){
                    Intent inten = new Intent(context, DatesActivity.class);
                    holder.linearLayout.getContext().startActivity(inten);
                } else if (position==2){
                    Intent intent = new Intent(context, RoyaumesActivity.class);
                    holder.linearLayout.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount(){
       return acceuilList!=null ? acceuilList.size() :  0;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, description;
        public Context context;
        ImageView imageView;
        public LinearLayout linearLayout;
        public MyViewHolder(final View itemView, final int position) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.contener);
            imageView = (ImageView)itemView.findViewById(R.id.presidents_img);
            title = (TextView)itemView.findViewById(R.id.title);
            description = (TextView)itemView.findViewById(R.id.description);
        }
    }
}
