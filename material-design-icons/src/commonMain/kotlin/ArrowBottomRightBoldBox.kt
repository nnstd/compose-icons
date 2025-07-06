package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRightBoldBox: ImageVector
    get() {
        if (_ArrowBottomRightBoldBox != null) {
            return _ArrowBottomRightBoldBox!!
        }
        _ArrowBottomRightBoldBox = ImageVector.Builder(
            name = "ArrowBottomRightBoldBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                moveTo(15.8f, 16f)
                verticalLineTo(8.9f)
                lineTo(13.7f, 11f)
                lineTo(9.8f, 7.2f)
                lineTo(7f, 10f)
                lineTo(10.8f, 13.9f)
                lineTo(8.7f, 16f)
                horizontalLineTo(15.8f)
                close()
            }
        }.build()

        return _ArrowBottomRightBoldBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRightBoldBox: ImageVector? = null
