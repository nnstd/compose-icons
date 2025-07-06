package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric9PlusCircleOutline: ImageVector
    get() {
        if (_Numeric9PlusCircleOutline != null) {
            return _Numeric9PlusCircleOutline!!
        }
        _Numeric9PlusCircleOutline = ImageVector.Builder(
            name = "Numeric9PlusCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 16.11f, 11.1f, 17f, 10f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                verticalLineTo(9f)
                curveTo(6f, 7.89f, 6.9f, 7f, 8f, 7f)
                horizontalLineTo(10f)
                moveTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _Numeric9PlusCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric9PlusCircleOutline: ImageVector? = null
