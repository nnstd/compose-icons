package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeEight: ImageVector
    get() {
        if (_ClockTimeEight != null) {
            return _ClockTimeEight!!
        }
        _ClockTimeEight = ImageVector.Builder(
            name = "ClockTimeEight",
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
                moveTo(7.7f, 15.5f)
                lineTo(7f, 14.2f)
                lineTo(11f, 11.9f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.8f)
                lineTo(7.7f, 15.5f)
                close()
            }
        }.build()

        return _ClockTimeEight!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeEight: ImageVector? = null
