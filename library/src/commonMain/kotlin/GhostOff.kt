package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GhostOff: ImageVector
    get() {
        if (_GhostOff != null) {
            return _GhostOff!!
        }
        _GhostOff = ImageVector.Builder(
            name = "GhostOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.27f)
                lineTo(3.28f, 2f)
                lineTo(22f, 20.72f)
                lineTo(20.73f, 22f)
                lineTo(17.87f, 19.13f)
                lineTo(15f, 22f)
                lineTo(12f, 19f)
                lineTo(9f, 22f)
                lineTo(6f, 19f)
                lineTo(3f, 22f)
                verticalLineTo(11f)
                curveTo(3f, 9.09f, 3.59f, 7.33f, 4.6f, 5.87f)
                lineTo(2f, 3.27f)
                moveTo(12f, 2f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11f)
                verticalLineTo(17.18f)
                lineTo(15.7f, 11.88f)
                curveTo(16.46f, 11.59f, 17f, 10.86f, 17f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 8f)
                curveTo(14.14f, 8f, 13.41f, 8.54f, 13.13f, 9.3f)
                lineTo(7.2f, 3.38f)
                curveTo(8.59f, 2.5f, 10.24f, 2f, 12f, 2f)
                moveTo(7f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                curveTo(9.5f, 12f, 9.93f, 11.83f, 10.27f, 11.54f)
                lineTo(7.46f, 8.73f)
                curveTo(7.17f, 9.07f, 7f, 9.5f, 7f, 10f)
                close()
            }
        }.build()

        return _GhostOff!!
    }

@Suppress("ObjectPropertyName")
private var _GhostOff: ImageVector? = null
