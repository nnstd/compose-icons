package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarAccount: ImageVector
    get() {
        if (_CalendarAccount != null) {
            return _CalendarAccount!!
        }
        _CalendarAccount = ImageVector.Builder(
            name = "CalendarAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(14f, 9f, 15f, 11.42f, 13.59f, 12.84f)
                curveTo(12.17f, 14.26f, 9.75f, 13.25f, 9.75f, 11.25f)
                curveTo(9.75f, 10f, 10.75f, 9f, 12f, 9f)
                moveTo(16.5f, 18f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.88f)
                curveTo(7.5f, 15.63f, 9.5f, 14.63f, 12f, 14.63f)
                reflectiveCurveTo(16.5f, 15.63f, 16.5f, 16.88f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(16f, 1f)
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
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _CalendarAccount!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarAccount: ImageVector? = null
