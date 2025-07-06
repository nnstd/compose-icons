package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatVerticalAlignTop: ImageVector
    get() {
        if (_FormatVerticalAlignTop != null) {
            return _FormatVerticalAlignTop!!
        }
        _FormatVerticalAlignTop = ImageVector.Builder(
            name = "FormatVerticalAlignTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                lineTo(12f, 7f)
                lineTo(8f, 11f)
                moveTo(4f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _FormatVerticalAlignTop!!
    }

@Suppress("ObjectPropertyName")
private var _FormatVerticalAlignTop: ImageVector? = null
