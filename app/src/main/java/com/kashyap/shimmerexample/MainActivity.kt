package com.kashyap.shimmerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {

    private lateinit var mShimmerFrameLayout: ShimmerFrameLayout

    private val MAX_DELAY = 1000 * 10L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init shimmerFrameLayout
        mShimmerFrameLayout = findViewById(R.id.shimmer_frame_layout)

        //to start the animation; we are using
        mShimmerFrameLayout.startShimmer()


        //To stop the animation we are using a handler with a delay of 10 seconds;

        Handler(Looper.getMainLooper()).postDelayed({ stopAnimation() }, MAX_DELAY)
        //lets run this

    }

    private fun stopAnimation() {
        mShimmerFrameLayout.stopShimmer()
    }
}

