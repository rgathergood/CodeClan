package com.example.rgathergood.sqlapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String text = ";";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);


        DatabaseHelper db = new DatabaseHelper(this);

        //inserting contacts
        db.addContact(new Contact("name1", "11111111"));
        db.addContact(new Contact("name2", "22222222"));
        db.addContact(new Contact("name3", "33333333"));
        db.addContact(new Contact("name4", "44444444"));

        //reading and displaying all contacts
        List<Contact> contacts = db.getAllContacts();

        for(Contact c : contacts) {
            String log = "ID: " + c.getId() + ", NAME: " + c.getName() + ", NUMBER: " + c.getPhone_number() + "\n";
            text = text + log;
        }

        textView.setText(text);
    }
}
