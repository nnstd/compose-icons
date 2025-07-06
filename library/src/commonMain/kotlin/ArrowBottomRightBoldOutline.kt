package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRightBoldOutline: ImageVector
    get() {
        if (_ArrowBottomRightBoldOutline != null) {
            return _ArrowBottomRightBoldOutline!!
        }
        _ArrowBottomRightBoldOutline = ImageVector.Builder(
            name = "ArrowBottomRightBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.88f, 15.54f)
                lineTo(4.22f, 9.88f)
                lineTo(9.88f, 4.22f)
                lineTo(15.54f, 9.88f)
                lineTo(19.78f, 5.64f)
                verticalLineTo(19.78f)
                horizontalLineTo(5.64f)
                lineTo(9.88f, 15.54f)
                moveTo(17.66f, 10.59f)
                lineTo(15.54f, 12.71f)
                lineTo(9.88f, 7.05f)
                lineTo(7.05f, 9.88f)
                lineTo(12.71f, 15.54f)
                lineTo(10.59f, 17.66f)
                horizontalLineTo(17.66f)
                verticalLineTo(10.59f)
                close()
            }
        }.build()

        return _ArrowBottomRightBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRightBoldOutline: ImageVector? = null
