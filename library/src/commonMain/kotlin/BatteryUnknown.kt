package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryUnknown: ImageVector
    get() {
        if (_BatteryUnknown != null) {
            return _BatteryUnknown!!
        }
        _BatteryUnknown = ImageVector.Builder(
            name = "BatteryUnknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.07f, 12.25f)
                lineTo(14.17f, 13.17f)
                curveTo(13.63f, 13.71f, 13.25f, 14.18f, 13.09f, 15f)
                horizontalLineTo(11.05f)
                curveTo(11.16f, 14.1f, 11.56f, 13.28f, 12.17f, 12.67f)
                lineTo(13.41f, 11.41f)
                curveTo(13.78f, 11.05f, 14f, 10.55f, 14f, 10f)
                curveTo(14f, 8.89f, 13.1f, 8f, 12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10f)
                horizontalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                curveTo(16f, 10.88f, 15.64f, 11.68f, 15.07f, 12.25f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(16.67f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.33f)
                verticalLineTo(20.66f)
                curveTo(6f, 21.4f, 6.6f, 22f, 7.33f, 22f)
                horizontalLineTo(16.67f)
                curveTo(17.4f, 22f, 18f, 21.4f, 18f, 20.66f)
                verticalLineTo(5.33f)
                curveTo(18f, 4.59f, 17.4f, 4f, 16.67f, 4f)
                close()
            }
        }.build()

        return _BatteryUnknown!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryUnknown: ImageVector? = null
