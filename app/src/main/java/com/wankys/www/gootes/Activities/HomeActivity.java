package com.wankys.www.gootes.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.wankys.www.gootes.Adapters.RecyclerViewListAdapter;
import com.wankys.www.gootes.R;

public class HomeActivity extends Activity{

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    public int[] images = {R.drawable.apple,
                            R.drawable.orange,
                            R.drawable.grapes};
    public String[] textname = {"Apple","Orange","Grapes"};
    public String[] textquantity = {"1kg","1kg","1kg"};
    public String[] textprice ={"Rs.150","Rs.80","Rs.95"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        final RecyclerViewListAdapter recyclerViewListAdapter = new RecyclerViewListAdapter(this,images,textname,textquantity,textprice);
        recyclerView.setAdapter(recyclerViewListAdapter);
    }
}
