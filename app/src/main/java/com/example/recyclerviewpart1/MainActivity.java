package com.example.recyclerviewpart1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contractsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contractsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Sarah Jack","sj@gmail.com","https://upload.wikimedia.org/wikipedia/commons/b/b6/Image_created_with_a_mobile_phone.png"));
        contacts.add(new Contact("Mike Jack","mj@gmail.com","https://cdn.pixabay.com/photo/2015/02/24/15/41/dog-647528_960_720.jpg"));
        contacts.add(new Contact("Naruto Smith","ns@gmail.com","https://www.hindustantimes.com/rf/image_size_444x250/HT/p2/2020/05/21/Pictures/_037138a2-9b47-11ea-a010-c71373fc244b.jpg"));
        contacts.add(new Contact("Briggit Nulls","bn@gmail.com","https://www.w3schools.com/w3css/img_lights.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contractsRecView.setAdapter(adapter);
        contractsRecView.setLayoutManager(new GridLayoutManager(this,2));


    }
}