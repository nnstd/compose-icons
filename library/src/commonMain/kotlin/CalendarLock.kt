package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarLock: ImageVector
    get() {
        if (_CalendarLock != null) {
            return _CalendarLock!!
        }
        _CalendarLock = ImageVector.Builder(
            name = "CalendarLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
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
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(12f)
                curveTo(20.4f, 11.6f, 19.7f, 11.2f, 19f, 11.1f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                moveTo(22f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(22f, 22.4f, 21.4f, 23f, 20.7f, 23f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23f, 14f, 22.4f, 14f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14f, 17.6f, 14.6f, 17f, 15.2f, 17f)
                verticalLineTo(15.5f)
                curveTo(15.2f, 14.1f, 16.6f, 13f, 18f, 13f)
                reflectiveCurveTo(20.8f, 14.1f, 20.8f, 15.5f)
                verticalLineTo(17f)
                curveTo(21.4f, 17f, 22f, 17.6f, 22f, 18.3f)
                moveTo(19.5f, 15.5f)
                curveTo(19.5f, 14.7f, 18.8f, 14.2f, 18f, 14.2f)
                reflectiveCurveTo(16.5f, 14.7f, 16.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _CalendarLock!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarLock: ImageVector? = null
