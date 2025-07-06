package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hook: ImageVector
    get() {
        if (_Hook != null) {
            return _Hook!!
        }
        _Hook = ImageVector.Builder(
            name = "Hook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveTo(18f, 7.82f, 16.76f, 9.41f, 15f, 9.86f)
                verticalLineTo(17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                verticalLineTo(12f)
                lineTo(10f, 17f)
                horizontalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17f)
                verticalLineTo(9.86f)
                curveTo(11.23f, 9.4f, 10f, 7.8f, 10f, 5.97f)
                curveTo(10f, 3.76f, 11.8f, 2f, 14f, 2f)
                curveTo(16.22f, 2f, 18f, 3.79f, 18f, 6f)
                moveTo(14f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                close()
            }
        }.build()

        return _Hook!!
    }

@Suppress("ObjectPropertyName")
private var _Hook: ImageVector? = null
