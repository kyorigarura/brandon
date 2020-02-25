package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button play;
    Button list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.btnPlay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,act3.class);
                startActivity(intent);
            }
        });
list=findViewById(R.id.button2);
list.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this, com.example.myapplication.list.class);
        startActivity(intent);
    }
});


    }

    public  void sendMessage(View view){
        EditText message=findViewById(R.id.editText);

        Intent intent=new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("MESSAGE",message.getText().toString());
        startActivity(intent);
        message.setText("");

    }
    public boolean onCreateOptionsMenu(Menu menuu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.huhuu, menuu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.music:
                startActivity(new Intent(this, act1.class));
                return true;
            case R.id.yes:
                startActivity(new Intent(this, act2.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}
