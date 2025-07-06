package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerPlugBatteryOutline: ImageVector
    get() {
        if (_PowerPlugBatteryOutline != null) {
            return _PowerPlugBatteryOutline!!
        }
        _PowerPlugBatteryOutline = ImageVector.Builder(
            name = "PowerPlugBatteryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 8.32f)
                curveTo(11.57f, 8.7f, 12f, 9.35f, 12f, 10f)
                verticalLineTo(15.5f)
                lineTo(8.5f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(3.5f)
                verticalLineTo(19f)
                lineTo(0f, 15.5f)
                verticalLineTo(10f)
                curveTo(0f, 9f, 1f, 8f, 2f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                curveTo(10.35f, 8f, 10.7f, 8.12f, 11f, 8.32f)
                moveTo(7.09f, 17.59f)
                lineTo(10f, 14.67f)
                verticalLineTo(10.09f)
                curveTo(10f, 10.06f, 9.95f, 10f, 9.92f, 10f)
                horizontalLineTo(2.09f)
                curveTo(2.06f, 10f, 2f, 10.06f, 2f, 10.09f)
                verticalLineTo(14.67f)
                lineTo(5.33f, 18f)
                horizontalLineTo(6.67f)
                lineTo(7.09f, 17.59f)
                moveTo(12f, 4.04f)
                curveTo(12.11f, 4f, 12.22f, 4f, 12.33f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(21.67f)
                curveTo(22.4f, 4f, 23f, 4.6f, 23f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(23f, 21f, 22.86f, 21.36f, 22.61f, 21.61f)
                curveTo(22.36f, 21.86f, 22f, 22f, 21.67f, 22f)
                horizontalLineTo(12.33f)
                curveTo(11.6f, 22f, 11f, 21.4f, 11f, 20.67f)
                verticalLineTo(19.33f)
                lineTo(13f, 17.33f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(4.04f)
                close()
            }
        }.build()

        return _PowerPlugBatteryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PowerPlugBatteryOutline: ImageVector? = null
