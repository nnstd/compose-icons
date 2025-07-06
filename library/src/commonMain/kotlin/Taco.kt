package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Taco: ImageVector
    get() {
        if (_Taco != null) {
            return _Taco!!
        }
        _Taco = ImageVector.Builder(
            name = "Taco",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                curveTo(10.06f, 6f, 11.07f, 6.21f, 12f, 6.58f)
                curveTo(12.93f, 6.21f, 13.94f, 6f, 15f, 6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                moveTo(3f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 14f)
                curveTo(7f, 11.63f, 8.03f, 9.5f, 9.67f, 8.04f)
                lineTo(9f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14f)
                moveTo(19f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14f)
                curveTo(9f, 14.73f, 8.81f, 15.41f, 8.46f, 16f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Taco!!
    }

@Suppress("ObjectPropertyName")
private var _Taco: ImageVector? = null
