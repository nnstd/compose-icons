package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioOff: ImageVector
    get() {
        if (_RadioOff != null) {
            return _RadioOff!!
        }
        _RadioOff = ImageVector.Builder(
            name = "RadioOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(3f, 6.27f)
                curveTo(2.4f, 6.61f, 2f, 7.26f, 2f, 8f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 24f)
                lineTo(22f, 22.72f)
                lineTo(2.28f, 3f)
                lineTo(1f, 4.27f)
                moveTo(20f, 6f)
                horizontalLineTo(8.83f)
                lineTo(16.47f, 2.83f)
                lineTo(15.71f, 1f)
                lineTo(6.59f, 4.76f)
                lineTo(9.82f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(13.82f)
                lineTo(22f, 20.18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.11f, 6f, 20f, 6f)
                moveTo(4f, 8f)
                horizontalLineTo(4.73f)
                lineTo(8.73f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(7f, 14f)
                curveTo(8.66f, 14f, 10f, 15.34f, 10f, 17f)
                curveTo(10f, 18.66f, 8.66f, 20f, 7f, 20f)
                curveTo(5.34f, 20f, 4f, 18.66f, 4f, 17f)
                curveTo(4f, 15.34f, 5.34f, 14f, 7f, 14f)
                close()
            }
        }.build()

        return _RadioOff!!
    }

@Suppress("ObjectPropertyName")
private var _RadioOff: ImageVector? = null
