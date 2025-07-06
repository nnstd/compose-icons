package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartHistogram: ImageVector
    get() {
        if (_ChartHistogram != null) {
            return _ChartHistogram!!
        }
        _ChartHistogram = ImageVector.Builder(
            name = "ChartHistogram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _ChartHistogram!!
    }

@Suppress("ObjectPropertyName")
private var _ChartHistogram: ImageVector? = null
