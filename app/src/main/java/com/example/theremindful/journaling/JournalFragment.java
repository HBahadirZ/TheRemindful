package com.example.theremindful.journaling;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.remindful.R;

public class JournalFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment (e.g., fragment_journal.xml)
        return inflater.inflate(R.layout.fragment_journal, container, false);
    }