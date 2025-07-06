package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarPlusOutline: ImageVector
    get() {
        if (_CalendarPlusOutline != null) {
            return _CalendarPlusOutline!!
        }
        _CalendarPlusOutline = ImageVector.Builder(
            name = "CalendarPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(19f, 19f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _CalendarPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarPlusOutline: ImageVector? = null
