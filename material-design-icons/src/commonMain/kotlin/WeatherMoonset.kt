package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeatherMoonset: ImageVector
    get() {
        if (_WeatherMoonset != null) {
            return _WeatherMoonset!!
        }
        _WeatherMoonset = ImageVector.Builder(
            name = "WeatherMoonset",
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
                moveTo(5f, 16f)
                horizontalLineTo(19f)
                curveTo(19.27f, 16f, 19.5f, 16.11f, 19.71f, 16.29f)
                curveTo(19.9f, 16.5f, 20f, 16.74f, 20f, 17f)
                curveTo(20f, 17.27f, 19.9f, 17.5f, 19.71f, 17.71f)
                curveTo(19.5f, 17.9f, 19.27f, 18f, 19f, 18f)
                horizontalLineTo(5f)
                curveTo(4.74f, 18f, 4.5f, 17.9f, 4.29f, 17.71f)
                curveTo(4.11f, 17.5f, 4f, 17.27f, 4f, 17f)
                curveTo(4f, 16.74f, 4.11f, 16.5f, 4.29f, 16.29f)
                curveTo(4.5f, 16.11f, 4.74f, 16f, 5f, 16f)
                moveTo(17f, 20f)
                curveTo(17.27f, 20f, 17.5f, 20.11f, 17.71f, 20.29f)
                curveTo(17.9f, 20.5f, 18f, 20.74f, 18f, 21f)
                curveTo(18f, 21.27f, 17.9f, 21.5f, 17.71f, 21.71f)
                curveTo(17.5f, 21.9f, 17.27f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(6.74f, 22f, 6.5f, 21.9f, 6.29f, 21.71f)
                curveTo(6.11f, 21.5f, 6f, 21.27f, 6f, 21f)
                curveTo(6f, 20.74f, 6.11f, 20.5f, 6.29f, 20.29f)
                curveTo(6.5f, 20.11f, 6.74f, 20f, 7f, 20f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _WeatherMoonset!!
    }

@Suppress("ObjectPropertyName")
private var _WeatherMoonset: ImageVector? = null
