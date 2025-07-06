package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScatterPlotOutline: ImageVector
    get() {
        if (_ScatterPlotOutline != null) {
            return _ScatterPlotOutline!!
        }
        _ScatterPlotOutline = ImageVector.Builder(
            name = "ScatterPlotOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18f)
                moveTo(7f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                moveTo(11f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                moveTo(11f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                moveTo(16.6f, 21.6f)
                curveTo(14.39f, 21.6f, 12.6f, 19.81f, 12.6f, 17.6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 13.6f)
                curveTo(18.81f, 13.6f, 20.6f, 15.39f, 20.6f, 17.6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 21.6f)
                moveTo(16.6f, 15.6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.6f, 17.6f)
                curveTo(14.6f, 18.7f, 15.5f, 19.6f, 16.6f, 19.6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 17.6f)
                curveTo(18.6f, 16.5f, 17.7f, 15.6f, 16.6f, 15.6f)
                close()
            }
        }.build()

        return _ScatterPlotOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ScatterPlotOutline: ImageVector? = null
