package com.pd.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        RatingBar ratingBar = (RatingBar) findViewById( R.id.rb );
        ratingBar.setRating( 2 );
        ratingBar.setStepSize( (float) 0.5 );
        ratingBar.setOnRatingBarChangeListener( new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                TextView textView = (TextView) findViewById( R.id.tv );
                textView.setText( String.valueOf( v ) );

                if (v == 2) {
                    textView.setText( String.valueOf( v ) );
                    Log.i( "info", textView.getText().toString() );
                    Toast.makeText( MainActivity.this, "Review: very poor", Toast.LENGTH_SHORT ).show();
                }
                if (v == 5) {
                    textView.setText( String.valueOf( v ) );
                    Log.i( "info", textView.getText().toString() );
                    Toast.makeText( MainActivity.this, "Review: Excellent", Toast.LENGTH_SHORT ).show();
                }

            }
        } );
    }
}

