package com.wankys.www.gootes.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.wankys.www.gootes.Activities.SignUp;
import com.wankys.www.gootes.R;

public class FragmentProfile extends Fragment {


    EditText etusername,etpassword;
    Button but_signin;
    TextView tvsignup;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,null);

        etusername = view.findViewById(R.id.username);
        etpassword = view.findViewById(R.id.password);

        but_signin = view.findViewById(R.id.sign_in_button);
        but_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               FragmentHome home = new FragmentHome();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.frame_layout,home,home.getTag())
                        .commit();

            }
        });

        tvsignup = view.findViewById(R.id.sign_up_page);
        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SignUp.class);
                startActivity(intent);
            }
        });

        return view;


    }
}
