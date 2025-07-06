package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarBadge: ImageVector
    get() {
        if (_CalendarBadge != null) {
            return _CalendarBadge!!
        }
        _CalendarBadge = ImageVector.Builder(
            name = "CalendarBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 16f)
                curveTo(17.6f, 16f, 16f, 17.6f, 16f, 19.5f)
                reflectiveCurveTo(17.6f, 23f, 19.5f, 23f)
                reflectiveCurveTo(23f, 21.4f, 23f, 19.5f)
                reflectiveCurveTo(21.4f, 16f, 19.5f, 16f)
                moveTo(14.21f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
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
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(14.21f)
                curveTo(20.5f, 14.08f, 20f, 14f, 19.5f, 14f)
                curveTo(19.33f, 14f, 19.17f, 14f, 19f, 14.03f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(14.03f)
                curveTo(14f, 19.17f, 14f, 19.33f, 14f, 19.5f)
                curveTo(14f, 20f, 14.08f, 20.5f, 14.21f, 21f)
                close()
            }
        }.build()

        return _CalendarBadge!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarBadge: ImageVector? = null
