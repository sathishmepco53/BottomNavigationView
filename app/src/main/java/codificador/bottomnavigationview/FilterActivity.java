package codificador.bottomnavigationview;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FilterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        Fragment fragment = new FilterFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content,fragment).commit();
    }
}
