package com.example.foodlog.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF2096F3)
val Teal200 = Color(0xFF03DAC5)


val Beige = Color(0xFFF2F5DE)
val TeaGreen = Color(0xFFD0FFB7)
val MintGreen = Color(0xFFB2FFA8)

val appGradientStart = Color(0xFF2096F3)
val appGradientStartDull = Color(0xFFA1D1F7)

val progressBarBackGround = Color(0xFFF1F1F1)

val errorColor = Color(0xFFEA5D5D)
val focusedButtonColor = Color(0xFF1C7ECC)
val riskyButtonColor = Color(0xFFEA5D5D)
val disabledButtonColor = Color(0xFFD8D8D8)
val primaryBackgroundColor = Color(0xFF2096F3)

//Private colors, dont access outside
private val contentBgColor = Color(0xFF313131)
private val light_unselected_border = Color(0xFFD8D8D8)
private val dark_unselected_border = Color(0xFF515151)
private val subtitle_text_color = Color(0xFF808080)

val light_red = Color(0xFFFFEEEB)

val ratingBarSelectedColor = Color(0xFFFEA729)
val unselectedBorderStrokeColor = Color(0xFFD8D8D8)


val lightGreyColor = Color(0xFFFAFAFA)
val blackColor = Color(0xFF000000)
val errorBgColor = Color(0xFFFFEEEB)

//Shimmering effect color shades
val ShimmerColorShades = listOf(

    Color.LightGray.copy(0.7f),

    Color.LightGray.copy(0.2f),

    Color.LightGray.copy(0.7f)

)
//Text color
@get:Composable
val Colors.textColor: Color get() = if (isLight) Color.Black else Color.White
@get:Composable
val Colors.subTitleTextColor: Color get() = if (isLight) subtitle_text_color else subtitle_text_color
@get:Composable
val Colors.semiSubTitleTextColor: Color get() = if (isLight)  contentBgColor else contentBgColor

//card and box bg color
@get:Composable
val Colors.contentBackgroundColor: Color get() = if (isLight) Color.White else contentBgColor

//Option Selection list
@get:Composable
val Colors.selectedBorderColor: Color get() = if (isLight) appGradientStart else appGradientStart
@get:Composable
val Colors.unSelectedBorderColor: Color get() = if (isLight) light_unselected_border else dark_unselected_border

@get:Composable
val Colors.unTrackerColor: Color get() = if (isLight) unselectedBorderStrokeColor else unselectedBorderStrokeColor

@get:Composable
val Colors.greyBackgroundColor: Color get() = if (isLight) lightGreyColor else blackColor

@get:Composable
val Colors.errorBackgroundColor: Color get() = errorBgColor