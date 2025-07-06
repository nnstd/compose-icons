package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpLeft: ImageVector
    get() {
        if (_ArrowUpLeft != null) {
            return _ArrowUpLeft!!
        }
        _ArrowUpLeft = ImageVector.Builder(
            name = "ArrowUpLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(13.5f)
                curveTo(9.91f, 20f, 7f, 17.09f, 7f, 13.5f)
                verticalLineTo(7.83f)
                lineTo(3.91f, 10.92f)
                lineTo(2.5f, 9.5f)
                lineTo(8f, 4f)
                lineTo(13.5f, 9.5f)
                lineTo(12.09f, 10.91f)
                lineTo(9f, 7.83f)
                verticalLineTo(13.5f)
                curveTo(9f, 16f, 11f, 18f, 13.5f, 18f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeft: ImageVector? = null
