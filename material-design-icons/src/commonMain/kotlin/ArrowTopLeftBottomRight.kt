package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftBottomRight: ImageVector
    get() {
        if (_ArrowTopLeftBottomRight != null) {
            return _ArrowTopLeftBottomRight!!
        }
        _ArrowTopLeftBottomRight = ImageVector.Builder(
            name = "ArrowTopLeftBottomRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(17.59f)
                lineTo(6.41f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(6.41f)
                lineTo(17.59f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _ArrowTopLeftBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftBottomRight: ImageVector? = null
