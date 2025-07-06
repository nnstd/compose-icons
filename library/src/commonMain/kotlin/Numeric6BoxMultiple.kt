package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric6BoxMultiple: ImageVector
    get() {
        if (_Numeric6BoxMultiple != null) {
            return _Numeric6BoxMultiple!!
        }
        _Numeric6BoxMultiple = ImageVector.Builder(
            name = "Numeric6BoxMultiple",
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
                verticalLineTo(11f)
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
                moveTo(13f, 15f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                verticalLineTo(11f)
                curveTo(17f, 9.89f, 16.1f, 9f, 15f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                verticalLineTo(13f)
                curveTo(11f, 14.11f, 11.9f, 15f, 13f, 15f)
                close()
            }
        }.build()

        return _Numeric6BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric6BoxMultiple: ImageVector? = null
