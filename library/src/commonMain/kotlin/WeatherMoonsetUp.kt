package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherMoonsetUp: ImageVector
    get() {
        if (_WeatherMoonsetUp != null) {
            return _WeatherMoonsetUp!!
        }
        _WeatherMoonsetUp = ImageVector.Builder(
            name = "WeatherMoonsetUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12f)
                horizontalLineTo(7f)
                curveTo(7f, 10.67f, 7.53f, 9.4f, 8.46f, 8.46f)
                curveTo(9.4f, 7.53f, 10.67f, 7f, 12f, 7f)
                curveTo(13.33f, 7f, 14.6f, 7.53f, 15.54f, 8.46f)
                curveTo(16.47f, 9.4f, 17f, 10.67f, 17f, 12f)
                horizontalLineTo(21f)
                curveTo(21.27f, 12f, 21.5f, 12.11f, 21.71f, 12.29f)
                curveTo(21.9f, 12.5f, 22f, 12.74f, 22f, 13f)
                curveTo(22f, 13.27f, 21.9f, 13.5f, 21.71f, 13.71f)
                curveTo(21.5f, 13.9f, 21.27f, 14f, 21f, 14f)
                horizontalLineTo(3f)
                curveTo(2.74f, 14f, 2.5f, 13.9f, 2.29f, 13.71f)
                curveTo(2.11f, 13.5f, 2f, 13.27f, 2f, 13f)
                curveTo(2f, 12.74f, 2.11f, 12.5f, 2.29f, 12.29f)
                curveTo(2.5f, 12.11f, 2.74f, 12f, 3f, 12f)
                moveTo(12.71f, 16.3f)
                lineTo(15.82f, 19.41f)
                curveTo(16.21f, 19.8f, 16.21f, 20.43f, 15.82f, 20.82f)
                curveTo(15.43f, 21.21f, 14.8f, 21.21f, 14.41f, 20.82f)
                lineTo(12f, 18.41f)
                lineTo(9.59f, 20.82f)
                curveTo(9.2f, 21.21f, 8.57f, 21.21f, 8.18f, 20.82f)
                curveTo(7.79f, 20.43f, 7.79f, 19.8f, 8.18f, 19.41f)
                lineTo(11.29f, 16.3f)
                curveTo(11.5f, 16.1f, 11.74f, 16f, 12f, 16f)
                curveTo(12.26f, 16f, 12.5f, 16.1f, 12.71f, 16.3f)
                close()
            }
        }.build()

        return _WeatherMoonsetUp!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherMoonsetUp: ImageVector? = null
