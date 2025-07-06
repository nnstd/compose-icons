package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryHeart: ImageVector
    get() {
        if (_BatteryHeart != null) {
            return _BatteryHeart!!
        }
        _BatteryHeart = ImageVector.Builder(
            name = "BatteryHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.67f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3.33f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.33f)
                verticalLineTo(20.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.33f, 22f)
                horizontalLineTo(12.67f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.67f, 4f)
                moveTo(19f, 16.17f)
                lineTo(18.42f, 15.64f)
                curveTo(16.36f, 13.77f, 15f, 12.54f, 15f, 11f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.2f, 8.8f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9.63f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.8f, 8.8f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 11f)
                curveTo(23f, 12.5f, 21.64f, 13.74f, 19.58f, 15.61f)
                close()
            }
        }.build()

        return _BatteryHeart!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryHeart: ImageVector? = null
