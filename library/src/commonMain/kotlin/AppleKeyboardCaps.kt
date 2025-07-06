package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleKeyboardCaps: ImageVector
    get() {
        if (_AppleKeyboardCaps != null) {
            return _AppleKeyboardCaps!!
        }
        _AppleKeyboardCaps = ImageVector.Builder(
            name = "AppleKeyboardCaps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                verticalLineTo(8f)
                horizontalLineTo(17.17f)
                lineTo(12f, 2.83f)
                lineTo(6.83f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                moveTo(12f, 0f)
                lineTo(22f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                lineTo(12f, 0f)
                moveTo(7f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                moveTo(15f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _AppleKeyboardCaps!!
    }

@Suppress("ObjectPropertyName")
private var _AppleKeyboardCaps: ImageVector? = null
