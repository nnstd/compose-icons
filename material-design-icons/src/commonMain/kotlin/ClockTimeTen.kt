package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeTen: ImageVector
    get() {
        if (_ClockTimeTen != null) {
            return _ClockTimeTen!!
        }
        _ClockTimeTen = ImageVector.Builder(
            name = "ClockTimeTen",
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
                moveTo(12.5f, 13f)
                horizontalLineTo(11f)
                lineTo(7f, 10.7f)
                lineTo(7.8f, 9.4f)
                lineTo(11.1f, 11.3f)
                verticalLineTo(7f)
                horizontalLineTo(12.6f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ClockTimeTen!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeTen: ImageVector? = null
