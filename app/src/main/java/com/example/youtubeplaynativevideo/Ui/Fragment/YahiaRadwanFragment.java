package com.example.youtubeplaynativevideo.Ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.youtubeplaynativevideo.R;
import com.example.youtubeplaynativevideo.databinding.FragmentYahiaRadwanBinding;


public class YahiaRadwanFragment extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setUpActivity();
        FragmentYahiaRadwanBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_yahia_radwan, container, false);
        View view = binding.getRoot();
        return view;       }

    @Override
    public void onBack() {
        super.onBack();
    }
}
