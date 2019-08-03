package com.rk.spin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class A1 extends AppCompatActivity {
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
            sp=findViewById(R.id.sp_id);
        ArrayList<String> data=new ArrayList<>();

        for(int i=1;i<=10;i++){
            data.add("item"+i);
        }
        ArrayAdapter adapter=new ArrayAdapter<String>(
            this, android.R.layout.simple_spinner_item,data);
        sp.setAdapter(adapter);
        sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(A1.this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
