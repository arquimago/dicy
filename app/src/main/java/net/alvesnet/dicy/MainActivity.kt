package net.alvesnet.dicy

import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var d4Angle = 90f
    var d6Angle = 90f
    var d8Angle = 90f
    var d10Angle = 90f
    var d12Angle = 90f
    var d20Angle = 90f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        results.isEnabled = false

        d4.setOnClickListener{
            results.setText(Dice(sides = 4).roll())
            d4.animate()
                .rotation(d4Angle)
                .setDuration(200).interpolator = DecelerateInterpolator()
            d4Angle  += 90f
        }

        d6.setOnClickListener{
            results.setText(Dice(sides = 6).roll())
            d6.animate()
                .rotation(d6Angle)
                .setDuration(200).interpolator = DecelerateInterpolator()
            d6Angle  += 90f
        }

        d8.setOnClickListener{
            results.setText(Dice(sides = 8).roll())
            d8.animate()
                .rotation(d8Angle)
                .setDuration(200).interpolator = DecelerateInterpolator()
            d8Angle  += 90f
        }

        d10.setOnClickListener{
            results.setText(Dice(sides = 10).roll())
            d10.animate()
                .rotation(d10Angle)
                .setDuration(200).interpolator = DecelerateInterpolator()
            d10Angle  += 90f
        }

        d12.setOnClickListener{
            results.setText(Dice(sides = 12).roll())
            d12.animate()
                .rotation(d12Angle)
                .setDuration(200).interpolator = DecelerateInterpolator()
            d12Angle  += 90f
        }

        d20.setOnClickListener{
            results.setText(Dice(sides = 20).roll())
            d20.animate()
                .rotation(d20Angle)
                .setDuration(200).interpolator = DecelerateInterpolator()
            d20Angle  += 90f
        }
    }
}
