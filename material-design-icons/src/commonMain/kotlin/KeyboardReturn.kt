package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardReturn: ImageVector
    get() {
        if (_KeyboardReturn != null) {
            return _KeyboardReturn!!
        }
        _KeyboardReturn = ImageVector.Builder(
            name = "KeyboardReturn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(5.83f)
                lineTo(9.41f, 7.41f)
                lineTo(8f, 6f)
                lineTo(2f, 12f)
                lineTo(8f, 18f)
                lineTo(9.41f, 16.58f)
                lineTo(5.83f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _KeyboardReturn!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardReturn: ImageVector? = null
