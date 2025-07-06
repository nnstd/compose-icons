package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherMoonsetDown: ImageVector
    get() {
        if (_WeatherMoonsetDown != null) {
            return _WeatherMoonsetDown!!
        }
        _WeatherMoonsetDown = ImageVector.Builder(
            name = "WeatherMoonsetDown",
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
                moveTo(12.71f, 20.71f)
                lineTo(15.82f, 17.6f)
                curveTo(16.21f, 17.21f, 16.21f, 16.57f, 15.82f, 16.18f)
                curveTo(15.43f, 15.79f, 14.8f, 15.79f, 14.41f, 16.18f)
                lineTo(12f, 18.59f)
                lineTo(9.59f, 16.18f)
                curveTo(9.2f, 15.79f, 8.57f, 15.79f, 8.18f, 16.18f)
                curveTo(7.79f, 16.57f, 7.79f, 17.21f, 8.18f, 17.6f)
                lineTo(11.29f, 20.71f)
                curveTo(11.5f, 20.9f, 11.74f, 21f, 12f, 21f)
                curveTo(12.26f, 21f, 12.5f, 20.9f, 12.71f, 20.71f)
                close()
            }
        }.build()

        return _WeatherMoonsetDown!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherMoonsetDown: ImageVector? = null
