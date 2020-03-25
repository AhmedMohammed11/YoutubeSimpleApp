package com.example.youtubeplaynativevideo.Ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.youtubeplaynativevideo.R;
import com.example.youtubeplaynativevideo.databinding.FragmentOmardezerBinding;


public class OmarDezerFragment extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setUpActivity();
        FragmentOmardezerBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_omardezer, container, false);
        View view = binding.getRoot();
        return view;       }

    @Override
    public void onBack() {
        super.onBack();
    }
}
