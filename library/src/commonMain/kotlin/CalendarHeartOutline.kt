package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarHeartOutline: ImageVector
    get() {
        if (_CalendarHeartOutline != null) {
            return _CalendarHeartOutline!!
        }
        _CalendarHeartOutline = ImageVector.Builder(
            name = "CalendarHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12.2f)
                curveTo(16f, 13.71f, 14.64f, 14.94f, 12.58f, 16.81f)
                lineTo(12f, 17.34f)
                lineTo(11.42f, 16.81f)
                curveTo(9.36f, 14.94f, 8f, 13.71f, 8f, 12.2f)
                curveTo(8f, 10.97f, 8.97f, 10f, 10.2f, 10f)
                curveTo(10.9f, 10f, 11.56f, 10.32f, 12f, 10.83f)
                curveTo(12.44f, 10.32f, 13.1f, 10f, 13.8f, 10f)
                curveTo(15.03f, 10f, 16f, 10.97f, 16f, 12.2f)
                moveTo(21f, 5f)
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

        return _CalendarHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarHeartOutline: ImageVector? = null
