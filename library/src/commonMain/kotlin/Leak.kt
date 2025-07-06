package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Leak: ImageVector
    get() {
        if (_Leak != null) {
            return _Leak!!
        }
        _Leak = ImageVector.Builder(
            name = "Leak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3f)
                moveTo(14f, 3f)
                horizontalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                verticalLineTo(14f)
                curveTo(9.08f, 14f, 14f, 9.07f, 14f, 3f)
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8f)
                verticalLineTo(10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3f)
                moveTo(10f, 21f)
                horizontalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                verticalLineTo(10f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 21f)
                moveTo(18f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 21f)
                moveTo(14f, 21f)
                horizontalLineTo(16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16f)
                verticalLineTo(14f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 21f)
                close()
            }
        }.build()

        return _Leak!!
    }

@Suppress("ObjectPropertyName")
private var _Leak: ImageVector? = null
