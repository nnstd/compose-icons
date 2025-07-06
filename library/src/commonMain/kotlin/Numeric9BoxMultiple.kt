package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric9BoxMultiple: ImageVector
    get() {
        if (_Numeric9BoxMultiple != null) {
            return _Numeric9BoxMultiple!!
        }
        _Numeric9BoxMultiple = ImageVector.Builder(
            name = "Numeric9BoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(15f, 5f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                verticalLineTo(9f)
                curveTo(11f, 10.11f, 11.9f, 11f, 13f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                verticalLineTo(7f)
                curveTo(17f, 5.89f, 16.1f, 5f, 15f, 5f)
                moveTo(21f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 3f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _Numeric9BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric9BoxMultiple: ImageVector? = null
