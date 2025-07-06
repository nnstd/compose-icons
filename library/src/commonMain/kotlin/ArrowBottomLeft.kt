package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomLeft: ImageVector
    get() {
        if (_ArrowBottomLeft != null) {
            return _ArrowBottomLeft!!
        }
        _ArrowBottomLeft = ImageVector.Builder(
            name = "ArrowBottomLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6.41f)
                lineTo(17.59f, 5f)
                lineTo(7f, 15.59f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(8.41f)
                lineTo(19f, 6.41f)
                close()
            }
        }.build()

        return _ArrowBottomLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomLeft: ImageVector? = null
