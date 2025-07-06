package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cast: ImageVector
    get() {
        if (_Cast != null) {
            return _Cast!!
        }
        _Cast = ImageVector.Builder(
            name = "Cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 10f)
                verticalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                horizontalLineTo(12f)
                curveTo(12f, 14.92f, 7.07f, 10f, 1f, 10f)
                moveTo(1f, 14f)
                verticalLineTo(16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21f)
                horizontalLineTo(8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 14f)
                moveTo(1f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 18f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(1.89f, 3f, 1f, 3.89f, 1f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                verticalLineTo(5f)
                curveTo(23f, 3.89f, 22.1f, 3f, 21f, 3f)
                close()
            }
        }.build()

        return _Cast!!
    }

@Suppress("ObjectPropertyName")
private var _Cast: ImageVector? = null
