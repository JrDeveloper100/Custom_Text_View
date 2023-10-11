package com.example.customtextview

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat

class CustomTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    fun RUBIK(){
        val typeface = ResourcesCompat.getFont(context, R.font.rubik01)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun RUBIK_MEDIUM(){
        val typeface = ResourcesCompat.getFont(context, R.font.rubik_medium)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun RUBIK_REGULAR(){
        val typeface = ResourcesCompat.getFont(context, R.font.rubik_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun RUFINA(){
        val typeface = ResourcesCompat.getFont(context, R.font.rufina_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun CAMBRIA(){
        val typeface = ResourcesCompat.getFont(context, R.font.cambria)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun LATO(){
        val typeface = ResourcesCompat.getFont(context, R.font.lato_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun LATO_BOLD(){
        val typeface = ResourcesCompat.getFont(context, R.font.lato_bold)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun LEXEND(){
        val typeface = ResourcesCompat.getFont(context, R.font.lexend_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun ROCHESTER(){
        val typeface = ResourcesCompat.getFont(context, R.font.rochester_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun GEORGIA(){
        val typeface = ResourcesCompat.getFont(context, R.font.georgia_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun ACLONICA(){
        val typeface = ResourcesCompat.getFont(context, R.font.aclonica_regular)
        setTypeface(typeface,Typeface.NORMAL)
    }

    fun applyShadow(){
        // Set shadow
        val shadowColor = Color.RED.toFloat() // Shadow color (red in this example)
        val shadowDx = 20f // Horizontal shadow offset
        val shadowDy = 20f // Vertical shadow offset
        val shadowRadius = 40 // Shadow radius (blur effect)
        setShadowLayer(shadowColor,shadowDx,shadowDy,shadowRadius)
    }
}