package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryMinus: ImageVector
    get() {
        if (_BatteryMinus != null) {
            return _BatteryMinus!!
        }
        _BatteryMinus = ImageVector.Builder(
            name = "BatteryMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.54f, 22f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 22f, 6f, 21.4f, 6f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(6f, 4.6f, 6.6f, 4f, 7.33f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(16.67f)
                curveTo(17.4f, 4f, 18f, 4.6f, 18f, 5.33f)
                verticalLineTo(12f)
                curveTo(14.69f, 12f, 12f, 14.69f, 12f, 18f)
                curveTo(12f, 19.54f, 12.58f, 20.94f, 13.54f, 22f)
                moveTo(22f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _BatteryMinus!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryMinus: ImageVector? = null
