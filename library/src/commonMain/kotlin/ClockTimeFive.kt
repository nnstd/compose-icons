package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeFive: ImageVector
    get() {
        if (_ClockTimeFive != null) {
            return _ClockTimeFive!!
        }
        _ClockTimeFive = ImageVector.Builder(
            name = "ClockTimeFive",
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
                moveTo(14f, 17f)
                lineTo(11f, 11.8f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.4f)
                lineTo(15.3f, 16.3f)
                lineTo(14f, 17f)
                close()
            }
        }.build()

        return _ClockTimeFive!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeFive: ImageVector? = null
