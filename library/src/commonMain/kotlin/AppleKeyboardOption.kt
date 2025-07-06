package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleKeyboardOption: ImageVector
    get() {
        if (_AppleKeyboardOption != null) {
            return _AppleKeyboardOption!!
        }
        _AppleKeyboardOption = ImageVector.Builder(
            name = "AppleKeyboardOption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(9.11f)
                lineTo(16.15f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(14.88f)
                lineTo(7.84f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(14f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _AppleKeyboardOption!!
    }

@Suppress("ObjectPropertyName")
private var _AppleKeyboardOption: ImageVector? = null
