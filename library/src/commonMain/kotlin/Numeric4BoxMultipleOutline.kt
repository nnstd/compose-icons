package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric4BoxMultipleOutline: ImageVector
    get() {
        if (_Numeric4BoxMultipleOutline != null) {
            return _Numeric4BoxMultipleOutline!!
        }
        _Numeric4BoxMultipleOutline = ImageVector.Builder(
            name = "Numeric4BoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 1f)
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
                moveTo(3f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 23f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Numeric4BoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric4BoxMultipleOutline: ImageVector? = null
