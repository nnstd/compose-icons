package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableClock: ImageVector
    get() {
        if (_TableClock != null) {
            return _TableClock!!
        }
        _TableClock = ImageVector.Builder(
            name = "TableClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                moveTo(20f, 10.26f)
                verticalLineTo(5f)
                curveTo(20f, 3.9f, 19.11f, 3f, 18f, 3f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(17f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                horizontalLineTo(9.68f)
                curveTo(10.81f, 21.36f, 13.21f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 13.62f, 21.81f, 11.53f, 20f, 10.26f)
                moveTo(18f, 7f)
                verticalLineTo(9.29f)
                curveTo(17.37f, 9.11f, 16.7f, 9f, 16f, 9f)
                curveTo(14.5f, 9f, 13.13f, 9.47f, 12f, 10.26f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(4f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(4f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(9.68f)
                curveTo(9.25f, 13.91f, 9f, 14.93f, 9f, 16f)
                curveTo(9f, 16.34f, 9.03f, 16.67f, 9.08f, 17f)
                horizontalLineTo(4f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _TableClock!!
    }

@Suppress("ObjectPropertyName")
private var _TableClock: ImageVector? = null
