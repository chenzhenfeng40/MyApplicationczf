package com.example.administrator.myapplicationczf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PersonFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedlnstanceState) {
        View view = inflater.inflate(R.layout.fragment_person,container,false);
        return view;
    }
}
