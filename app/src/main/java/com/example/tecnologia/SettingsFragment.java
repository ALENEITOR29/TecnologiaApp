package com.example.tecnologia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import de.hdodenhof.circleimageview.CircleImageView;
import com.squareup.picasso.Picasso;

public class SettingsFragment extends Fragment {

    private static final String ARG_USERNAME = "username";

    public static SettingsFragment newInstance(String username) {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_USERNAME, username);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        String username = "Alejandro";
        if (getArguments() != null) {
            String received = getArguments().getString(ARG_USERNAME);
            if (received != null && !received.trim().isEmpty()) {
                username = received;
            }
        }

        TextView usernameView = view.findViewById(R.id.loggedUsername);
        Button logoutButton = view.findViewById(R.id.logoutButton);
        CircleImageView avatar = view.findViewById(R.id.profileAvatar);

        usernameView.setText(username);
        Picasso.with(requireContext())
                .load("https://images.unsplash.com/photo-1518770660439-4636190af475?w=500")
                .fit()
                .centerCrop()
                .placeholder(R.drawable.image_placeholder)
                .error(R.drawable.image_placeholder)
                .into(avatar);

        logoutButton.setOnClickListener(v -> {
            if (getActivity() instanceof MainActivity) {
                ((MainActivity) getActivity()).logout();
            }
        });

        return view;
    }
}
