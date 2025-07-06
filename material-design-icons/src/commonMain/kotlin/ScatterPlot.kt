package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScatterPlot: ImageVector
    get() {
        if (_ScatterPlot != null) {
            return _ScatterPlot!!
        }
        _ScatterPlot = ImageVector.Builder(
            name = "ScatterPlot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                moveTo(11f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 3f)
                moveTo(16.6f, 14.6f)
                curveTo(18.25f, 14.6f, 19.6f, 15.94f, 19.6f, 17.6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 20.6f)
                curveTo(14.94f, 20.6f, 13.6f, 19.25f, 13.6f, 17.6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 14.6f)
                close()
            }
        }.build()

        return _ScatterPlot!!
    }

@Suppress("ObjectPropertyName")
private var _ScatterPlot: ImageVector? = null
