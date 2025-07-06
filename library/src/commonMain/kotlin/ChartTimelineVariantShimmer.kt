package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartTimelineVariantShimmer: ImageVector
    get() {
        if (_ChartTimelineVariantShimmer != null) {
            return _ChartTimelineVariantShimmer!!
        }
        _ChartTimelineVariantShimmer = ImageVector.Builder(
            name = "ChartTimelineVariantShimmer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                curveTo(19.5f, 8f, 18.7f, 9.4f, 19.1f, 10.5f)
                lineTo(15.5f, 14.1f)
                curveTo(15.2f, 14f, 14.8f, 14f, 14.5f, 14.1f)
                lineTo(11.9f, 11.5f)
                curveTo(12.3f, 10.4f, 11.5f, 9f, 10f, 9f)
                curveTo(8.6f, 9f, 7.7f, 10.4f, 8.1f, 11.5f)
                lineTo(3.5f, 16f)
                curveTo(2.4f, 15.7f, 1f, 16.5f, 1f, 18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                curveTo(4.4f, 20f, 5.3f, 18.6f, 4.9f, 17.5f)
                lineTo(9.4f, 12.9f)
                curveTo(9.7f, 13f, 10.1f, 13f, 10.4f, 12.9f)
                lineTo(13f, 15.5f)
                curveTo(12.7f, 16.5f, 13.5f, 18f, 15f, 18f)
                curveTo(16.5f, 18f, 17.3f, 16.6f, 16.9f, 15.5f)
                lineTo(20.5f, 11.9f)
                curveTo(21.6f, 12.2f, 23f, 11.4f, 23f, 10f)
                curveTo(23f, 8.9f, 22.1f, 8f, 21f, 8f)
                moveTo(15f, 9f)
                lineTo(15.9f, 6.9f)
                lineTo(18f, 6f)
                lineTo(15.9f, 5.1f)
                lineTo(15f, 3f)
                lineTo(14.1f, 5.1f)
                lineTo(12f, 6f)
                lineTo(14.1f, 6.9f)
                lineTo(15f, 9f)
                moveTo(3.5f, 11f)
                lineTo(4f, 9f)
                lineTo(6f, 8.5f)
                lineTo(4f, 8f)
                lineTo(3.5f, 6f)
                lineTo(3f, 8f)
                lineTo(1f, 8.5f)
                lineTo(3f, 9f)
                lineTo(3.5f, 11f)
                close()
            }
        }.build()

        return _ChartTimelineVariantShimmer!!
    }

@Suppress("ObjectPropertyName")
private var _ChartTimelineVariantShimmer: ImageVector? = null
