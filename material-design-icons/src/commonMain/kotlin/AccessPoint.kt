package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccessPoint: ImageVector
    get() {
        if (_AccessPoint != null) {
            return _AccessPoint!!
        }
        _AccessPoint = ImageVector.Builder(
            name = "AccessPoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.93f, 4.93f)
                curveTo(3.12f, 6.74f, 2f, 9.24f, 2f, 12f)
                curveTo(2f, 14.76f, 3.12f, 17.26f, 4.93f, 19.07f)
                lineTo(6.34f, 17.66f)
                curveTo(4.89f, 16.22f, 4f, 14.22f, 4f, 12f)
                curveTo(4f, 9.79f, 4.89f, 7.78f, 6.34f, 6.34f)
                lineTo(4.93f, 4.93f)
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.11f, 7.78f, 20f, 9.79f, 20f, 12f)
                curveTo(20f, 14.22f, 19.11f, 16.22f, 17.66f, 17.66f)
                lineTo(19.07f, 19.07f)
                curveTo(20.88f, 17.26f, 22f, 14.76f, 22f, 12f)
                curveTo(22f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                moveTo(7.76f, 7.76f)
                curveTo(6.67f, 8.85f, 6f, 10.35f, 6f, 12f)
                curveTo(6f, 13.65f, 6.67f, 15.15f, 7.76f, 16.24f)
                lineTo(9.17f, 14.83f)
                curveTo(8.45f, 14.11f, 8f, 13.11f, 8f, 12f)
                curveTo(8f, 10.89f, 8.45f, 9.89f, 9.17f, 9.17f)
                lineTo(7.76f, 7.76f)
                moveTo(16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.89f, 16f, 10.89f, 16f, 12f)
                curveTo(16f, 13.11f, 15.55f, 14.11f, 14.83f, 14.83f)
                lineTo(16.24f, 16.24f)
                curveTo(17.33f, 15.15f, 18f, 13.65f, 18f, 12f)
                curveTo(18f, 10.35f, 17.33f, 8.85f, 16.24f, 7.76f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _AccessPoint!!
    }

@Suppress("ObjectPropertyName")
private var _AccessPoint: ImageVector? = null
