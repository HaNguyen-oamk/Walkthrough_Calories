package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Calculation(male: Boolean, weight: Int, intensity: Float, setResult: (Int) -> Unit) {
    Button(
        onClick = {
            val calories = if (male) {
                ((879 + 10.2 * weight) * intensity).toInt()
            } else {
                ((795 + 7.18 * weight) * intensity).toInt()
            }
            setResult(calories)
        },
        modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
    ) {
        Text(text = "CALCULATE")
    }
}
