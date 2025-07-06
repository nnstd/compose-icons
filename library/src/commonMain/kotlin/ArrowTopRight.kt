package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRight: ImageVector
    get() {
        if (_ArrowTopRight != null) {
            return _ArrowTopRight!!
        }
        _ArrowTopRight = ImageVector.Builder(
            name = "ArrowTopRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 17.59f)
                lineTo(15.59f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(8.41f)
                lineTo(6.41f, 19f)
                lineTo(5f, 17.59f)
                close()
            }
        }.build()

        return _ArrowTopRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRight: ImageVector? = null
