package com.flickr.photogallery

import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.flickr.photogallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding

//    private val blueSkyColor: Int by lazy { ContextCompat.getColor(this, R.color.blue_sky) }
//    private val sunsetSkyColor: Int by lazy { ContextCompat.getColor(this, R.color.sunset_sky) }
//    private val nightSkyColor: Int by lazy { ContextCompat.getColor(this, R.color.night_sky) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.scene.setOnClickListener {
//            startAnimation()
//        }
    }

//    private fun startAnimation() {
//        val sunYStart = binding.sun.top.toFloat()
//        val sunYEnd = binding.sky.height.toFloat()
//
//        val heightAnimator = ObjectAnimator.ofFloat(binding.sun, "y", sunYStart, sunYEnd).setDuration(5000)
//        heightAnimator.interpolator = AccelerateInterpolator()
//
//        val sunsetSkyAnimator = ObjectAnimator.ofInt(binding.sky, "backgroundColor", blueSkyColor, sunsetSkyColor).setDuration(5000)
//        sunsetSkyAnimator.setEvaluator(ArgbEvaluator())
//
//        val nightSkyAnimator = ObjectAnimator
//            .ofInt(binding.sky, "backgroundColor", sunsetSkyColor, nightSkyColor)
//            .setDuration(1500)
//        nightSkyAnimator.setEvaluator(ArgbEvaluator())
//
//        val animatorSet = AnimatorSet()
//        animatorSet.play(heightAnimator).with(sunsetSkyAnimator).before(nightSkyAnimator)
//        animatorSet.start()
//    }

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
}