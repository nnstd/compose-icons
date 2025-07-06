package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarLockOpenOutline: ImageVector
    get() {
        if (_CalendarLockOpenOutline != null) {
            return _CalendarLockOpenOutline!!
        }
        _CalendarLockOpenOutline = ImageVector.Builder(
            name = "CalendarLockOpenOutline",
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
                horizontalLineTo(12f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(10.1f)
                curveTo(19.7f, 10.3f, 20.4f, 10.6f, 21f, 11f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(22f, 21.8f)
                curveTo(22f, 22.4f, 21.4f, 23f, 20.7f, 23f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23f, 14f, 22.4f, 14f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14f, 17.6f, 14.6f, 17f, 15.2f, 17f)
                verticalLineTo(14.5f)
                curveTo(15.2f, 13.1f, 16.6f, 12f, 18f, 12f)
                reflectiveCurveTo(20.8f, 13.1f, 20.8f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.5f)
                curveTo(19.5f, 13.7f, 18.8f, 13.2f, 18f, 13.2f)
                reflectiveCurveTo(16.5f, 13.7f, 16.5f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(20.8f)
                curveTo(21.4f, 17f, 22f, 17.6f, 22f, 18.3f)
                verticalLineTo(21.8f)
                close()
            }
        }.build()

        return _CalendarLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarLockOpenOutline: ImageVector? = null
