package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SlashForwardBox: ImageVector
    get() {
        if (_SlashForwardBox != null) {
            return _SlashForwardBox!!
        }
        _SlashForwardBox = ImageVector.Builder(
            name = "SlashForwardBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(9.3f, 19f)
                horizontalLineTo(7f)
                lineTo(14.7f, 5f)
                horizontalLineTo(17f)
                lineTo(9.3f, 19f)
                close()
            }
        }.build()

        return _SlashForwardBox!!
    }

@Suppress("ObjectPropertyName")
private var _SlashForwardBox: ImageVector? = null
