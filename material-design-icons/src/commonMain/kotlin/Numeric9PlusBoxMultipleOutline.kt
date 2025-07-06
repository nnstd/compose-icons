package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric9PlusBoxMultipleOutline: ImageVector
    get() {
        if (_Numeric9PlusBoxMultipleOutline != null) {
            return _Numeric9PlusBoxMultipleOutline!!
        }
        _Numeric9PlusBoxMultipleOutline = ImageVector.Builder(
            name = "Numeric9PlusBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
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
                moveTo(11f, 9f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                moveTo(14f, 12f)
                verticalLineTo(8f)
                curveTo(14f, 6.89f, 13.1f, 6f, 12f, 6f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                verticalLineTo(9f)
                curveTo(9f, 10.11f, 9.9f, 11f, 11f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
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

        return _Numeric9PlusBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric9PlusBoxMultipleOutline: ImageVector? = null
