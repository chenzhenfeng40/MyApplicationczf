package com.example.administrator.myapplicationczf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedlnstanceState) {
       View view = inflater.inflate(R.layout.fragment_home,container,false);
        return view;
    }
}
