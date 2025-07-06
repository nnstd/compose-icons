package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryPlusVariant: ImageVector
    get() {
        if (_BatteryPlusVariant != null) {
            return _BatteryPlusVariant!!
        }
        _BatteryPlusVariant = ImageVector.Builder(
            name = "BatteryPlusVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.67f, 4f)
                curveTo(17.4f, 4f, 18f, 4.6f, 18f, 5.33f)
                verticalLineTo(20.67f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.67f, 22f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 22f, 6f, 21.4f, 6f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(16.67f)
                moveTo(16f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _BatteryPlusVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryPlusVariant: ImageVector? = null
