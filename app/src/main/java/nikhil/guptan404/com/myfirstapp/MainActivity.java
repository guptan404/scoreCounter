package nikhil.guptan404.com.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView a, b;
    ImageButton m, p, m1, p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        m1 = findViewById(R.id.m1);
        m = findViewById(R.id.m);
        p1 = findViewById(R.id.p1);
        p = findViewById(R.id.p);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tb=Integer.parseInt(b.getText().toString());
                if(tb<=0)
                {

                }
                else {
                    b.setText(Integer.toString(--tb));
                }
            }
        });
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tb=Integer.parseInt(b.getText().toString());
                b.setText(Integer.toString(++tb));

            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ta=Integer.parseInt(a.getText().toString());
                if(ta<=0)
                {

                }
                else {
                    a.setText(Integer.toString(--ta));
                }
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ta=Integer.parseInt(a.getText().toString());
                a.setText(Integer.toString(++ta));
            }
        });
    }

    public void reset(View view) {
        a.setText("0");
        b.setText("0");
    }
}


