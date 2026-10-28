package com.example.tecnologia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        setCard(view, R.id.cardAi,
                "https://images.unsplash.com/photo-1677442136019-21780ecad995?w=900",
                "Inteligencia artificial",
                "Tecnología que aprende, analiza datos y ayuda a resolver problemas.");
        setCard(view, R.id.cardRobotics,
                "https://images.unsplash.com/photo-1485827404703-89b55fcc595e?w=900",
                "Robótica",
                "Máquinas inteligentes que combinan programación, sensores y movimiento.");
        setCard(view, R.id.cardComputer,
                "https://images.unsplash.com/photo-1498050108023-c5249f4df085?w=900",
                "Desarrollo de software",
                "Ideas convertidas en aplicaciones, páginas web y soluciones digitales.");
        setCard(view, R.id.cardCircuit,
                "https://images.unsplash.com/photo-1518770660439-4636190af475?w=900",
                "Hardware y circuitos",
                "Los componentes electrónicos son la base de los dispositivos modernos.");

        return view;
    }

    private void setCard(View root, int cardId, String imageUrl, String title, String description) {
        View card = root.findViewById(cardId);
        ImageView image = card.findViewById(R.id.cardImage);
        TextView titleView = card.findViewById(R.id.cardTitle);
        TextView descriptionView = card.findViewById(R.id.cardDescription);

        titleView.setText(title);
        descriptionView.setText(description);

        Picasso.with(requireContext())
                .load(imageUrl)
                .fit()
                .centerCrop()
                .placeholder(R.drawable.image_placeholder)
                .error(R.drawable.image_placeholder)
                .into(image);
    }
}
