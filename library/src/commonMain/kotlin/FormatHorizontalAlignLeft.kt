package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHorizontalAlignLeft: ImageVector
    get() {
        if (_FormatHorizontalAlignLeft != null) {
            return _FormatHorizontalAlignLeft!!
        }
        _FormatHorizontalAlignLeft = ImageVector.Builder(
            name = "FormatHorizontalAlignLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                lineTo(7f, 12f)
                lineTo(11f, 16f)
                moveTo(3f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FormatHorizontalAlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHorizontalAlignLeft: ImageVector? = null
