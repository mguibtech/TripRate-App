package com.mguibtech.triprateapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import com.mguibtech.triprate.ui.theme.TripRateBackground
import com.mguibtech.triprate.ui.theme.TripRateDivider
import com.mguibtech.triprate.ui.theme.TripRateError
import com.mguibtech.triprate.ui.theme.TripRateOnBackground
import com.mguibtech.triprate.ui.theme.TripRateOnPrimary
import com.mguibtech.triprate.ui.theme.TripRateOnSurface
import com.mguibtech.triprate.ui.theme.TripRateOnSurfaceVariant
import com.mguibtech.triprate.ui.theme.TripRateOutline
import com.mguibtech.triprate.ui.theme.TripRatePrimary
import com.mguibtech.triprate.ui.theme.TripRateSurface
import com.mguibtech.triprate.ui.theme.TripRateSurfaceVariant

private val TripRateDarkColorScheme = darkColorScheme(
    primary = TripRatePrimary,
    onPrimary = TripRateOnPrimary,

    background = TripRateBackground,
    onBackground = TripRateOnBackground,

    surface = TripRateSurface,
    onSurface = TripRateOnSurface,

    surfaceVariant = TripRateSurfaceVariant,
    onSurfaceVariant = TripRateOnSurfaceVariant,

    outline = TripRateOutline,

    error = TripRateError,

//     divider = TripRateDivider
)

@Composable
fun TripRateAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = TripRateDarkColorScheme,
        typography = Typography,
        shapes = TripRateShapes,
        content = content
    )
}