package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bowling: ImageVector
    get() {
        if (_Bowling != null) {
            return _Bowling!!
        }
        _Bowling = ImageVector.Builder(
            name = "Bowling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 11f)
                moveTo(12f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(5.93f, 8.5f)
                curveTo(5.38f, 9.45f, 5.71f, 10.67f, 6.66f, 11.22f)
                curveTo(7.62f, 11.78f, 8.84f, 11.45f, 9.4f, 10.5f)
                curveTo(9.95f, 9.53f, 9.62f, 8.31f, 8.66f, 7.76f)
                curveTo(7.71f, 7.21f, 6.5f, 7.53f, 5.93f, 8.5f)
                close()
            }
        }.build()

        return _Bowling!!
    }

@Suppress("ObjectPropertyName")
private var _Bowling: ImageVector? = null
