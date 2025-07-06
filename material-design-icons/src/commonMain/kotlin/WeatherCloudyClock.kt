package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherCloudyClock: ImageVector
    get() {
        if (_WeatherCloudyClock != null) {
            return _WeatherCloudyClock!!
        }
        _WeatherCloudyClock = ImageVector.Builder(
            name = "WeatherCloudyClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                verticalLineTo(13f)
                moveTo(18.13f, 9.33f)
                curveTo(17.23f, 6.81f, 14.83f, 5f, 12f, 5f)
                curveTo(9.3f, 5f, 7f, 6.65f, 6f, 9f)
                curveTo(3.24f, 9f, 1f, 11.24f, 1f, 14f)
                reflectiveCurveTo(3.24f, 19f, 6f, 19f)
                horizontalLineTo(9.68f)
                curveTo(10.81f, 21.36f, 13.21f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 12.88f, 20.96f, 10.24f, 18.13f, 9.33f)
                moveTo(6f, 17f)
                curveTo(4.34f, 17f, 3f, 15.66f, 3f, 14f)
                reflectiveCurveTo(4.34f, 11f, 6f, 11f)
                curveTo(6.37f, 11f, 6.73f, 11.07f, 7.06f, 11.19f)
                curveTo(7.45f, 8.82f, 9.5f, 7f, 12f, 7f)
                curveTo(13.63f, 7f, 15.07f, 7.79f, 16f, 9f)
                curveTo(12.12f, 9f, 9f, 12.14f, 9f, 16f)
                curveTo(9f, 16.34f, 9.03f, 16.67f, 9.08f, 17f)
                horizontalLineTo(6f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _WeatherCloudyClock!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherCloudyClock: ImageVector? = null
