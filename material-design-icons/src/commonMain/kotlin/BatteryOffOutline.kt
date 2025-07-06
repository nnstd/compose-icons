package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryOffOutline: ImageVector
    get() {
        if (_BatteryOffOutline != null) {
            return _BatteryOffOutline!!
        }
        _BatteryOffOutline = ImageVector.Builder(
            name = "BatteryOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(9.89f)
                lineTo(16f, 17.89f)
                moveTo(16f, 6f)
                verticalLineTo(12.8f)
                lineTo(18f, 14.8f)
                verticalLineTo(5.33f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.21f)
                lineTo(9.21f, 6f)
                close()
            }
        }.build()

        return _BatteryOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryOffOutline: ImageVector? = null
