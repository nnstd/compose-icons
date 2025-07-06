package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SlashForward: ImageVector
    get() {
        if (_SlashForward != null) {
            return _SlashForward!!
        }
        _SlashForward = ImageVector.Builder(
            name = "SlashForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                lineTo(14.9f, 3f)
                horizontalLineTo(17f)
                lineTo(9.1f, 21f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _SlashForward!!
    }

@Suppress("ObjectPropertyName")
private var _SlashForward: ImageVector? = null
