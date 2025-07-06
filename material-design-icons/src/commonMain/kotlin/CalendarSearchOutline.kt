package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarSearchOutline: ImageVector
    get() {
        if (_CalendarSearchOutline != null) {
            return _CalendarSearchOutline!!
        }
        _CalendarSearchOutline = ImageVector.Builder(
            name = "CalendarSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 18.9f)
                curveTo(19.7f, 18.2f, 20f, 17.4f, 20f, 16.5f)
                curveTo(20f, 14f, 18f, 12f, 15.5f, 12f)
                reflectiveCurveTo(11f, 14f, 11f, 16.5f)
                reflectiveCurveTo(13f, 21f, 15.5f, 21f)
                curveTo(16.4f, 21f, 17.2f, 20.8f, 17.9f, 20.3f)
                lineTo(21f, 23.4f)
                lineTo(22.4f, 22f)
                lineTo(19.3f, 18.9f)
                moveTo(15.5f, 19f)
                curveTo(14.1f, 19f, 13f, 17.9f, 13f, 16.5f)
                reflectiveCurveTo(14.1f, 14f, 15.5f, 14f)
                reflectiveCurveTo(18f, 15.1f, 18f, 16.5f)
                reflectiveCurveTo(16.9f, 19f, 15.5f, 19f)
                moveTo(5f, 19f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                curveTo(19.8f, 11.5f, 20.5f, 12.2f, 21f, 13f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
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
                horizontalLineTo(10.8f)
                curveTo(10.2f, 20.4f, 9.8f, 19.8f, 9.5f, 19f)
                horizontalLineTo(5f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _CalendarSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarSearchOutline: ImageVector? = null
