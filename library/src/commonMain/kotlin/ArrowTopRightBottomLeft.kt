package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightBottomLeft: ImageVector
    get() {
        if (_ArrowTopRightBottomLeft != null) {
            return _ArrowTopRightBottomLeft!!
        }
        _ArrowTopRightBottomLeft = ImageVector.Builder(
            name = "ArrowTopRightBottomLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(17.59f)
                lineTo(17.59f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(6.41f)
                lineTo(6.41f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _ArrowTopRightBottomLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightBottomLeft: ImageVector? = null
