package es.source.code.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestMain extends AppCompatActivity {

    Button mButtonTestSCOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        mButtonTestSCOS=(Button)findViewById(R.id.button_scos);
        mButtonTestSCOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data="TextMain";
                Intent intent= new Intent(TestMain.this,MainScreen.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);
            }
        });

    }
}
