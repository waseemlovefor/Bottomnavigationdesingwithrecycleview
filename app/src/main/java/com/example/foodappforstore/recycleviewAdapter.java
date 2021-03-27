package com.example.foodappforstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class recycleviewAdapter extends RecyclerView.Adapter<recycleviewAdapter.recyviewHolder> implements Filterable {
    Context context;
    List<imageModel> imagelist=new ArrayList<>();
    List<imageModel> fullimagelist=new ArrayList<>();

    public recycleviewAdapter(Context context, List<imageModel> imagelist) {
        this.context = context;
        this.imagelist = imagelist;
        this.fullimagelist=imagelist;
    }

    @NonNull
    @Override
    public recyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycleviewlist,parent,false);
        return new recyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyviewHolder holder, int position) {
        imageModel imageModel=imagelist.get(position);
        holder.imageView.setImageResource(imageModel.getImage());
        holder.like.setText(imageModel.getShare());
        holder.share.setText(imageModel.getShare());
    }

    @Override
    public int getItemCount() {
        return imagelist.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }
    Filter filter=new Filter() {
        @Override
        // run in the background thread
        protected FilterResults performFiltering(CharSequence constraint) {
            List<imageModel> filterlist=new ArrayList<>();
            if (constraint.toString().isEmpty()){
                filterlist.addAll(fullimagelist);
            }
            else{
                for (imageModel list:imagelist){
                    if (list.toString().contains(constraint.toString().toLowerCase())){
                        filterlist.add(list);
                    }
                }
            }
            FilterResults results=new FilterResults();
            results.values=filterlist;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
       imagelist.clear();
       imagelist.addAll((Collection<? extends imageModel>)results.values );
       notifyDataSetChanged();
        }
    };

    class recyviewHolder extends RecyclerView.ViewHolder {
           ImageView imageView;
           Button like;
           Button share;
        public recyviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview);
            like=itemView.findViewById(R.id.like);
            share=itemView.findViewById(R.id.share);
        }
    }
}
