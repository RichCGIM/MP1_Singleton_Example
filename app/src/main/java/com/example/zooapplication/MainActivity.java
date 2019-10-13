package com.example.zooapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etType, etName, etSex, etAge;
    Button btAdd;
    RecyclerView rvAnimals;
    private AnimalAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.rvAnimals);
        layoutManager = new LinearLayoutManager(this);
        rvAnimals.setLayoutManager(layoutManager);

        mAdapter = new AnimalAdapter(getApplicationContext());
        rvAnimals.setAdapter(mAdapter);

        final AnimalRepository repository = AnimalRepository.getInstance();

        etType = findViewById(R.id.etType);
        etName = findViewById(R.id.etName);
        etSex = findViewById(R.id.etSex);
        etAge = findViewById(R.id.etAge);
        btAdd = findViewById(R.id.btAdd);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get field values
                String type = etType.getText().toString();
                String name = etName.getText().toString();
                String sex = etSex.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());

                // create animal
                Animal animal = new Animal();
                animal.type = type;
                animal.name = name;
                animal.sex = sex;
                animal.age = age;

                // add animal to repo
                repository.getAnimals().add(animal);

                mAdapter.update();

                // clear the fields
                etAge.getText().clear();
                etType.getText().clear();
                etName.getText().clear();
                etSex.getText().clear();
            }
        });
    }
}
