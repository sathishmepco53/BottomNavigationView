package codificador.bottomnavigationview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FilterFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.filter_fragment,container,false);
        final EditText editText = view.findViewById(R.id.editText);
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("From Fragment");
                String value = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name",value);
                getActivity().setResult(Activity.RESULT_OK,intent);
                getActivity().finish();
            }
        });
        return view;
    }
}