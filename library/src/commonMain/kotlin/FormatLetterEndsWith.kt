package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatLetterEndsWith: ImageVector
    get() {
        if (_FormatLetterEndsWith != null) {
            return _FormatLetterEndsWith!!
        }
        _FormatLetterEndsWith = ImageVector.Builder(
            name = "FormatLetterEndsWith",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.14f, 4f)
                lineTo(6.43f, 16f)
                horizontalLineTo(8.36f)
                lineTo(9.32f, 13.43f)
                horizontalLineTo(14.67f)
                lineTo(15.64f, 16f)
                horizontalLineTo(17.57f)
                lineTo(12.86f, 4f)
                moveTo(12f, 6.29f)
                lineTo(14.03f, 11.71f)
                horizontalLineTo(9.96f)
                moveTo(20f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _FormatLetterEndsWith!!
    }

@Suppress("ObjectPropertyName")
private var _FormatLetterEndsWith: ImageVector? = null
