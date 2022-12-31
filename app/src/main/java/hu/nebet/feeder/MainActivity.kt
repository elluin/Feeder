package hu.nebet.feeder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import hu.nebet.feeder.ui.theme.FeederScreen
import hu.nebet.feeder.ui.theme.FeederTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeederTheme {
                FeederScreen()
            }
        }
    }
}