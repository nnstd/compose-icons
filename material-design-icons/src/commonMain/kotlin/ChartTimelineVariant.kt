package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartTimelineVariant: ImageVector
    get() {
        if (_ChartTimelineVariant != null) {
            return _ChartTimelineVariant!!
        }
        _ChartTimelineVariant = ImageVector.Builder(
            name = "ChartTimelineVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 14f)
                lineTo(3.5f, 14.07f)
                lineTo(8.07f, 9.5f)
                curveTo(7.89f, 8.85f, 8.06f, 8.11f, 8.59f, 7.59f)
                curveTo(9.37f, 6.8f, 10.63f, 6.8f, 11.41f, 7.59f)
                curveTo(11.94f, 8.11f, 12.11f, 8.85f, 11.93f, 9.5f)
                lineTo(14.5f, 12.07f)
                lineTo(15f, 12f)
                curveTo(15.18f, 12f, 15.35f, 12f, 15.5f, 12.07f)
                lineTo(19.07f, 8.5f)
                curveTo(19f, 8.35f, 19f, 8.18f, 19f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                curveTo(20.82f, 10f, 20.65f, 10f, 20.5f, 9.93f)
                lineTo(16.93f, 13.5f)
                curveTo(17f, 13.65f, 17f, 13.82f, 17f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                lineTo(13.07f, 13.5f)
                lineTo(10.5f, 10.93f)
                curveTo(10.18f, 11f, 9.82f, 11f, 9.5f, 10.93f)
                lineTo(4.93f, 15.5f)
                lineTo(5f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                close()
            }
        }.build()

        return _ChartTimelineVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ChartTimelineVariant: ImageVector? = null
