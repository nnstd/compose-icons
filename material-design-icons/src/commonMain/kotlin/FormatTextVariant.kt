package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextVariant: ImageVector
    get() {
        if (_FormatTextVariant != null) {
            return _FormatTextVariant!!
        }
        _FormatTextVariant = ImageVector.Builder(
            name = "FormatTextVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.6f, 14f)
                lineTo(12f, 7.7f)
                lineTo(14.4f, 14f)
                moveTo(11f, 5f)
                lineTo(5.5f, 19f)
                horizontalLineTo(7.7f)
                lineTo(8.8f, 16f)
                horizontalLineTo(15f)
                lineTo(16.1f, 19f)
                horizontalLineTo(18.3f)
                lineTo(13f, 5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FormatTextVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextVariant: ImageVector? = null
