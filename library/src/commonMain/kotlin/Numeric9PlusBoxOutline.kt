package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric9PlusBoxOutline: ImageVector
    get() {
        if (_Numeric9PlusBoxOutline != null) {
            return _Numeric9PlusBoxOutline!!
        }
        _Numeric9PlusBoxOutline = ImageVector.Builder(
            name = "Numeric9PlusBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(9f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                moveTo(12f, 14f)
                verticalLineTo(10f)
                curveTo(12f, 8.89f, 11.1f, 8f, 10f, 8f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 10f)
                verticalLineTo(11f)
                curveTo(7f, 12.11f, 7.9f, 13f, 9f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
        }.build()

        return _Numeric9PlusBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric9PlusBoxOutline: ImageVector? = null
