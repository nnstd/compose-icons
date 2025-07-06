package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherSunnyAlert: ImageVector
    get() {
        if (_WeatherSunnyAlert != null) {
            return _WeatherSunnyAlert!!
        }
        _WeatherSunnyAlert = ImageVector.Builder(
            name = "WeatherSunnyAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                moveTo(12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(12f, 2f)
                lineTo(14.39f, 5.42f)
                curveTo(13.65f, 5.15f, 12.84f, 5f, 12f, 5f)
                curveTo(11.16f, 5f, 10.35f, 5.15f, 9.61f, 5.42f)
                lineTo(12f, 2f)
                moveTo(3.34f, 7f)
                lineTo(7.5f, 6.65f)
                curveTo(6.9f, 7.16f, 6.36f, 7.78f, 5.94f, 8.5f)
                curveTo(5.5f, 9.24f, 5.25f, 10f, 5.11f, 10.79f)
                lineTo(3.34f, 7f)
                moveTo(3.36f, 17f)
                lineTo(5.12f, 13.23f)
                curveTo(5.26f, 14f, 5.53f, 14.78f, 5.95f, 15.5f)
                curveTo(6.37f, 16.24f, 6.91f, 16.86f, 7.5f, 17.37f)
                lineTo(3.36f, 17f)
                moveTo(12f, 22f)
                lineTo(9.59f, 18.56f)
                curveTo(10.33f, 18.83f, 11.14f, 19f, 12f, 19f)
                curveTo(12.82f, 19f, 13.63f, 18.83f, 14.37f, 18.56f)
                moveTo(19f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(19f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
            }
        }.build()

        return _WeatherSunnyAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherSunnyAlert: ImageVector? = null
