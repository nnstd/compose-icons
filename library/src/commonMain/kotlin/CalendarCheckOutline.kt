package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarCheckOutline: ImageVector
    get() {
        if (_CalendarCheckOutline != null) {
            return _CalendarCheckOutline!!
        }
        _CalendarCheckOutline = ImageVector.Builder(
            name = "CalendarCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
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
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                moveTo(10.56f, 17.46f)
                lineTo(16.5f, 11.53f)
                lineTo(15.43f, 10.47f)
                lineTo(10.56f, 15.34f)
                lineTo(8.45f, 13.23f)
                lineTo(7.39f, 14.29f)
                lineTo(10.56f, 17.46f)
                close()
            }
        }.build()

        return _CalendarCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCheckOutline: ImageVector? = null
