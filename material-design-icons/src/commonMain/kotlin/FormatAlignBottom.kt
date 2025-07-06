package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAlignBottom: ImageVector
    get() {
        if (_FormatAlignBottom != null) {
            return _FormatAlignBottom!!
        }
        _FormatAlignBottom = ImageVector.Builder(
            name = "FormatAlignBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                lineTo(15.5f, 6.5f)
                lineTo(16.92f, 7.92f)
                lineTo(12f, 12.84f)
                lineTo(7.08f, 7.92f)
                lineTo(8.5f, 6.5f)
                lineTo(11f, 9f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(3f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatAlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAlignBottom: ImageVector? = null
