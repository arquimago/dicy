package net.alvesnet.dicy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        results.isEnabled = false

        d4.setOnClickListener{
            results.setText(Dice(sides = 4).roll())
        }

        d6.setOnClickListener{
            results.setText(Dice(sides = 6).roll())
        }

        d8.setOnClickListener{
            results.setText(Dice(sides = 8).roll())
        }

        d10.setOnClickListener{
            results.setText(Dice(sides = 10).roll())
        }

        d12.setOnClickListener{
            results.setText(Dice(sides = 12).roll())
        }

        d20.setOnClickListener{
            results.setText(Dice(sides = 20).roll())
        }
    }
}
