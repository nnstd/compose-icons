package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardCaps: ImageVector
    get() {
        if (_KeyboardCaps != null) {
            return _KeyboardCaps!!
        }
        _KeyboardCaps = ImageVector.Builder(
            name = "KeyboardCaps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                moveTo(12f, 8.41f)
                lineTo(16.59f, 13f)
                lineTo(18f, 11.58f)
                lineTo(12f, 5.58f)
                lineTo(6f, 11.58f)
                lineTo(7.41f, 13f)
                lineTo(12f, 8.41f)
                close()
            }
        }.build()

        return _KeyboardCaps!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardCaps: ImageVector? = null
