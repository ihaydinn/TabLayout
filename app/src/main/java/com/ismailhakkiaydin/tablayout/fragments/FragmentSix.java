package com.ismailhakkiaydin.tablayout.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ismailhakkiaydin.tablayout.R;

public class FragmentSix extends Fragment {

    public FragmentSix() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_six, container, false);
    }
}