package sbgames.lucassoares.com.sbgames;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class modosAcitivity extends AppCompatActivity
{
    private ImageView modoNormal;
    private ImageView modoDinamico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modos_activity);

        modoNormal = (ImageView)findViewById(R.id.modoNormalId);
        modoDinamico = (ImageView)findViewById(R.id.modoDinamicoId);

        modoNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(modosAcitivity.this, modoNormalActivity.class);
                startActivity(intent);
            }
        });

        modoDinamico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(modosAcitivity.this, modoDinamicoActivity.class);
                startActivity(intent);
            }
        });
    }
}
