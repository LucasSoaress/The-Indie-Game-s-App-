package sbgames.lucassoares.com.sbgames;

import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class modoDinamicoActivity extends AppCompatActivity
{
    private Handler handler;
    private Runnable runnable;
    private TextView jogo;
    private TextView titulo;
    private final String[] JOGOS = {"RPG","FPS","PLATAFORMA","PUZZLE","ARENA"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_dinamico);

        jogo = (TextView)findViewById(R.id.jogoId);

        handler = new Handler();
        runnable = new Runnable()
            //Fazendo delay para instanciar modo de jogo a cada 2 minutos
        {
            @Override
            public void run()
            {
                Random rand = new Random();
                int n = rand.nextInt(5);
                jogo.setText(JOGOS[n]);
                Log.i("TESTE",JOGOS[n]);
                handler.postDelayed(runnable,120000);
            }
        };
        handler.post(runnable);

        //Setando fonte para letras
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/prstartk.ttf");
        titulo = (TextView)findViewById(R.id.tituloId);
        titulo.setTypeface(custom_font);

        jogo.setTypeface(custom_font);
    }


    @Override
    protected void onStop()
    {
        handler.removeCallbacks(runnable);
        super.onStop();
    }
}
