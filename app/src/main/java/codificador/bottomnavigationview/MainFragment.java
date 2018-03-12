package codificador.bottomnavigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Seng on 7/4/2017.
 */

public class MainFragment extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment,container,false);
        textView = view.findViewById(R.id.textViewOutput);
        return view;
    }

    public void setValue(String value){
        textView.setText("Filter value is : "+value);
    }
}
