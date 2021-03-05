package android.example.bitsandpizza;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.example.bitsandpizza.data.BaseEntity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EntityDetailActivity extends AppCompatActivity {
    public static final String EXTRA_ENTITY_ID = "entityId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        BaseEntity entity = getIntent().getExtras().getParcelable(EXTRA_ENTITY_ID);

        TextView entityDetailName = findViewById(R.id.entityDetailName);
        entityDetailName.setText(entity.getName());

        ImageView entityDetailImage = findViewById(R.id.entityDetailImage);
        entityDetailImage.setImageDrawable(ContextCompat
                .getDrawable(this, entity.getImageResourceId()));

        TextView entityDetailDescription = findViewById(R.id.entityDetailDescription);
        entityDetailDescription.setText(entity.getDescription());
    }
}