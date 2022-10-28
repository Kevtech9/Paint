package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.PaintView.Companion.colorList
import com.PaintView.Companion.currentBrush
import com.PaintView.Companion.pathList
import kotlin.io.path.Path

class MainActivity : AppCompatActivity() {

    companion object{
        var path = android.graphics.Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var redBtn =findViewById<ImageButton>(R.id.redColor)
        var blueBtn =findViewById<ImageButton>(R.id.blueColor)
        var blacktn =findViewById<ImageButton>(R.id.blackColor)
        var greenBtn = findViewById<ImageButton>(R.id.greenColor)
        var eraser =findViewById<ImageButton>(R.id.whiteColor)


        redBtn.setOnClickListener {
            Toast.makeText(this,"Red", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColour(paintBrush.color)

        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Blue", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColour(paintBrush.color)

        }
        blacktn.setOnClickListener {
            Toast.makeText(this,"Black", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColour(paintBrush.color)
        }
        greenBtn.setOnClickListener {
            Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.GREEN
            currentColour(paintBrush.color)
        }

        eraser.setOnClickListener {
            Toast.makeText(this,"ERASE ALL", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()

        }
    }
    private fun  currentColour(color:Int){
        currentBrush = color
        path = android.graphics.Path()
    }
}