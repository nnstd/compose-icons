package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBarStacked: ImageVector
    get() {
        if (_ChartBarStacked != null) {
            return _ChartBarStacked!!
        }
        _ChartBarStacked = ImageVector.Builder(
            name = "ChartBarStacked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                moveTo(18f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                moveTo(12f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                moveTo(16f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(6f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                moveTo(10f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ChartBarStacked!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBarStacked: ImageVector? = null
