package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GradientVertical: ImageVector
    get() {
        if (_GradientVertical != null) {
            return _GradientVertical!!
        }
        _GradientVertical = ImageVector.Builder(
            name = "GradientVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(9f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(13f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(9f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(17f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                moveTo(19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _GradientVertical!!
    }

@Suppress("ObjectPropertyName")
private var _GradientVertical: ImageVector? = null
