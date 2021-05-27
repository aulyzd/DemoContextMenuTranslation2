package sg.edu.rp.c346.id20014198.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText1=findViewById(R.id.textViewTranslatedText1);
        registerForContextMenu(tvTranslatedText1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText1.setText("Hello ");
            return true;
        } else if (id == R.id.italianSelection) {
            tvTranslatedText1.setText("Ciao");
            return true;
        } else {
            tvTranslatedText1.setText("Error translation");
        }

        return super.onContextItemSelected(item);
    }

}