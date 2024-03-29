package net.alvesnet.dicy

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.mikhaellopez.rxanimation.RxAnimation
import com.mikhaellopez.rxanimation.press
import com.mikhaellopez.rxanimation.rotation
import com.mikhaellopez.rxanimation.text
import net.alvesnet.dicy.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding
    companion object{
        const val ANIMATION_DURATION = 400L
    }
    private var d4Angle = 360f
    private var d6Angle = 360f
    private var d8Angle = 360f
    private var d10Angle = 360f
    private var d12Angle = 360f
    private var d20Angle = 360f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            results.isEnabled = false

            d4.setOnClickListener {
                roll(4, it)
            }

            d6.setOnClickListener {
                roll(6, it)
            }

            d8.setOnClickListener {
                roll(8,  it)
            }

            d10.setOnClickListener {
                roll(10,  it)
            }

            d12.setOnClickListener {
                roll(12,  it)
            }

            d20.setOnClickListener {
                roll(20,  it)
            }
        }
    }

    private fun roll(sides: Int, view: View){
        with(binding){
            d4.isClickable = false
            d6.isClickable = false
            d8.isClickable = false
            d10.isClickable = false
            d12.isClickable = false
            d20.isClickable = false

            val angle = when(sides){
                4 -> d4Angle
                6 -> d6Angle
                8 -> d8Angle
                10 -> d10Angle
                12 -> d12Angle
                else -> d20Angle
            }

            RxAnimation.together(
                view.press(duration = ANIMATION_DURATION),
                results.text(Dice(sides = sides).roll(),200L),
                view.rotation(angle, ANIMATION_DURATION)
            ).subscribe()

            when(sides){
                4 -> d4Angle += 360f
                6 -> d6Angle += 360f
                8 -> d8Angle += 360f
                10 -> d10Angle += 360f
                12 -> d12Angle += 360f
                else -> d20Angle += 360f
            }

            Handler(Looper.getMainLooper()).postDelayed({
                d4.isClickable = true
                d6.isClickable = true
                d8.isClickable = true
                d10.isClickable = true
                d12.isClickable = true
                d20.isClickable = true
            }, ANIMATION_DURATION)
        }
    }
}
