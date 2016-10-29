package sbgames.lucassoares.com.sbgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private ImageView botaoRegras;
    private ImageView botaoSobre;
    private ImageView profissoes;
    private ImageView modos;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoRegras = (ImageView) findViewById(R.id.RegrasId);
        botaoSobre = (ImageView) findViewById(R.id.modoNormalId);
        profissoes = (ImageView) findViewById(R.id.profissoesId);
        modos = (ImageView)findViewById(R.id.btnModosId);



        botaoRegras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,RegrasActivity.class);
                startActivity(intent);
            }


        });

        botaoSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,SobreActivity.class);
                startActivity(intent);
            }
        });

        profissoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,ProfissoesActivity.class);
                startActivity(intent);
            }
        });

        modos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this,modosAcitivity.class);
                startActivity(intent);
            }
        });
    }
}
