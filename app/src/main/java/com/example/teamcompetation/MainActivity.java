package com.example.teamcompetation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView scoreA,scoreB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA=findViewById(R.id.scoreA);

        scoreB=findViewById(R.id.scoreB);
    }

    @Override
    public void onClick(View v) {
        int scorea=Integer.valueOf(scoreA.getText().toString());

        if(v.getId()== R.id.A_add1){
            scoreA.setText(String.valueOf(scorea+1));
        }
        if(v.getId()==R.id.A_add2){
            scoreA.setText(String.valueOf(scorea+2));
        }
        if(v.getId()==R.id.A_add3){
            scoreA.setText(String.valueOf(scorea+3));
        }
        if(v.getId()==R.id.reset){
            scoreA.setText("0");
        }

        int scoreb=Integer.valueOf(scoreB.getText().toString());

        if(v.getId()== R.id.B_add1){
            scoreB.setText(String.valueOf(scoreb+1));
        }
        if(v.getId()==R.id.B_add2){
            scoreB.setText(String.valueOf(scoreb+2));
        }
        if(v.getId()==R.id.B_add3){
            scoreB.setText(String.valueOf(scoreb+3));
        }
        if(v.getId()==R.id.reset){
            scoreB.setText("0");
        }




//        switch (v.getId()){
//            R.id.A_add1 :
//                scoreA.setText(Integer.valueOf(scoreA.getText().toString())+1);
//                break;
//            R.id.A_add2:
//                scoreA.setText(Integer.valueOf(scoreA.getText().toString())+2);
//                break;
//            R.id.A_add3:
//                scoreA.setText(Integer.valueOf(scoreA.getText().toString())+3);
//                break;
//            R.id.reset:
//                scoreA.setText(0);
//                break;
//            default:
//                break;
//
//        }


    }
}