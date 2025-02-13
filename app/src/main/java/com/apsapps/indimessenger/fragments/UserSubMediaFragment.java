package com.apsapps.indimessenger.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apsapps.indimessenger.R;
import com.apsapps.indimessenger.adapters.MediaSummaryAdapter;
import com.apsapps.indimessenger.models.Message;
import com.apsapps.indimessenger.utils.Helper;

import java.util.ArrayList;

/**
 * Created by a_man on 6/30/2017.
 */

public class UserSubMediaFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private int position;
    private ArrayList<Message> messages;

    private RecyclerView recyclerView;

    public UserSubMediaFragment() {
        // Required empty public constructor
    }

    public static UserSubMediaFragment newInstance(int position) {
        UserSubMediaFragment fragment = new UserSubMediaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_sub_media, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(new MediaSummaryAdapter(getContext(), messages, true, new Helper(getContext()).getLoggedInUser().getId()));
    }

    public void setAttachment(ArrayList<Message> attachments) {
        this.messages = attachments;
    }
}
