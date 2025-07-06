package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartTimeline: ImageVector
    get() {
        if (_ChartTimeline != null) {
            return _ChartTimeline!!
        }
        _ChartTimeline = ImageVector.Builder(
            name = "ChartTimeline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(7f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                moveTo(11f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(6f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ChartTimeline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartTimeline: ImageVector? = null
