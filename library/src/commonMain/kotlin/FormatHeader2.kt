package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeader2: ImageVector
    get() {
        if (_FormatHeader2 != null) {
            return _FormatHeader2!!
        }
        _FormatHeader2 = ImageVector.Builder(
            name = "FormatHeader2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(21f, 18f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 16f)
                curveTo(13f, 15.47f, 13.2f, 15f, 13.54f, 14.64f)
                lineTo(18.41f, 9.41f)
                curveTo(18.78f, 9.05f, 19f, 8.55f, 19f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 8f)
                horizontalLineTo(13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8f)
                curveTo(21f, 9.1f, 20.55f, 10.1f, 19.83f, 10.83f)
                lineTo(15f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FormatHeader2!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeader2: ImageVector? = null
