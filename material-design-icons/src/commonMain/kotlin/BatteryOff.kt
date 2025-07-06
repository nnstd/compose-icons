package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryOff: ImageVector
    get() {
        if (_BatteryOff != null) {
            return _BatteryOff!!
        }
        _BatteryOff = ImageVector.Builder(
            name = "BatteryOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.8f)
                lineTo(7.21f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(16.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.33f)
                moveTo(18f, 17.35f)
                lineTo(3.38f, 2.73f)
                lineTo(2.11f, 4f)
                lineTo(6f, 7.89f)
                verticalLineTo(20.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, 22f)
                horizontalLineTo(16.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20.67f)
                verticalLineTo(19.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                close()
            }
        }.build()

        return _BatteryOff!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryOff: ImageVector? = null
