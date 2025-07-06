package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRight: ImageVector
    get() {
        if (_ArrowBottomRight != null) {
            return _ArrowBottomRight!!
        }
        _ArrowBottomRight = ImageVector.Builder(
            name = "ArrowBottomRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6.41f)
                lineTo(6.41f, 5f)
                lineTo(17f, 15.59f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(15.59f)
                lineTo(5f, 6.41f)
                close()
            }
        }.build()

        return _ArrowBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRight: ImageVector? = null
