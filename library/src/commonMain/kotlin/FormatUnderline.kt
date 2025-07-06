package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatUnderline: ImageVector
    get() {
        if (_FormatUnderline != null) {
            return _FormatUnderline!!
        }
        _FormatUnderline = ImageVector.Builder(
            name = "FormatUnderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                moveTo(12f, 17f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(15.5f)
                verticalLineTo(11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                close()
            }
        }.build()

        return _FormatUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _FormatUnderline: ImageVector? = null
