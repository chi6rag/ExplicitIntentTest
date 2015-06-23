package net.chi6rag.android.explicitintenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends ActionBarActivity {

    Button button_go_back_to_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button_go_back_to_main = (Button) findViewById(R.id.button_go_back_to_main);
        button_go_back_to_main.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("chi6rag", "Clicked on button_go_back_to_main inside ActivityTwo");
                        Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

}
