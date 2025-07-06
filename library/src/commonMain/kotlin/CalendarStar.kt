package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarStar: ImageVector
    get() {
        if (_CalendarStar != null) {
            return _CalendarStar!!
        }
        _CalendarStar = ImageVector.Builder(
            name = "CalendarStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(16f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                moveTo(10.88f, 12f)
                horizontalLineTo(7.27f)
                lineTo(10.19f, 14.11f)
                lineTo(9.08f, 17.56f)
                lineTo(12f, 15.43f)
                lineTo(14.92f, 17.56f)
                lineTo(13.8f, 14.12f)
                lineTo(16.72f, 12f)
                horizontalLineTo(13.12f)
                lineTo(12f, 8.56f)
                lineTo(10.88f, 12f)
                close()
            }
        }.build()

        return _CalendarStar!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarStar: ImageVector? = null
