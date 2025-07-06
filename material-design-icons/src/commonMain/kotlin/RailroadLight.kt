package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RailroadLight: ImageVector
    get() {
        if (_RailroadLight != null) {
            return _RailroadLight!!
        }
        _RailroadLight = ImageVector.Builder(
            name = "RailroadLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.67f, 10.5f)
                curveTo(16.4f, 10.5f, 15.27f, 11.3f, 14.85f, 12.5f)
                horizontalLineTo(13.17f)
                verticalLineTo(7.77f)
                lineTo(16.66f, 9.86f)
                lineTo(17.66f, 8.14f)
                lineTo(14.11f, 6f)
                lineTo(17.68f, 3.86f)
                lineTo(16.68f, 2.14f)
                lineTo(13.17f, 4.23f)
                verticalLineTo(2f)
                horizontalLineTo(11.17f)
                verticalLineTo(4.23f)
                lineTo(7.68f, 2.14f)
                lineTo(6.68f, 3.86f)
                lineTo(10.23f, 6f)
                lineTo(6.66f, 8.14f)
                lineTo(7.66f, 9.86f)
                lineTo(11.17f, 7.77f)
                verticalLineTo(12.5f)
                horizontalLineTo(9.5f)
                curveTo(8.36f, 9.32f, 3.66f, 10.13f, 3.66f, 13.5f)
                curveTo(3.66f, 16.87f, 8.36f, 17.68f, 9.5f, 14.5f)
                horizontalLineTo(11.17f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.17f, 22f)
                horizontalLineTo(15.17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.17f, 20f)
                verticalLineTo(14.5f)
                horizontalLineTo(14.85f)
                curveTo(15.66f, 16.8f, 18.73f, 17.22f, 20.13f, 15.23f)
                curveTo(21.53f, 13.24f, 20.1f, 10.5f, 17.67f, 10.5f)
                moveTo(6.67f, 14.5f)
                curveTo(5.78f, 14.5f, 5.33f, 13.42f, 5.96f, 12.79f)
                curveTo(6.59f, 12.16f, 7.67f, 12.61f, 7.67f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.67f, 14.5f)
                moveTo(17.67f, 14.5f)
                curveTo(16.78f, 14.5f, 16.33f, 13.42f, 16.96f, 12.79f)
                curveTo(17.59f, 12.16f, 18.67f, 12.61f, 18.67f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.67f, 14.5f)
                close()
            }
        }.build()

        return _RailroadLight!!
    }

@Suppress("ObjectPropertyName")
private var _RailroadLight: ImageVector? = null
