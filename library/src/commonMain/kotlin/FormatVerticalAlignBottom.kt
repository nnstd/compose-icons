package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatVerticalAlignBottom: ImageVector
    get() {
        if (_FormatVerticalAlignBottom != null) {
            return _FormatVerticalAlignBottom!!
        }
        _FormatVerticalAlignBottom = ImageVector.Builder(
            name = "FormatVerticalAlignBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                lineTo(12f, 17f)
                lineTo(16f, 13f)
                moveTo(4f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _FormatVerticalAlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _FormatVerticalAlignBottom: ImageVector? = null
