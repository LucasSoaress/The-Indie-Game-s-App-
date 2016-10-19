package sbgames.lucassoares.com.sbgames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfissoesActivity extends AppCompatActivity
{
    private ImageView programador;
    private ImageView design;
    private ImageView artista;
    private ImageView roteirista;
    private ImageView produtor;
    private ImageView freelancer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profissoes);

        programador = (ImageView) findViewById(R.id.programadorId);
        design = (ImageView) findViewById(R.id.designId);
        artista = (ImageView) findViewById(R.id.artistaId);
        roteirista = (ImageView) findViewById(R.id.roteiristaId);
        produtor = (ImageView) findViewById(R.id.produtorId);
        freelancer = (ImageView) findViewById(R.id.freelancerId);


        programador.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ProfissoesActivity.this,ProgramadorActivity.class);
                startActivity(intent);
            }
        });

        artista.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ProfissoesActivity.this,ArtistaActivity.class);
                startActivity(intent);
            }
        });

        design.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ProfissoesActivity.this,DesignActivity.class);
                startActivity(intent);
            }
        });

        roteirista.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ProfissoesActivity.this,RoteiristaActivity.class);
                startActivity(intent);
            }
        });

        produtor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ProfissoesActivity.this,ProdutorActivity.class);
                startActivity(intent);
            }
        });

        freelancer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(ProfissoesActivity.this,FreelancerActivity.class);
                startActivity(intent);
            }
        });
    }
}
