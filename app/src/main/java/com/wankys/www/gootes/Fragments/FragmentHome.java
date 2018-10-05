package com.wankys.www.gootes.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import com.wankys.www.gootes.Adapters.RecyclerViewAdapter;
import com.wankys.www.gootes.R;

public class FragmentHome extends Fragment{

    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    public int[] category_images = {R.drawable.categ_fruit,
                                    R.drawable.categ_vegetable,
                                    R.drawable.categ_beverage,
                                    R.drawable.categ_grains,
                                    R.drawable.categ_beauty,
                                    R.drawable.categ_cleaning};

    public int[] category_names = {R.string.fruits,
                                      R.string.vegetables,
                                      R.string.beverages,
                                      R.string.grains,
                                      R.string.beauty,
                                      R.string.cleaning};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);

        viewFlipper = (ViewFlipper) view.findViewById(R.id.view_flipper);
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(2000);


        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        gridLayoutManager = new GridLayoutManager(getActivity(),3);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getActivity(),category_images,category_names);
        recyclerView.setAdapter(recyclerViewAdapter);


        return view;


    }
}
