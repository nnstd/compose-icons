package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeader3: ImageVector
    get() {
        if (_FormatHeader3 != null) {
            return _FormatHeader3!!
        }
        _FormatHeader3 = ImageVector.Builder(
            name = "FormatHeader3",
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
                moveTo(15f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                close()
            }
        }.build()

        return _FormatHeader3!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeader3: ImageVector? = null
