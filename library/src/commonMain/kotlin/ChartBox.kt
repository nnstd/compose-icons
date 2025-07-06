package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBox: ImageVector
    get() {
        if (_ChartBox != null) {
            return _ChartBox!!
        }
        _ChartBox = ImageVector.Builder(
            name = "ChartBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                moveTo(17f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ChartBox!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBox: ImageVector? = null
