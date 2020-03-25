package com.example.youtubeplaynativevideo.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youtubeplaynativevideo.Pojo.YoutubeVedio;

import java.util.List;
import java.util.Vector;

public class ChannelViewModel extends ViewModel {
    private MutableLiveData<List<YoutubeVedio>> vectorMutableLiveData = new MutableLiveData<>();

    public void addVideos() {
        vectorMutableLiveData.setValue(getVideos());
    }

    public LiveData<List<YoutubeVedio>> getVectorMutableLiveData() {
        return vectorMutableLiveData;
    }

    private List<YoutubeVedio> getVideos() {
        List<YoutubeVedio> youtubeVideos = new Vector<>();
        youtubeVideos.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/njPLHfivy9o\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/A7zCOOEBxhU\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/CNlj-uAiqmA\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FvNWi2nVMJo\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YoutubeVedio("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4vyzrmiJLh0\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        return youtubeVideos;
    }
}
