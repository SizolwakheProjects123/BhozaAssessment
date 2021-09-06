package co.za.mtn.bhozaassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)
        val buttonMiddleButton = findViewById<Button>(R.id.itsgo_time_id);
        buttonMiddleButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            );
        }
    }
}