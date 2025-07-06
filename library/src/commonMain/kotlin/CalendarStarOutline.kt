package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarStarOutline: ImageVector
    get() {
        if (_CalendarStarOutline != null) {
            return _CalendarStarOutline!!
        }
        _CalendarStarOutline = ImageVector.Builder(
            name = "CalendarStarOutline",
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
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(11f, 13f)
                horizontalLineTo(7.8f)
                lineTo(10.4f, 15f)
                lineTo(9.4f, 18f)
                lineTo(12f, 16.2f)
                lineTo(14.6f, 18f)
                lineTo(13.6f, 15f)
                lineTo(16.2f, 13f)
                horizontalLineTo(13f)
                lineTo(12f, 10f)
                lineTo(11f, 13f)
                close()
            }
        }.build()

        return _CalendarStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarStarOutline: ImageVector? = null
