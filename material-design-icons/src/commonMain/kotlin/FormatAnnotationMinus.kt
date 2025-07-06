package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAnnotationMinus: ImageVector
    get() {
        if (_FormatAnnotationMinus != null) {
            return _FormatAnnotationMinus!!
        }
        _FormatAnnotationMinus = ImageVector.Builder(
            name = "FormatAnnotationMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 7f)
                horizontalLineTo(8.5f)
                lineTo(3f, 21f)
                horizontalLineTo(5.2f)
                lineTo(6.3f, 18f)
                horizontalLineTo(12.5f)
                lineTo(13.6f, 21f)
                horizontalLineTo(16f)
                lineTo(10.5f, 7f)
                moveTo(7.1f, 16f)
                lineTo(9.5f, 9.7f)
                lineTo(11.9f, 16f)
                horizontalLineTo(7.1f)
                moveTo(22f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FormatAnnotationMinus!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAnnotationMinus: ImageVector? = null
