package sbgames.lucassoares.com.sbgames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class modoNormalActivity extends AppCompatActivity
{
    private NumberPicker np;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_normal);

        np = (NumberPicker)findViewById(R.id.numberPicker);

        np.setMinValue(1);
        np.setMaxValue(12);
        np.setWrapSelectorWheel(false);
        np.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
    }
}
