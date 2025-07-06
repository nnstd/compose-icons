package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatLetterSpacingVariant: ImageVector
    get() {
        if (_FormatLetterSpacingVariant != null) {
            return _FormatLetterSpacingVariant!!
        }
        _FormatLetterSpacingVariant = ImageVector.Builder(
            name = "FormatLetterSpacingVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                moveTo(4f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                moveTo(10f, 13.7f)
                horizontalLineTo(14f)
                lineTo(12f, 8.3f)
                lineTo(10f, 13.7f)
                moveTo(11.2f, 6f)
                horizontalLineTo(12.9f)
                lineTo(17.6f, 18f)
                horizontalLineTo(15.6f)
                lineTo(14.7f, 15.4f)
                horizontalLineTo(9.4f)
                lineTo(8.5f, 18f)
                horizontalLineTo(6.5f)
                lineTo(11.2f, 6f)
                close()
            }
        }.build()

        return _FormatLetterSpacingVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FormatLetterSpacingVariant: ImageVector? = null
