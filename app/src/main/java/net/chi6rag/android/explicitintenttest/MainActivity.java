package net.chi6rag.android.explicitintenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    Button button_open_activity_two;
    Button button_open_activity_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_open_activity_two = (Button) findViewById(R.id.button_open_activity_two);
        button_open_activity_two.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d("chi6rag", "Clicked Button Which Takes you to Activity Two");
                    Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                    startActivity(intent);
                }
            }
        );

        button_open_activity_three = (Button) findViewById(R.id.button_open_activity_three);
        button_open_activity_three.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Log.d("chi6rag", "Clicked Button Which Takes you to Activity Two");
                    Intent intent = new Intent(MainActivity.this, ActivityThree.class);
                    startActivity(intent);
                }
            }
        );

    }

//    public void openActivityB(View v){
//        Log.d("chi6rag", "Handle click for button_open_activity_b");
//        Intent i = new Intent(this, ActivityTwo.class);
//        startActivity(i);
//    }

}
