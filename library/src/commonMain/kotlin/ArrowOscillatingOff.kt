package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowOscillatingOff: ImageVector
    get() {
        if (_ArrowOscillatingOff != null) {
            return _ArrowOscillatingOff!!
        }
        _ArrowOscillatingOff = ImageVector.Builder(
            name = "ArrowOscillatingOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8.1f)
                verticalLineTo(6.1f)
                curveTo(18.3f, 6.6f, 20f, 11.4f, 20f, 14f)
                horizontalLineTo(23f)
                lineTo(20.1f, 16.9f)
                lineTo(17.2f, 14f)
                horizontalLineTo(18f)
                curveTo(18f, 11.9f, 16.4f, 8.6f, 13f, 8.1f)
                moveTo(7.8f, 7.1f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(6.3f, 8.2f)
                curveTo(4.7f, 10f, 4f, 12.4f, 4f, 14f)
                horizontalLineTo(1f)
                lineTo(5f, 18f)
                lineTo(9f, 14f)
                horizontalLineTo(6f)
                curveTo(6f, 12.7f, 6.6f, 11f, 7.9f, 9.7f)
                lineTo(20.9f, 22.7f)
                lineTo(22.2f, 21.4f)
                lineTo(9.3f, 8.7f)
                lineTo(7.8f, 7.1f)
                moveTo(11f, 6.1f)
                lineTo(9.5f, 6.4f)
                lineTo(11f, 7.8f)
                verticalLineTo(6.1f)
                close()
            }
        }.build()

        return _ArrowOscillatingOff!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOscillatingOff: ImageVector? = null
