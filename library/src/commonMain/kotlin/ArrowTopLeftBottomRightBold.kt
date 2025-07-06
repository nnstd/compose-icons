package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftBottomRightBold: ImageVector
    get() {
        if (_ArrowTopLeftBottomRightBold != null) {
            return _ArrowTopLeftBottomRightBold!!
        }
        _ArrowTopLeftBottomRightBold = ImageVector.Builder(
            name = "ArrowTopLeftBottomRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.83f, 8.66f)
                lineTo(3f, 11.5f)
                verticalLineTo(3f)
                horizontalLineTo(11.5f)
                lineTo(8.66f, 5.83f)
                lineTo(18.17f, 15.34f)
                lineTo(21f, 12.5f)
                verticalLineTo(21f)
                horizontalLineTo(12.5f)
                lineTo(15.34f, 18.17f)
                lineTo(5.83f, 8.66f)
                close()
            }
        }.build()

        return _ArrowTopLeftBottomRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftBottomRightBold: ImageVector? = null
