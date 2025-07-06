package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartTree: ImageVector
    get() {
        if (_ChartTree != null) {
            return _ChartTree!!
        }
        _ChartTree = ImageVector.Builder(
            name = "ChartTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                moveTo(2f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(2f, 8f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                moveTo(9f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                moveTo(2f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _ChartTree!!
    }

@Suppress("ObjectPropertyName")
private var _ChartTree: ImageVector? = null
