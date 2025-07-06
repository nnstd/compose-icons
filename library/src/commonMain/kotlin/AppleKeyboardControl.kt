package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleKeyboardControl: ImageVector
    get() {
        if (_AppleKeyboardControl != null) {
            return _AppleKeyboardControl!!
        }
        _AppleKeyboardControl = ImageVector.Builder(
            name = "AppleKeyboardControl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 11.78f)
                lineTo(18.36f, 13.19f)
                lineTo(12f, 6.83f)
                lineTo(5.64f, 13.19f)
                lineTo(4.22f, 11.78f)
                lineTo(12f, 4f)
                lineTo(19.78f, 11.78f)
                close()
            }
        }.build()

        return _AppleKeyboardControl!!
    }

@Suppress("ObjectPropertyName")
private var _AppleKeyboardControl: ImageVector? = null
