package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarStarFourPoints: ImageVector
    get() {
        if (_CalendarStarFourPoints != null) {
            return _CalendarStarFourPoints!!
        }
        _CalendarStarFourPoints = ImageVector.Builder(
            name = "CalendarStarFourPoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.74f, 12.25f)
                lineTo(12f, 9.5f)
                lineTo(13.25f, 12.25f)
                lineTo(16f, 13.5f)
                lineTo(13.25f, 14.76f)
                lineTo(12f, 17.5f)
                lineTo(10.74f, 14.76f)
                lineTo(8f, 13.5f)
                lineTo(10.74f, 12.25f)
                moveTo(16f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(19.53f, 3f, 20.04f, 3.21f, 20.41f, 3.59f)
                curveTo(20.79f, 3.96f, 21f, 4.47f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.47f, 3.21f, 3.96f, 3.59f, 3.59f)
                curveTo(3.96f, 3.21f, 4.47f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                moveTo(5f, 8f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CalendarStarFourPoints!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarStarFourPoints: ImageVector? = null
