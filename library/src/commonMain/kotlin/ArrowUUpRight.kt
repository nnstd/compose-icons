package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUUpRight: ImageVector
    get() {
        if (_ArrowUUpRight != null) {
            return _ArrowUUpRight!!
        }
        _ArrowUUpRight = ImageVector.Builder(
            name = "ArrowUUpRight",
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
                reflectiveCurveTo(4f, 17.09f, 4f, 13.5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(13.5f)
                curveTo(6f, 16f, 8f, 18f, 10.5f, 18f)
                reflectiveCurveTo(15f, 16f, 15f, 13.5f)
                verticalLineTo(7.83f)
                lineTo(11.91f, 10.91f)
                lineTo(10.5f, 9.5f)
                lineTo(16f, 4f)
                lineTo(21.5f, 9.5f)
                close()
            }
        }.build()

        return _ArrowUUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUUpRight: ImageVector? = null
