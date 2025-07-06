package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryHeartVariant: ImageVector
    get() {
        if (_BatteryHeartVariant != null) {
            return _BatteryHeartVariant!!
        }
        _BatteryHeartVariant = ImageVector.Builder(
            name = "BatteryHeartVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.33f)
                verticalLineTo(20.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, 22f)
                horizontalLineTo(16.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.67f, 4f)
                moveTo(12.58f, 15.64f)
                lineTo(12f, 16.17f)
                lineTo(11.42f, 15.64f)
                curveTo(9.36f, 13.77f, 8f, 12.54f, 8f, 11f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.2f, 8.8f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9.63f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.8f, 8.8f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                curveTo(16f, 12.54f, 14.64f, 13.77f, 12.58f, 15.64f)
                close()
            }
        }.build()

        return _BatteryHeartVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryHeartVariant: ImageVector? = null
