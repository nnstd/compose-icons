package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatAlignMiddle: ImageVector
    get() {
        if (_FormatAlignMiddle != null) {
            return _FormatAlignMiddle!!
        }
        _FormatAlignMiddle = ImageVector.Builder(
            name = "FormatAlignMiddle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                lineTo(15f, 4f)
                lineTo(16.42f, 5.42f)
                lineTo(12f, 9.84f)
                lineTo(7.58f, 5.42f)
                lineTo(9f, 4f)
                lineTo(11f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(13f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                lineTo(9f, 20f)
                lineTo(7.58f, 18.58f)
                lineTo(12f, 14.16f)
                lineTo(16.42f, 18.58f)
                lineTo(15f, 20f)
                lineTo(13f, 18f)
                close()
            }
        }.build()

        return _FormatAlignMiddle!!
    }

@Suppress("ObjectPropertyName")
private var _FormatAlignMiddle: ImageVector? = null
