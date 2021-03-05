package android.example.bitsandpizza;

import android.content.Context;
import android.content.Intent;
import android.example.bitsandpizza.data.BaseEntity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class BaseEntityAdapter extends RecyclerView.Adapter<BaseEntityAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        private ImageView entityImage;
        private TextView entityName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            if (itemView instanceof CardView) {
                cardView = (CardView) itemView;

                entityImage = cardView.findViewById(R.id.entityImage);
                entityName = cardView.findViewById(R.id.entityName);
            }
        }
    }

    interface Listener {
        void onClick(BaseEntity entity);
    }

    private BaseEntity[] entities;
    private Listener listener;

    public BaseEntityAdapter(BaseEntity[] entities, Listener listener) {
        this.entities = entities;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView entityCardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.base_entity_card, parent, false);

        return new ViewHolder(entityCardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Context cardContext = holder.cardView.getContext();

        BaseEntity entity = entities[position];
        holder.entityImage
                .setImageDrawable(ContextCompat
                        .getDrawable(cardContext, entity.getImageResourceId()));

        holder.entityName.setText(entity.getName());

        holder.cardView.setOnClickListener(v -> {
            listener.onClick(entity);
        });
    }

    @Override
    public int getItemCount() {
        return entities.length;
    }
}
