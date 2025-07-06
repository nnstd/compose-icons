package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarHeart: ImageVector
    get() {
        if (_CalendarHeart != null) {
            return _CalendarHeart!!
        }
        _CalendarHeart = ImageVector.Builder(
            name = "CalendarHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(16f, 1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                moveTo(12f, 17.17f)
                lineTo(11.42f, 16.64f)
                curveTo(9.36f, 14.77f, 8f, 13.54f, 8f, 12.03f)
                curveTo(8f, 10.8f, 8.97f, 9.83f, 10.2f, 9.83f)
                curveTo(10.9f, 9.83f, 11.56f, 10.15f, 12f, 10.66f)
                curveTo(12.44f, 10.15f, 13.1f, 9.83f, 13.8f, 9.83f)
                curveTo(15.03f, 9.83f, 16f, 10.8f, 16f, 12.03f)
                curveTo(16f, 13.54f, 14.64f, 14.77f, 12.58f, 16.64f)
                lineTo(12f, 17.17f)
                close()
            }
        }.build()

        return _CalendarHeart!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarHeart: ImageVector? = null
