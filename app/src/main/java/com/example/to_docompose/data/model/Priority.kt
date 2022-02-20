package com.example.to_docompose.data.model

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.Color
import com.example.to_docompose.ui.theme.*

enum class Priority (val color: Color){
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColorLight)

}