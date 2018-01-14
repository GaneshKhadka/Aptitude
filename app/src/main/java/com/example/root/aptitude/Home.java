package com.example.root.aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener{
    private CardView quantativeCard,logicalCard,verbalCard,progCard,currentCard,notificationCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home );

        quantativeCard = (CardView)findViewById ( R.id.id_quantative );
        logicalCard = (CardView)findViewById ( R.id.id_reasoning );
        verbalCard = (CardView) findViewById ( R.id.id_verbal );
        progCard = (CardView) findViewById ( R.id.id_programming );
        currentCard = (CardView) findViewById ( R.id.id_currentAffairs );
        notificationCard = (CardView) findViewById ( R.id.id_notification );

        quantativeCard.setOnClickListener ( this );
        logicalCard.setOnClickListener ( this );
        verbalCard.setOnClickListener ( this );
        progCard.setOnClickListener ( this );
        currentCard.setOnClickListener ( this );
        notificationCard.setOnClickListener ( this );
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId ()){
            case R.id.id_quantative: i =  new Intent (this,Quantative.class);startActivity ( i );break;
            case R.id.id_reasoning: i =  new Intent (this,Logical.class);startActivity ( i );break;
            case R.id.id_verbal: i =  new Intent (this,Verbal.class);startActivity ( i );break;
            case R.id.id_programming: i =  new Intent (this,Programming.class);startActivity ( i );break;
            case R.id.id_currentAffairs: i =  new Intent (this,CurrentAffairs.class);startActivity ( i );break;
            case R.id.id_notification: i =  new Intent (this,Logical.class);startActivity ( i );break;
            default:break;
        }

    }
}
