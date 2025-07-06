package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleKeyboardShift: ImageVector
    get() {
        if (_AppleKeyboardShift != null) {
            return _AppleKeyboardShift!!
        }
        _AppleKeyboardShift = ImageVector.Builder(
            name = "AppleKeyboardShift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                verticalLineTo(12f)
                horizontalLineTo(17.17f)
                lineTo(12f, 6.83f)
                lineTo(6.83f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                moveTo(12f, 4f)
                lineTo(22f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                lineTo(12f, 4f)
                close()
            }
        }.build()

        return _AppleKeyboardShift!!
    }

@Suppress("ObjectPropertyName")
private var _AppleKeyboardShift: ImageVector? = null
