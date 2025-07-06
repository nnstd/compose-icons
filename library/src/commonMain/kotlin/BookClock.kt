package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookClock: ImageVector
    get() {
        if (_BookClock != null) {
            return _BookClock!!
        }
        _BookClock = ImageVector.Builder(
            name = "BookClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 17.25f)
                lineTo(19.36f, 18.94f)
                lineTo(18.61f, 20.16f)
                lineTo(15f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(17.25f)
                moveTo(23f, 17f)
                curveTo(23f, 20.87f, 19.87f, 24f, 16f, 24f)
                curveTo(14.09f, 24f, 12.37f, 23.24f, 11.11f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(12f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                curveTo(19.1f, 2f, 20f, 2.89f, 20f, 4f)
                verticalLineTo(11.26f)
                curveTo(21.81f, 12.53f, 23f, 14.62f, 23f, 17f)
                moveTo(21f, 17f)
                curveTo(21f, 14.24f, 18.76f, 12f, 16f, 12f)
                reflectiveCurveTo(11f, 14.24f, 11f, 17f)
                reflectiveCurveTo(13.24f, 22f, 16f, 22f)
                reflectiveCurveTo(21f, 19.76f, 21f, 17f)
                close()
            }
        }.build()

        return _BookClock!!
    }

@Suppress("ObjectPropertyName")
private var _BookClock: ImageVector? = null
