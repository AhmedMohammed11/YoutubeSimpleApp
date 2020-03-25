package com.example.youtubeplaynativevideo.Ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.youtubeplaynativevideo.Helper.HelperMethod;
import com.example.youtubeplaynativevideo.R;
import com.example.youtubeplaynativevideo.databinding.FragmentHomeBinding;


public class HomeFragment extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setUpActivity();
        FragmentHomeBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();

        binding.homeActivityAboZaidImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HelperMethod.ReplaceFragment(getActivity().getSupportFragmentManager(),new AboZaidFragment()
                        ,R.id.activity_main_fragmentcontainer_container,null,null);
            }
        });
        return view;
//        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onBack() {
        super.onBack();
    }
}
