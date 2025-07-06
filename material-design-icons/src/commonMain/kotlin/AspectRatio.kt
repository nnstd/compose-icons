package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AspectRatio: ImageVector
    get() {
        if (_AspectRatio != null) {
            return _AspectRatio!!
        }
        _AspectRatio = ImageVector.Builder(
            name = "AspectRatio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                moveTo(7f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                moveTo(21f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _AspectRatio!!
    }

@Suppress("ObjectPropertyName")
private var _AspectRatio: ImageVector? = null
