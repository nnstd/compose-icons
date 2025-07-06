package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric4BoxMultiple: ImageVector
    get() {
        if (_Numeric4BoxMultiple != null) {
            return _Numeric4BoxMultiple!!
        }
        _Numeric4BoxMultiple = ImageVector.Builder(
            name = "Numeric4BoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(21f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 3f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                horizontalLineTo(21f)
                moveTo(15f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Numeric4BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric4BoxMultiple: ImageVector? = null
