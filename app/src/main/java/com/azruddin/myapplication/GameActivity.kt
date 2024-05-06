import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.TextViewCompat
import com.azruddin.myapplication.R

class GameActivity : AppCompatActivity() {
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button

    private lateinit var hungerTextView: TextViewCompat
    private lateinit var happinessTextView: TextViewCompat
    private lateinit var cleanlinessTextView: TextViewCompat

    private lateinit var petImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)

        feedButton.setOnClickListener {
            // Perform feed action
            // Update status values
            // Log action
        }

        cleanButton.setOnClickListener {
            // Perform clean action
            // Update status values
            // Log action
        }

        playButton.setOnClickListener {
            // Perform play action
            // Update status values
            // Log action
        }
    }

    private fun updatePetImage(imageResource: Int) {
        val petImageView = findViewById<ImageView>(R.id.petImageView)
        petImageView.setImageResource(imageResource)
    }
}
