package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RssOff: ImageVector
    get() {
        if (_RssOff != null) {
            return _RssOff!!
        }
        _RssOff = ImageVector.Builder(
            name = "RssOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 3.77f)
                lineTo(3.78f, 2.5f)
                lineTo(21.5f, 20.22f)
                lineTo(20.23f, 21.5f)
                lineTo(18.73f, 20f)
                horizontalLineTo(16.73f)
                curveTo(16.73f, 19.25f, 16.67f, 18.5f, 16.54f, 17.81f)
                lineTo(6.19f, 7.46f)
                curveTo(5.5f, 7.33f, 4.75f, 7.27f, 4f, 7.27f)
                verticalLineTo(5.27f)
                lineTo(2.5f, 3.77f)
                moveTo(6.18f, 15.64f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.36f, 17.82f)
                curveTo(8.36f, 19f, 7.38f, 20f, 6.18f, 20f)
                curveTo(5f, 20f, 4f, 19f, 4f, 17.82f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.18f, 15.64f)
                moveTo(4f, 10.1f)
                arcTo(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.9f, 20f)
                horizontalLineTo(11.07f)
                arcTo(7.07f, 7.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12.93f)
                verticalLineTo(10.1f)
                moveTo(9.13f, 5.31f)
                curveTo(13.59f, 6.87f, 17.13f, 10.41f, 18.69f, 14.87f)
                lineTo(9.13f, 5.31f)
                close()
            }
        }.build()

        return _RssOff!!
    }

@Suppress("ObjectPropertyName")
private var _RssOff: ImageVector? = null
