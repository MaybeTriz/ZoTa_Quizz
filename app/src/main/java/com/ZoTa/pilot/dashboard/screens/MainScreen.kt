package com.ZoTa.pilot.dashboard.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.ZoTa.pilot.dashboard.components.TopUserSection
import com.ZoTa.pilot.R

@Composable
@Preview
fun MainScreen(){
    val scrollState= rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color= colorResource(id= R.color.grey))
    ){
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ){

            TopUserSection()
        }
    }

}