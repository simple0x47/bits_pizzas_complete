package android.example.bitsandpizza;

import android.content.Context;
import android.content.Intent;
import android.example.bitsandpizza.data.BaseEntity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EntityFragment extends Fragment {
    private final BaseEntity[] entities;

    public EntityFragment(BaseEntity[] entities) {
        this.entities = entities;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView entitiesRecycler = (RecyclerView) inflater
                .inflate(R.layout.fragment_entity, container, false);

        BaseEntityAdapter adapter = new BaseEntityAdapter(entities, entity -> {
            Intent intent = new Intent(getActivity(), EntityDetailActivity.class);
            intent.putExtra(EntityDetailActivity.EXTRA_ENTITY_ID, entity);

            getActivity().startActivity(intent);
        });

        entitiesRecycler.setAdapter(adapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        entitiesRecycler.setLayoutManager(layoutManager);
        return entitiesRecycler;
    }
}
