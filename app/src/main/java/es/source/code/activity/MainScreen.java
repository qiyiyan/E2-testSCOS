package es.source.code.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainScreen extends AppCompatActivity {

    LinearLayout mLinearLayoutorder,mLinearLayoutcheck,mLinearLayoutlogin,mLinearLayouthelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");

        mLinearLayoutorder=(LinearLayout)findViewById(R.id.option_order);
        mLinearLayoutcheck=(LinearLayout)findViewById(R.id.option_check);
        mLinearLayoutlogin=(LinearLayout)findViewById(R.id.option_login);
        mLinearLayouthelp=(LinearLayout)findViewById(R.id.option_help);

        mLinearLayoutlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent= new Intent(MainScreen.this,LoginOrRegister.class);
                    startActivity(intent);
            }
        });

        if(data.compareTo("FromEntry")==0){
            mLinearLayoutorder.setVisibility(View.VISIBLE);
            mLinearLayoutcheck.setVisibility(View.VISIBLE);
            mLinearLayoutlogin.setVisibility(View.VISIBLE);
            mLinearLayouthelp.setVisibility(View.VISIBLE);
        }else if(data.compareTo("LoginSuccess")==0){
            mLinearLayoutorder.setVisibility(View.VISIBLE);
            mLinearLayoutcheck.setVisibility(View.VISIBLE);
        }else{
            mLinearLayoutorder.setVisibility(View.INVISIBLE);
            mLinearLayoutcheck.setVisibility(View.INVISIBLE);
            mLinearLayoutlogin.setVisibility(View.VISIBLE);
            mLinearLayouthelp.setVisibility(View.VISIBLE);
        }
    }
}
