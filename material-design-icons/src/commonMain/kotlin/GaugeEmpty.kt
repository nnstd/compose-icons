package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GaugeEmpty: ImageVector
    get() {
        if (_GaugeEmpty != null) {
            return _GaugeEmpty!!
        }
        _GaugeEmpty = ImageVector.Builder(
            name = "GaugeEmpty",
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
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 14.4f, 5f, 16.5f, 6.7f, 18f)
                curveTo(8.1f, 16.7f, 10f, 16f, 12f, 16f)
                curveTo(14f, 16f, 15.8f, 16.7f, 17.3f, 18f)
                curveTo(19f, 16.5f, 20f, 14.4f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(14f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                moveTo(10f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                moveTo(6.91f, 8.94f)
                curveTo(7.04f, 8.94f, 7.16f, 8.97f, 7.3f, 9f)
                lineTo(10.5f, 10.32f)
                lineTo(10.77f, 10.43f)
                curveTo(11.33f, 10f, 12.09f, 9.88f, 12.75f, 10.15f)
                curveTo(13.77f, 10.56f, 14.27f, 11.73f, 13.85f, 12.75f)
                curveTo(13.44f, 13.77f, 12.27f, 14.27f, 11.25f, 13.85f)
                curveTo(10.59f, 13.59f, 10.12f, 13f, 10f, 12.28f)
                lineTo(9.77f, 12.18f)
                lineTo(6.55f, 10.88f)
                lineTo(6.53f, 10.87f)
                curveTo(6f, 10.66f, 5.77f, 10.08f, 5.97f, 9.56f)
                curveTo(6.13f, 9.18f, 6.5f, 8.93f, 6.91f, 8.94f)
                verticalLineTo(8.94f)
                moveTo(17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                close()
            }
        }.build()

        return _GaugeEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _GaugeEmpty: ImageVector? = null
