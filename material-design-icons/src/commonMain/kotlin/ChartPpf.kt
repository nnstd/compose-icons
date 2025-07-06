package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartPpf: ImageVector
    get() {
        if (_ChartPpf != null) {
            return _ChartPpf!!
        }
        _ChartPpf = ImageVector.Builder(
            name = "ChartPpf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6f)
                verticalLineTo(8f)
                curveTo(8.2f, 8f, 11.36f, 9.18f, 13.57f, 11.15f)
                curveTo(15.64f, 13f, 16.83f, 15.5f, 17f, 18f)
                horizontalLineTo(18.97f)
                arcTo(14f, 12.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                moveTo(22f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ChartPpf!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPpf: ImageVector? = null
