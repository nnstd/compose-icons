package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartGantt: ImageVector
    get() {
        if (_ChartGantt != null) {
            return _ChartGantt!!
        }
        _ChartGantt = ImageVector.Builder(
            name = "ChartGantt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                moveTo(14f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                moveTo(14f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(14f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ChartGantt!!
    }

@Suppress("ObjectPropertyName")
private var _ChartGantt: ImageVector? = null
