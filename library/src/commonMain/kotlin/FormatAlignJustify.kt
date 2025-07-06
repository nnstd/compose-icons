package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAlignJustify: ImageVector
    get() {
        if (_FormatAlignJustify != null) {
            return _FormatAlignJustify!!
        }
        _FormatAlignJustify = ImageVector.Builder(
            name = "FormatAlignJustify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(3f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(3f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatAlignJustify!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAlignJustify: ImageVector? = null
