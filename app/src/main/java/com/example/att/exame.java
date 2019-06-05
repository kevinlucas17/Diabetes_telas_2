package com.example.att;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class exame extends AppCompatActivity {

    private String exame,observacoes;
    private Date data;

    EditText input_exame;
    EditText input_observacoes;
    EditText input_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exame);
        setContentView(R.layout.activity_hisotico);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Exame");

        input_exame = (EditText)findViewById(R.id.input_exame);
        input_observacoes =(EditText)findViewById(R.id.input_observacao);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
}

