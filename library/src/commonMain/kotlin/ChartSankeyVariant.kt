package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartSankeyVariant: ImageVector
    get() {
        if (_ChartSankeyVariant != null) {
            return _ChartSankeyVariant!!
        }
        _ChartSankeyVariant = ImageVector.Builder(
            name = "ChartSankeyVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                curveTo(8.16f, 10f, 9.92f, 12.11f, 11.77f, 14.34f)
                reflectiveCurveTo(15.65f, 19f, 20f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                curveTo(16.59f, 17f, 15.07f, 15.17f, 13.31f, 13.06f)
                curveTo(11.34f, 10.69f, 9.1f, 8f, 4f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ChartSankeyVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSankeyVariant: ImageVector? = null
