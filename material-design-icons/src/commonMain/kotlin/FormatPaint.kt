package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatPaint: ImageVector
    get() {
        if (_FormatPaint != null) {
            return _FormatPaint!!
        }
        _FormatPaint = ImageVector.Builder(
            name = "FormatPaint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 2f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 22f)
                horizontalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 21f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FormatPaint!!
    }

@Suppress("ObjectPropertyName")
private var _FormatPaint: ImageVector? = null
