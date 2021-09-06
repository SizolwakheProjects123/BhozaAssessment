package co.za.mtn.bhozaassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);


        val buttonfirstButton = findViewById<Button>(R.id.firstScreenBtn);
        buttonfirstButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    FirstScreen::class.java
                )
            );
        }

        val buttonMiddleButton = findViewById<Button>(R.id.middleScreenBtn);
        buttonMiddleButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SecondScreen::class.java
                )
            );
        }


    val buttonlastButton = findViewById<Button>(R.id.lastScreenBtn);
        buttonlastButton.setOnClickListener {
        startActivity(
            Intent(
                this,
                MainActivity2::class.java
            )
        );
    }
        }



}