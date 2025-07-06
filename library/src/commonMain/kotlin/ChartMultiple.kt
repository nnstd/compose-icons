package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartMultiple: ImageVector
    get() {
        if (_ChartMultiple != null) {
            return _ChartMultiple!!
        }
        _ChartMultiple = ImageVector.Builder(
            name = "ChartMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(13.57f)
                lineTo(13.71f, 4.57f)
                lineTo(16.87f, 6.68f)
                lineTo(19.29f, 4.26f)
                lineTo(20.71f, 5.68f)
                lineTo(17.13f, 9.29f)
                lineTo(14.29f, 7.4f)
                lineTo(8.82f, 16f)
                moveTo(4f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ChartMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ChartMultiple: ImageVector? = null
