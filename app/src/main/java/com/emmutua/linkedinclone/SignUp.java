package com.emmutua.linkedinclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    private EditText skillEditText;
    private TextView loginUpButton;
    private Button addSkillButton;
    private ListView skillListView;
    private ArrayAdapter<String> skillsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        skillEditText = findViewById(R.id.skillEditText);
        addSkillButton = findViewById(R.id.addSkillButton);
        skillListView = findViewById(R.id.skillListView);

        loginUpButton = findViewById(R.id.go_to_login);

        skillsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        skillListView.setAdapter(skillsAdapter);
        addSkillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSkill();
            }
        });
        loginUpButton.setOnClickListener(onClick -> {
            startActivity(new Intent(SignUp.this, Login.class));
        });

    }

    private void addSkill() {
        String skill = skillEditText.getText().toString().trim();

        if (!skill.isEmpty()) {
            // Add the skill to the adapter
            skillsAdapter.add(skill);
            // Clear the input field
            skillEditText.setText(skill);
        }
    }
}