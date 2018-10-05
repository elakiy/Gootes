package com.wankys.www.gootes.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wankys.www.gootes.Activities.DescriptionActivity;
import com.wankys.www.gootes.R;

public class RecyclerViewListAdapter extends RecyclerView.Adapter<RecyclerViewListAdapter.ViewHolder> {

    Context context;
    int[] productimage;
    String[] productname;
    String[] productquantity;
    String[] productprice;

    public RecyclerViewListAdapter(Context context, int[] productimage, String[] productname, String[] productquantity, String[] productprice) {
        this.context = context;
        this.productimage = productimage;
        this.productname = productname;
        this.productquantity = productquantity;
        this.productprice = productprice;
    }

    @NonNull
    @Override
    public RecyclerViewListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        Glide.with(context)
                .asBitmap()
                .load(productimage[position])
                .into(holder.imageView);

       // holder.imageView.setText(productimage[position]);
        holder.textname.setText(productname[position]);
        holder.textquantity.setText(productquantity[position]);
        holder.textprice.setText(productprice[position]);

        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DescriptionActivity.class);
               // intent.putExtra("image",holder.imageView.getText.toString());
                intent.putExtra("name",holder.textname.getText().toString());
                intent.putExtra("quantity",holder.textquantity.getText().toString());
                intent.putExtra("price",holder.textprice.getText().toString());
                context.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return productimage.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textname, textquantity, textprice;
        RelativeLayout parentlayout;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.product_image);
            textname = itemView.findViewById(R.id.product_name);
            textquantity = itemView.findViewById(R.id.product_quantity);
            textprice = itemView.findViewById(R.id.product_price);
            parentlayout = itemView.findViewById(R.id.parent_layout);


        }
    }
}
