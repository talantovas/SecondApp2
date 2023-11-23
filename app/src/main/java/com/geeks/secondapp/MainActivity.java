package com.geeks.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView cardView = findViewById(R.id.card_view);
        cardView.setBackgroundResource(R.drawable.bg_card_view);

        Button buttonOne = findViewById(R.id.button_one);

        buttonOne.setOnClickListener(view -> {

            if (cardView.getAlpha() == 1) {
                cardView.animate().alpha(0);
            } else {
                cardView.animate().alpha(1);
            }

        });

        Button bigButton = findViewById(R.id.big_button);
        LinearLayout container = findViewById(R.id.container);


        bigButton.setOnClickListener(view -> {
            if (container.getVisibility() == View.VISIBLE) {
                container.setVisibility(View.GONE);
            } else {
                container.setVisibility(View.VISIBLE);
            }
        });

        Button btnCircle = findViewById(R.id.btn_circle);
        EditText editText = findViewById(R.id.edit_text);
        btnCircle.setOnClickListener(view -> {
            Snackbar.make(findViewById(R.id.constraint), editText.getText().toString(),
                    Snackbar.LENGTH_LONG).setAction("Закрыть", view1 -> {
                Toast.makeText(MainActivity.this, "Закрыто", Toast.LENGTH_SHORT).show();
            }).show();
//            Toast.makeText(MainActivity.this, "Закрыто", Toast.LENGTH_SHORT).show();
        });

    }
}