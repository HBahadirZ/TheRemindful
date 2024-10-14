package com.example.theremindful.tasks;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.remindful.R;

public class TasksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment (e.g., fragment_tasks.xml)
        return inflater.inflate(R.layout.fragment_tasks, container, false);
    }
}