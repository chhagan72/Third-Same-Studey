package com.example.frag_static;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_first#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_first extends Fragment {



    public fragment_first() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView tv = (TextView) view.findViewById(R.id.frag1);
        return view;
    }
}