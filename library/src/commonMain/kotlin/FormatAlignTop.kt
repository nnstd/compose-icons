package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAlignTop: ImageVector
    get() {
        if (_FormatAlignTop != null) {
            return _FormatAlignTop!!
        }
        _FormatAlignTop = ImageVector.Builder(
            name = "FormatAlignTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15f)
                lineTo(15.5f, 17.5f)
                lineTo(16.92f, 16.08f)
                lineTo(12f, 11.16f)
                lineTo(7.08f, 16.08f)
                lineTo(8.5f, 17.5f)
                lineTo(11f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(3f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FormatAlignTop!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAlignTop: ImageVector? = null
