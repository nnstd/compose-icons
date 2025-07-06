package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHorizontalAlignRight: ImageVector
    get() {
        if (_FormatHorizontalAlignRight != null) {
            return _FormatHorizontalAlignRight!!
        }
        _FormatHorizontalAlignRight = ImageVector.Builder(
            name = "FormatHorizontalAlignRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                lineTo(17f, 12f)
                lineTo(13f, 8f)
                moveTo(19f, 20f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FormatHorizontalAlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHorizontalAlignRight: ImageVector? = null
