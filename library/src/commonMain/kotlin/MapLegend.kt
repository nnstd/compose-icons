package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapLegend: ImageVector
    get() {
        if (_MapLegend != null) {
            return _MapLegend!!
        }
        _MapLegend = ImageVector.Builder(
            name = "MapLegend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                lineTo(3.36f, 4.9f)
                curveTo(3.15f, 4.97f, 3f, 5.15f, 3f, 5.38f)
                verticalLineTo(20.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 21f)
                lineTo(3.66f, 20.97f)
                lineTo(9f, 18.9f)
                lineTo(15f, 21f)
                lineTo(20.64f, 19.1f)
                curveTo(20.85f, 19.03f, 21f, 18.85f, 21f, 18.62f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 3f)
                lineTo(20.34f, 3.03f)
                lineTo(15f, 5.1f)
                lineTo(9f, 3f)
                moveTo(8f, 5.45f)
                verticalLineTo(17.15f)
                lineTo(5f, 18.31f)
                verticalLineTo(6.46f)
                lineTo(8f, 5.45f)
                moveTo(10f, 5.47f)
                lineTo(14f, 6.87f)
                verticalLineTo(18.53f)
                lineTo(10f, 17.13f)
                verticalLineTo(5.47f)
                moveTo(19f, 5.7f)
                verticalLineTo(17.54f)
                lineTo(16f, 18.55f)
                verticalLineTo(6.86f)
                lineTo(19f, 5.7f)
                moveTo(7.46f, 6.3f)
                lineTo(5.57f, 6.97f)
                verticalLineTo(9.12f)
                lineTo(7.46f, 8.45f)
                verticalLineTo(6.3f)
                moveTo(7.46f, 9.05f)
                lineTo(5.57f, 9.72f)
                verticalLineTo(11.87f)
                lineTo(7.46f, 11.2f)
                verticalLineTo(9.05f)
                moveTo(7.46f, 11.8f)
                lineTo(5.57f, 12.47f)
                verticalLineTo(14.62f)
                lineTo(7.46f, 13.95f)
                verticalLineTo(11.8f)
                moveTo(7.46f, 14.55f)
                lineTo(5.57f, 15.22f)
                verticalLineTo(17.37f)
                lineTo(7.46f, 16.7f)
                verticalLineTo(14.55f)
                close()
            }
        }.build()

        return _MapLegend!!
    }

@Suppress("ObjectPropertyName")
private var _MapLegend: ImageVector? = null
