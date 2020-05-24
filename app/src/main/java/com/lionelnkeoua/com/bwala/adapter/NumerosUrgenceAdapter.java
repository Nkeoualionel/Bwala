package com.lionelnkeoua.com.bwala.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lionelnkeoua.com.bwala.R;
import com.lionelnkeoua.com.bwala.model.NumerosUrgence;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Lionel on 24/03/2018.
 */
public class NumerosUrgenceAdapter extends RecyclerView.Adapter<NumerosUrgenceAdapter.ViewHolder> {
    private Context context;
    private List<NumerosUrgence> numerosUrgenceList;

    //les numéros
    private String pompiers = "118";
    private String telPompiers = "tel:"+pompiers;
    private String police = "117";
    private String telPolice = "tel:"+police;
    private String sne = "4242";
    private String telSne = "tel:"+sne;
    private String snde = "00242056484060";
    private String telSnde = "tel:"+snde;
    private String arpce = "00242055107272";
    private String telArpce = "tel:"+arpce;


    public NumerosUrgenceAdapter(Context context, List<NumerosUrgence> numerosUrgenceList) {
        this.context=context;
        this.numerosUrgenceList=numerosUrgenceList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_numeros_urgence_item, parent, false);
        ViewHolder v = new ViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.imgService.setImageResource(numerosUrgenceList.get(position).getImageService());
        holder.service.setText(numerosUrgenceList.get(position).getService());
        holder.numService.setText(numerosUrgenceList.get(position).getNumero());
        holder.callService.setImageResource(numerosUrgenceList.get(position).getActionCall());

        holder.callService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(telPompiers));
                    holder.callService.getContext().startActivity(intent);
                } else if (position==1){
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(telPolice));
                    holder.callService.getContext().startActivity(intent);
                } else if (position==2){
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(telSne));
                    holder.callService.getContext().startActivity(intent);
                } else if (position==3){
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(telSnde));
                    holder.callService.getContext().startActivity(intent);
                } else if (position==4){
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(telArpce));
                    holder.callService.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return numerosUrgenceList!=null? numerosUrgenceList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgService, callService;
        TextView service, numService;
        public ViewHolder(View itemView) {
            super(itemView);
            imgService = (ImageView) itemView.findViewById(R.id.num_uregence_image);
            service = (TextView)itemView.findViewById(R.id.service);
            numService = (TextView) itemView.findViewById(R.id.numero);
            callService = (ImageView)itemView.findViewById(R.id.action_call);
        }
    }
}
