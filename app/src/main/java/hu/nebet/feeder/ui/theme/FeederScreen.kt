package hu.nebet.feeder.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import hu.nebet.feeder.model.EatingPlace
import hu.nebet.feeder.model.dummyEatingPlaces


@Composable
fun FeederScreen() {
    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp,
            horizontal = 8.dp
        )
    ) {
        items(dummyEatingPlaces) { eatingPlace ->
            EatingPlaceItem(eatingPlace)
        }
    }
}

@Composable
fun EatingPlaceItem(item: EatingPlace) {
    Card(
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            EatingPlaceIcon(Icons.Filled.Place, Modifier.weight(0.15f))
            item.description?.let { EatingPlaceDetails(item.fullName, it, Modifier.weight(0.85f)) }
        }
    }
}

@Composable
private fun EatingPlaceIcon(icon: ImageVector, modifier: Modifier) {
    Image(
        imageVector = icon,
        contentDescription = "EatingPlace icon",
        modifier = modifier.padding(8.dp)
    )
}

@Composable
private fun EatingPlaceDetails(title: String, description: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6
        )
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.medium
        ) {
            Text(
                text = description,
                style = MaterialTheme.typography.body2
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FeederTheme {
        FeederScreen()
    }
}