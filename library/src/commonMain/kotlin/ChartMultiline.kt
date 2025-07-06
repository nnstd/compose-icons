package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartMultiline: ImageVector
    get() {
        if (_ChartMultiline != null) {
            return _ChartMultiline!!
        }
        _ChartMultiline = ImageVector.Builder(
            name = "ChartMultiline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6.92f)
                lineTo(20.59f, 5.5f)
                lineTo(17.74f, 8.72f)
                curveTo(15.68f, 6.4f, 12.83f, 5f, 9.61f, 5f)
                curveTo(6.72f, 5f, 4.07f, 6.16f, 2f, 8f)
                lineTo(3.42f, 9.42f)
                curveTo(5.12f, 7.93f, 7.27f, 7f, 9.61f, 7f)
                curveTo(12.35f, 7f, 14.7f, 8.26f, 16.38f, 10.24f)
                lineTo(13.5f, 13.5f)
                lineTo(9.5f, 9.5f)
                lineTo(2f, 17f)
                lineTo(3.5f, 18.5f)
                lineTo(9.5f, 12.5f)
                lineTo(13.5f, 16.5f)
                lineTo(17.55f, 11.93f)
                curveTo(18.3f, 13.28f, 18.8f, 14.83f, 19f, 16.5f)
                horizontalLineTo(21f)
                curveTo(20.78f, 14.18f, 20.05f, 12.09f, 18.96f, 10.34f)
                lineTo(22f, 6.92f)
                close()
            }
        }.build()

        return _ChartMultiline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartMultiline: ImageVector? = null
