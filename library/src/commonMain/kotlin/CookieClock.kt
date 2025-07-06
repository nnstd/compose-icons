package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CookieClock: ImageVector
    get() {
        if (_CookieClock != null) {
            return _CookieClock!!
        }
        _CookieClock = ImageVector.Builder(
            name = "CookieClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.97f, 10.24f)
                curveTo(19.95f, 10f, 19.91f, 9.74f, 19.87f, 9.5f)
                curveTo(19.6f, 9f, 19f, 9f, 19f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                curveTo(17f, 7f, 16f, 7f, 16f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                curveTo(14f, 5f, 13f, 5f, 13f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                curveTo(12f, 2f, 11f, 2f, 11f, 2f)
                curveTo(6.03f, 2f, 2f, 6.03f, 2f, 11f)
                curveTo(2f, 15.71f, 5.62f, 19.57f, 10.23f, 19.96f)
                curveTo(11.5f, 21.8f, 13.61f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 13.61f, 21.8f, 11.5f, 19.97f, 10.24f)
                moveTo(11.64f, 10.53f)
                curveTo(10.87f, 11.15f, 10.23f, 11.92f, 9.78f, 12.81f)
                curveTo(9.32f, 12.55f, 9f, 12.06f, 9f, 11.5f)
                curveTo(9f, 10.67f, 9.67f, 10f, 10.5f, 10f)
                curveTo(10.96f, 10f, 11.36f, 10.21f, 11.64f, 10.53f)
                moveTo(5.5f, 12f)
                curveTo(4.67f, 12f, 4f, 11.33f, 4f, 10.5f)
                reflectiveCurveTo(4.67f, 9f, 5.5f, 9f)
                reflectiveCurveTo(7f, 9.67f, 7f, 10.5f)
                reflectiveCurveTo(6.33f, 12f, 5.5f, 12f)
                moveTo(7f, 6.5f)
                curveTo(7f, 5.67f, 7.67f, 5f, 8.5f, 5f)
                reflectiveCurveTo(10f, 5.67f, 10f, 6.5f)
                reflectiveCurveTo(9.33f, 8f, 8.5f, 8f)
                reflectiveCurveTo(7f, 7.33f, 7f, 6.5f)
                moveTo(8.5f, 16.5f)
                curveTo(8.5f, 16.04f, 8.71f, 15.64f, 9.03f, 15.36f)
                curveTo(9f, 15.57f, 9f, 15.79f, 9f, 16f)
                curveTo(9f, 16.62f, 9.09f, 17.22f, 9.24f, 17.79f)
                curveTo(8.8f, 17.5f, 8.5f, 17.05f, 8.5f, 16.5f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }.build()

        return _CookieClock!!
    }

@Suppress("ObjectPropertyName")
private var _CookieClock: ImageVector? = null
