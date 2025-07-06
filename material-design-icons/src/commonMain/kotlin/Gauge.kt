package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gauge: ImageVector
    get() {
        if (_Gauge != null) {
            return _Gauge!!
        }
        _Gauge = ImageVector.Builder(
            name = "Gauge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                curveTo(20f, 14.4f, 19f, 16.5f, 17.3f, 18f)
                curveTo(15.9f, 16.7f, 14f, 16f, 12f, 16f)
                curveTo(10f, 16f, 8.2f, 16.7f, 6.7f, 18f)
                curveTo(5f, 16.5f, 4f, 14.4f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(14f, 5.89f)
                curveTo(13.62f, 5.9f, 13.26f, 6.15f, 13.1f, 6.54f)
                lineTo(11.81f, 9.77f)
                lineTo(11.71f, 10f)
                curveTo(11f, 10.13f, 10.41f, 10.6f, 10.14f, 11.26f)
                curveTo(9.73f, 12.29f, 10.23f, 13.45f, 11.26f, 13.86f)
                curveTo(12.29f, 14.27f, 13.45f, 13.77f, 13.86f, 12.74f)
                curveTo(14.12f, 12.08f, 14f, 11.32f, 13.57f, 10.76f)
                lineTo(13.67f, 10.5f)
                lineTo(14.96f, 7.29f)
                lineTo(14.97f, 7.26f)
                curveTo(15.17f, 6.75f, 14.92f, 6.17f, 14.41f, 5.96f)
                curveTo(14.28f, 5.91f, 14.15f, 5.89f, 14f, 5.89f)
                moveTo(10f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 6f)
                moveTo(7f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                moveTo(17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9f)
                close()
            }
        }.build()

        return _Gauge!!
    }

@Suppress("ObjectPropertyName")
private var _Gauge: ImageVector? = null
