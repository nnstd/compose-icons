package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAlignRight: ImageVector
    get() {
        if (_FormatAlignRight != null) {
            return _FormatAlignRight!!
        }
        _FormatAlignRight = ImageVector.Builder(
            name = "FormatAlignRight",
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
                moveTo(9f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(9f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatAlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAlignRight: ImageVector? = null
