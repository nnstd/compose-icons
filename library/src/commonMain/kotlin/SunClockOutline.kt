package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunClockOutline: ImageVector
    get() {
        if (_SunClockOutline != null) {
            return _SunClockOutline!!
        }
        _SunClockOutline = ImageVector.Builder(
            name = "SunClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.1f, 9.32f)
                lineTo(19.65f, 6f)
                lineTo(15.5f, 5.64f)
                curveTo(16.1f, 6.15f, 16.63f, 6.78f, 17.05f, 7.5f)
                curveTo(17.37f, 8.05f, 17.58f, 8.63f, 17.73f, 9.22f)
                curveTo(17.18f, 9.08f, 16.6f, 9f, 16f, 9f)
                curveTo(15.86f, 9f, 15.72f, 9f, 15.58f, 9f)
                curveTo(14.81f, 7.25f, 13.06f, 6f, 11f, 6f)
                curveTo(8.24f, 6f, 6f, 8.24f, 6f, 11f)
                curveTo(6f, 13.06f, 7.25f, 14.81f, 9f, 15.58f)
                curveTo(9f, 15.72f, 9f, 15.86f, 9f, 16f)
                curveTo(9f, 19.87f, 12.13f, 23f, 16f, 23f)
                reflectiveCurveTo(23f, 19.87f, 23f, 16f)
                curveTo(23f, 12.87f, 20.94f, 10.21f, 18.1f, 9.32f)
                moveTo(8f, 11f)
                curveTo(8f, 9.35f, 9.35f, 8f, 11f, 8f)
                curveTo(12.08f, 8f, 13.03f, 8.58f, 13.56f, 9.45f)
                curveTo(11.66f, 10.15f, 10.15f, 11.66f, 9.45f, 13.56f)
                curveTo(8.58f, 13.03f, 8f, 12.08f, 8f, 11f)
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
                moveTo(11f, 4f)
                curveTo(10.16f, 4f, 9.35f, 4.15f, 8.61f, 4.42f)
                lineTo(11f, 1f)
                lineTo(13.39f, 4.42f)
                curveTo(12.65f, 4.15f, 11.84f, 4f, 11f, 4f)
                moveTo(4.95f, 14.5f)
                curveTo(5.37f, 15.24f, 5.91f, 15.86f, 6.5f, 16.37f)
                lineTo(2.36f, 16f)
                lineTo(4.12f, 12.23f)
                curveTo(4.26f, 13f, 4.53f, 13.78f, 4.95f, 14.5f)
                moveTo(4.11f, 9.79f)
                lineTo(2.34f, 6f)
                lineTo(6.5f, 5.65f)
                curveTo(5.9f, 6.16f, 5.36f, 6.78f, 4.94f, 7.5f)
                curveTo(4.5f, 8.24f, 4.25f, 9f, 4.11f, 9.79f)
                close()
            }
        }.build()

        return _SunClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SunClockOutline: ImageVector? = null
