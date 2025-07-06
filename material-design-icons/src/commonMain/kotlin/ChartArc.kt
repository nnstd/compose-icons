package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartArc: ImageVector
    get() {
        if (_ChartArc != null) {
            return _ChartArc!!
        }
        _ChartArc = ImageVector.Builder(
            name = "ChartArc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.18f, 19.6f)
                lineTo(14.17f, 16.12f)
                curveTo(15.15f, 15.4f, 15.83f, 14.28f, 15.97f, 13f)
                horizontalLineTo(20f)
                curveTo(19.83f, 15.76f, 18.35f, 18.16f, 16.18f, 19.6f)
                moveTo(13f, 7.03f)
                verticalLineTo(3f)
                curveTo(17.3f, 3.26f, 20.74f, 6.7f, 21f, 11f)
                horizontalLineTo(16.97f)
                curveTo(16.74f, 8.91f, 15.09f, 7.26f, 13f, 7.03f)
                moveTo(7f, 12.5f)
                curveTo(7f, 13.14f, 7.13f, 13.75f, 7.38f, 14.3f)
                lineTo(3.9f, 16.31f)
                curveTo(3.32f, 15.16f, 3f, 13.87f, 3f, 12.5f)
                curveTo(3f, 7.97f, 6.54f, 4.27f, 11f, 4f)
                verticalLineTo(8.03f)
                curveTo(8.75f, 8.28f, 7f, 10.18f, 7f, 12.5f)
                moveTo(11.5f, 21f)
                curveTo(8.53f, 21f, 5.92f, 19.5f, 4.4f, 17.18f)
                lineTo(7.88f, 15.17f)
                curveTo(8.7f, 16.28f, 10f, 17f, 11.5f, 17f)
                curveTo(12.14f, 17f, 12.75f, 16.87f, 13.3f, 16.62f)
                lineTo(15.31f, 20.1f)
                curveTo(14.16f, 20.68f, 12.87f, 21f, 11.5f, 21f)
                close()
            }
        }.build()

        return _ChartArc!!
    }

@Suppress("ObjectPropertyName")
private var _ChartArc: ImageVector? = null
