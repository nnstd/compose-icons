package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BatteryAlertVariant: ImageVector
    get() {
        if (_BatteryAlertVariant != null) {
            return _BatteryAlertVariant!!
        }
        _BatteryAlertVariant = ImageVector.Builder(
            name = "BatteryAlertVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.67f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(5.33f)
                curveTo(4.6f, 4f, 4f, 4.6f, 4f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(4f, 21.4f, 4.6f, 22f, 5.33f, 22f)
                horizontalLineTo(14.67f)
                curveTo(15.4f, 22f, 16f, 21.4f, 16f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(16f, 4.6f, 15.4f, 4f, 14.67f, 4f)
                moveTo(21f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                moveTo(21f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _BatteryAlertVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryAlertVariant: ImageVector? = null
