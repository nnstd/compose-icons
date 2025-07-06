package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseClockOutline: ImageVector
    get() {
        if (_DatabaseClockOutline != null) {
            return _DatabaseClockOutline!!
        }
        _DatabaseClockOutline = ImageVector.Builder(
            name = "DatabaseClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(13.61f, 23f, 11.5f, 21.8f, 10.25f, 20f)
                curveTo(6.19f, 19.79f, 3f, 18.08f, 3f, 16f)
                verticalLineTo(6f)
                curveTo(3f, 3.79f, 6.58f, 2f, 11f, 2f)
                reflectiveCurveTo(19f, 3.79f, 19f, 6f)
                verticalLineTo(9.68f)
                curveTo(21.36f, 10.81f, 23f, 13.21f, 23f, 16f)
                moveTo(17f, 9.08f)
                verticalLineTo(8.64f)
                curveTo(16.77f, 8.77f, 16.5f, 8.9f, 16.24f, 9f)
                curveTo(16.5f, 9f, 16.75f, 9.04f, 17f, 9.08f)
                moveTo(5f, 6f)
                curveTo(5f, 6.5f, 7.13f, 8f, 11f, 8f)
                reflectiveCurveTo(17f, 6.5f, 17f, 6f)
                reflectiveCurveTo(14.87f, 4f, 11f, 4f)
                reflectiveCurveTo(5f, 5.5f, 5f, 6f)
                moveTo(5f, 11.45f)
                curveTo(6.07f, 12.23f, 7.8f, 12.76f, 9.72f, 12.93f)
                curveTo(10.33f, 11.67f, 11.32f, 10.62f, 12.54f, 9.92f)
                curveTo(12.04f, 9.97f, 11.53f, 10f, 11f, 10f)
                curveTo(8.61f, 10f, 6.47f, 9.47f, 5f, 8.64f)
                verticalLineTo(11.45f)
                moveTo(9.26f, 17.87f)
                curveTo(9.1f, 17.27f, 9f, 16.65f, 9f, 16f)
                curveTo(9f, 15.61f, 9.04f, 15.23f, 9.1f, 14.86f)
                curveTo(7.56f, 14.69f, 6.15f, 14.33f, 5f, 13.77f)
                verticalLineTo(16f)
                curveTo(5f, 16.42f, 6.5f, 17.5f, 9.26f, 17.87f)
                moveTo(21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                reflectiveCurveTo(11f, 13.24f, 11f, 16f)
                reflectiveCurveTo(13.24f, 21f, 16f, 21f)
                reflectiveCurveTo(21f, 18.76f, 21f, 16f)
                close()
            }
        }.build()

        return _DatabaseClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseClockOutline: ImageVector? = null
