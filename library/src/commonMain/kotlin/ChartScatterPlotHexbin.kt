package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartScatterPlotHexbin: ImageVector
    get() {
        if (_ChartScatterPlotHexbin != null) {
            return _ChartScatterPlotHexbin!!
        }
        _ChartScatterPlotHexbin = ImageVector.Builder(
            name = "ChartScatterPlotHexbin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(14f, 14.5f)
                lineTo(12f, 18f)
                horizontalLineTo(7.94f)
                lineTo(5.92f, 14.5f)
                lineTo(7.94f, 11f)
                horizontalLineTo(12f)
                lineTo(14f, 14.5f)
                moveTo(14.08f, 6.5f)
                lineTo(12.06f, 10f)
                horizontalLineTo(8f)
                lineTo(6f, 6.5f)
                lineTo(8f, 3f)
                horizontalLineTo(12.06f)
                lineTo(14.08f, 6.5f)
                moveTo(21.25f, 10.5f)
                lineTo(19.23f, 14f)
                horizontalLineTo(15.19f)
                lineTo(13.17f, 10.5f)
                lineTo(15.19f, 7f)
                horizontalLineTo(19.23f)
                lineTo(21.25f, 10.5f)
                close()
            }
        }.build()

        return _ChartScatterPlotHexbin!!
    }

@Suppress("ObjectPropertyName")
private var _ChartScatterPlotHexbin: ImageVector? = null
