package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrafficLight: ImageVector
    get() {
        if (_TrafficLight != null) {
            return _TrafficLight!!
        }
        _TrafficLight = ImageVector.Builder(
            name = "TrafficLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 7f)
                curveTo(10f, 5.89f, 10.9f, 5f, 12f, 5f)
                curveTo(13.11f, 5f, 14f, 5.89f, 14f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                curveTo(10f, 10.89f, 10.9f, 10f, 12f, 10f)
                curveTo(13.11f, 10f, 14f, 10.89f, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                moveTo(12f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 17f)
                curveTo(10f, 15.89f, 10.9f, 15f, 12f, 15f)
                curveTo(13.11f, 15f, 14f, 15.89f, 14f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                moveTo(20f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8.86f)
                curveTo(18.72f, 8.41f, 20f, 6.86f, 20f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 3f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                curveTo(4f, 6.86f, 5.28f, 8.41f, 7f, 8.86f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                curveTo(4f, 11.86f, 5.28f, 13.41f, 7f, 13.86f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                curveTo(4f, 16.86f, 5.28f, 18.41f, 7f, 18.86f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 21f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                verticalLineTo(18.86f)
                curveTo(18.72f, 18.41f, 20f, 16.86f, 20f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(13.86f)
                curveTo(18.72f, 13.41f, 20f, 11.86f, 20f, 10f)
                close()
            }
        }.build()

        return _TrafficLight!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficLight: ImageVector? = null
