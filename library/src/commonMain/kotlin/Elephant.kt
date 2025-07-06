package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Elephant: ImageVector
    get() {
        if (_Elephant != null) {
            return _Elephant!!
        }
        _Elephant = ImageVector.Builder(
            name = "Elephant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 15.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(18.5f, 6.57f, 16.43f, 5f, 14.5f, 5f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 14f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 14.5f)
                verticalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(19.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _Elephant!!
    }

@Suppress("ObjectPropertyName")
private var _Elephant: ImageVector? = null
