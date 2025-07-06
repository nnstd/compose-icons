package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatWrapInline: ImageVector
    get() {
        if (_FormatWrapInline != null) {
            return _FormatWrapInline!!
        }
        _FormatWrapInline = ImageVector.Builder(
            name = "FormatWrapInline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                lineTo(13f, 17f)
                horizontalLineTo(3f)
                lineTo(8f, 7f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(21f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatWrapInline!!
    }

@Suppress("ObjectPropertyName")
private var _FormatWrapInline: ImageVector? = null
