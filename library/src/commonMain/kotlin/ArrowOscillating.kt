package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowOscillating: ImageVector
    get() {
        if (_ArrowOscillating != null) {
            return _ArrowOscillating!!
        }
        _ArrowOscillating = ImageVector.Builder(
            name = "ArrowOscillating",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14f)
                horizontalLineTo(9f)
                lineTo(5f, 18f)
                lineTo(1f, 14f)
                horizontalLineTo(4f)
                curveTo(4f, 11.3f, 5.7f, 6.6f, 11f, 6.1f)
                verticalLineTo(8.1f)
                curveTo(7.6f, 8.6f, 6f, 11.9f, 6f, 14f)
                moveTo(20f, 14f)
                curveTo(20f, 11.3f, 18.3f, 6.6f, 13f, 6.1f)
                verticalLineTo(8.1f)
                curveTo(16.4f, 8.7f, 18f, 11.9f, 18f, 14f)
                horizontalLineTo(15f)
                lineTo(19f, 18f)
                lineTo(23f, 14f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowOscillating!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowOscillating: ImageVector? = null
