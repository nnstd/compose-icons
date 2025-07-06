package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartWaterfall: ImageVector
    get() {
        if (_ChartWaterfall != null) {
            return _ChartWaterfall!!
        }
        _ChartWaterfall = ImageVector.Builder(
            name = "ChartWaterfall",
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
                moveTo(17f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                moveTo(6f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(13f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(10f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _ChartWaterfall!!
    }

@Suppress("ObjectPropertyName")
private var _ChartWaterfall: ImageVector? = null
