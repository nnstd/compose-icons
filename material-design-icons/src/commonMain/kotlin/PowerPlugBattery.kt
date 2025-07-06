package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerPlugBattery: ImageVector
    get() {
        if (_PowerPlugBattery != null) {
            return _PowerPlugBattery!!
        }
        _PowerPlugBattery = ImageVector.Builder(
            name = "PowerPlugBattery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(12f, 9.35f, 11.57f, 8.7f, 11f, 8.32f)
                curveTo(10.7f, 8.12f, 10.35f, 8f, 10f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                curveTo(1f, 8f, 0f, 9f, 0f, 10f)
                verticalLineTo(15.5f)
                lineTo(3.5f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(8.5f)
                verticalLineTo(19f)
                lineTo(12f, 15.5f)
                verticalLineTo(10f)
                moveTo(12.33f, 4f)
                curveTo(12.22f, 4f, 12.11f, 4f, 12f, 4.04f)
                verticalLineTo(6.59f)
                curveTo(12.3f, 6.77f, 12.56f, 7f, 12.79f, 7.21f)
                curveTo(13.44f, 7.87f, 14f, 8.85f, 14f, 10f)
                verticalLineTo(16.33f)
                lineTo(11f, 19.33f)
                verticalLineTo(20.67f)
                curveTo(11f, 21.4f, 11.6f, 22f, 12.33f, 22f)
                horizontalLineTo(21.67f)
                curveTo(22f, 22f, 22.36f, 21.86f, 22.61f, 21.61f)
                curveTo(22.86f, 21.36f, 23f, 21f, 23f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(23f, 4.6f, 22.4f, 4f, 21.67f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(12.33f)
                close()
            }
        }.build()

        return _PowerPlugBattery!!
    }

@Suppress("ObjectPropertyName")
private var _PowerPlugBattery: ImageVector? = null
