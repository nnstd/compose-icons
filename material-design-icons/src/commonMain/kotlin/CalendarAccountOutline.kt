package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarAccountOutline: ImageVector
    get() {
        if (_CalendarAccountOutline != null) {
            return _CalendarAccountOutline!!
        }
        _CalendarAccountOutline = ImageVector.Builder(
            name = "CalendarAccountOutline",
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
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(12f, 10f)
                curveTo(14f, 10f, 15f, 12.42f, 13.59f, 13.84f)
                curveTo(12.17f, 15.26f, 9.75f, 14.25f, 9.75f, 12.25f)
                curveTo(9.75f, 11f, 10.75f, 10f, 12f, 10f)
                moveTo(16.5f, 17.88f)
                verticalLineTo(18f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.88f)
                curveTo(7.5f, 16.63f, 9.5f, 15.63f, 12f, 15.63f)
                reflectiveCurveTo(16.5f, 16.63f, 16.5f, 17.88f)
                close()
            }
        }.build()

        return _CalendarAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarAccountOutline: ImageVector? = null
