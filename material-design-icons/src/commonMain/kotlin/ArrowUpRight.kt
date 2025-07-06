package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) {
            return _ArrowUpRight!!
        }
        _ArrowUpRight = ImageVector.Builder(
            name = "ArrowUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 9.5f)
                lineTo(20.09f, 10.92f)
                lineTo(17f, 7.83f)
                verticalLineTo(13.5f)
                curveTo(17f, 17.09f, 14.09f, 20f, 10.5f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                curveTo(13f, 18f, 15f, 16f, 15f, 13.5f)
                verticalLineTo(7.83f)
                lineTo(11.91f, 10.91f)
                lineTo(10.5f, 9.5f)
                lineTo(16f, 4f)
                lineTo(21.5f, 9.5f)
                close()
            }
        }.build()

        return _ArrowUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRight: ImageVector? = null
