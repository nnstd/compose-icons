package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAnnotationPlus: ImageVector
    get() {
        if (_FormatAnnotationPlus != null) {
            return _FormatAnnotationPlus!!
        }
        _FormatAnnotationPlus = ImageVector.Builder(
            name = "FormatAnnotationPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 7f)
                horizontalLineTo(10.5f)
                lineTo(16f, 21f)
                horizontalLineTo(13.6f)
                lineTo(12.5f, 18f)
                horizontalLineTo(6.3f)
                lineTo(5.2f, 21f)
                horizontalLineTo(3f)
                lineTo(8.5f, 7f)
                moveTo(7.1f, 16f)
                horizontalLineTo(11.9f)
                lineTo(9.5f, 9.7f)
                lineTo(7.1f, 16f)
                moveTo(22f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _FormatAnnotationPlus!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAnnotationPlus: ImageVector? = null
