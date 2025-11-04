package com.ZoTa.pilot.dashboard.components

import android.R.attr.fontWeight
import android.R.attr.text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import com.ZoTa.pilot.R
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun CategoryHeader(){
    Row(
        modifier= Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
        text="Quiz Categories",
        fontSize=20.sp,
        fontWeight= FontWeight.Bold,
        color=colorResource(id=R.color.navy_blue)
        )
        Text(
            text="See all",
            fontSize=16.sp,
            color=colorResource(id=R.color.orange)
        )
    }
}