package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric0BoxMultiple: ImageVector
    get() {
        if (_Numeric0BoxMultiple != null) {
            return _Numeric0BoxMultiple!!
        }
        _Numeric0BoxMultiple = ImageVector.Builder(
            name = "Numeric0BoxMultiple",
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
                moveTo(13f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 15f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                horizontalLineTo(13f)
                moveTo(13f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _Numeric0BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric0BoxMultiple: ImageVector? = null
