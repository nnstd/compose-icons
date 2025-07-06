package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) {
            return _ChartPie!!
        }
        _ChartPie = ImageVector.Builder(
            name = "ChartPie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                verticalLineTo(22f)
                curveTo(5.9f, 21.5f, 2f, 17.2f, 2f, 12f)
                curveTo(2f, 6.8f, 5.9f, 2.5f, 11f, 2f)
                moveTo(13f, 2f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                curveTo(21.5f, 6.2f, 17.8f, 2.5f, 13f, 2f)
                moveTo(13f, 13f)
                verticalLineTo(22f)
                curveTo(17.7f, 21.5f, 21.5f, 17.8f, 22f, 13f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ChartPie!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie: ImageVector? = null
