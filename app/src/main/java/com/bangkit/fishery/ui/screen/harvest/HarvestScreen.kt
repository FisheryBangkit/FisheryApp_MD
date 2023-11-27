package com.bangkit.fishery.ui.screen.harvest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.bangkit.fishery.R

@Composable
fun HarvestScreen(
    fish: String
) {
    HarvestContent(fishName = fish)
}

@Composable
fun HarvestContent(
    fishName: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(R.string.harvest) + " " + stringResource(R.string.fish) + " " + fishName
        )
    }
}