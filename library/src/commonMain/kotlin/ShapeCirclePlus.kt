package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapeCirclePlus: ImageVector
    get() {
        if (_ShapeCirclePlus != null) {
            return _ShapeCirclePlus!!
        }
        _ShapeCirclePlus = ImageVector.Builder(
            name = "ShapeCirclePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 19f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                horizontalLineTo(19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5f)
                verticalLineTo(7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                moveTo(19f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ShapeCirclePlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeCirclePlus: ImageVector? = null
