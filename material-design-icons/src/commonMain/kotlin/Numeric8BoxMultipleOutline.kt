package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric8BoxMultipleOutline: ImageVector
    get() {
        if (_Numeric8BoxMultipleOutline != null) {
            return _Numeric8BoxMultipleOutline!!
        }
        _Numeric8BoxMultipleOutline = ImageVector.Builder(
            name = "Numeric8BoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(13f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 15f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8.5f)
                verticalLineTo(7f)
                curveTo(17f, 5.89f, 16.1f, 5f, 15f, 5f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 11.5f)
                verticalLineTo(13f)
                curveTo(11f, 14.11f, 11.9f, 15f, 13f, 15f)
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

        return _Numeric8BoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric8BoxMultipleOutline: ImageVector? = null
