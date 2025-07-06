package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBubble: ImageVector
    get() {
        if (_ChartBubble != null) {
            return _ChartBubble!!
        }
        _ChartBubble = ImageVector.Builder(
            name = "ChartBubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.2f, 11.2f)
                curveTo(8.97f, 11.2f, 10.4f, 12.63f, 10.4f, 14.4f)
                curveTo(10.4f, 16.17f, 8.97f, 17.6f, 7.2f, 17.6f)
                curveTo(5.43f, 17.6f, 4f, 16.17f, 4f, 14.4f)
                curveTo(4f, 12.63f, 5.43f, 11.2f, 7.2f, 11.2f)
                moveTo(14.8f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.8f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.8f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.8f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.8f, 16f)
                moveTo(15.2f, 4f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8.8f)
                curveTo(20f, 11.45f, 17.85f, 13.6f, 15.2f, 13.6f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.4f, 8.8f)
                curveTo(10.4f, 6.15f, 12.55f, 4f, 15.2f, 4f)
                close()
            }
        }.build()

        return _ChartBubble!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBubble: ImageVector? = null
