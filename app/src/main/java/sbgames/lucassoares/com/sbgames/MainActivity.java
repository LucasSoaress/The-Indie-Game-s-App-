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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoRegras = (ImageView) findViewById(R.id.RegrasId);
        profissoes = (ImageView) findViewById(R.id.profissoesId);



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
    }
}
