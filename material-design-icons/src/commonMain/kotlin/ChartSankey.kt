package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartSankey: ImageVector
    get() {
        if (_ChartSankey != null) {
            return _ChartSankey!!
        }
        _ChartSankey = ImageVector.Builder(
            name = "ChartSankey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                curveTo(8.09f, 9f, 10.13f, 11f, 12.29f, 13.21f)
                reflectiveCurveTo(17.09f, 18f, 22f, 18f)
                verticalLineTo(16f)
                curveTo(17.91f, 16f, 15.87f, 14f, 13.71f, 11.79f)
                reflectiveCurveTo(8.91f, 7f, 4f, 7f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ChartSankey!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSankey: ImageVector? = null
