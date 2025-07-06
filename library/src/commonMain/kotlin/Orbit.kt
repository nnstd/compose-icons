package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Orbit: ImageVector
    get() {
        if (_Orbit != null) {
            return _Orbit!!
        }
        _Orbit = ImageVector.Builder(
            name = "Orbit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.11f, 1.75f)
                curveTo(9.3f, 1.25f, 10.62f, 1f, 12f, 1f)
                curveTo(18.08f, 1f, 23f, 5.92f, 23f, 12f)
                curveTo(23f, 18.08f, 18.08f, 23f, 12f, 23f)
                curveTo(5.92f, 23f, 1f, 18.08f, 1f, 12f)
                curveTo(1f, 10.62f, 1.25f, 9.3f, 1.72f, 8.08f)
                curveTo(2.24f, 8.61f, 2.83f, 8.96f, 3.45f, 9.18f)
                curveTo(3.16f, 10.07f, 3f, 11f, 3f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveTo(11f, 3f, 10.07f, 3.16f, 9.18f, 3.45f)
                curveTo(8.96f, 2.83f, 8.61f, 2.24f, 8.11f, 1.75f)
                moveTo(4.93f, 2.93f)
                curveTo(6.03f, 2.93f, 6.93f, 3.82f, 6.93f, 4.93f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.93f, 6.93f)
                curveTo(3.82f, 6.93f, 2.93f, 6.03f, 2.93f, 4.93f)
                curveTo(2.93f, 3.82f, 3.82f, 2.93f, 4.93f, 2.93f)
                moveTo(12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                close()
            }
        }.build()

        return _Orbit!!
    }

@Suppress("ObjectPropertyName")
private var _Orbit: ImageVector? = null
