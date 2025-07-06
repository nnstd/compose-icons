package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryNegative: ImageVector
    get() {
        if (_BatteryNegative != null) {
            return _BatteryNegative!!
        }
        _BatteryNegative = ImageVector.Builder(
            name = "BatteryNegative",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.67f, 4f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(13f, 21.4f, 12.4f, 22f, 11.67f, 22f)
                horizontalLineTo(2.33f)
                curveTo(1.6f, 22f, 1f, 21.4f, 1f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(11.67f)
                moveTo(15f, 12f)
                horizontalLineTo(23f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                moveTo(3f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _BatteryNegative!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryNegative: ImageVector? = null
