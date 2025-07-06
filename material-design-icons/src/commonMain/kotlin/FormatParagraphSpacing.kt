package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatParagraphSpacing: ImageVector
    get() {
        if (_FormatParagraphSpacing != null) {
            return _FormatParagraphSpacing!!
        }
        _FormatParagraphSpacing = ImageVector.Builder(
            name = "FormatParagraphSpacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                moveTo(3f, 2f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                moveTo(13f, 8f)
                horizontalLineTo(15f)
                lineTo(12f, 5f)
                lineTo(9f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                lineTo(12f, 16f)
                lineTo(15f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FormatParagraphSpacing!!
    }

@Suppress("ObjectPropertyName")
private var _FormatParagraphSpacing: ImageVector? = null
