package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeFour: ImageVector
    get() {
        if (_ClockTimeFour != null) {
            return _ClockTimeFour!!
        }
        _ClockTimeFour = ImageVector.Builder(
            name = "ClockTimeFour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(16.3f, 15.2f)
                lineTo(11f, 12.3f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.4f)
                lineTo(17f, 13.9f)
                lineTo(16.3f, 15.2f)
                close()
            }
        }.build()

        return _ClockTimeFour!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeFour: ImageVector? = null
