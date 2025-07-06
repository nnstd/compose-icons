package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioTower: ImageVector
    get() {
        if (_RadioTower != null) {
            return _RadioTower!!
        }
        _RadioTower = ImageVector.Builder(
            name = "RadioTower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                curveTo(14f, 12.5f, 13.82f, 12.94f, 13.53f, 13.29f)
                lineTo(16.7f, 22f)
                horizontalLineTo(14.57f)
                lineTo(12f, 14.93f)
                lineTo(9.43f, 22f)
                horizontalLineTo(7.3f)
                lineTo(10.47f, 13.29f)
                curveTo(10.18f, 12.94f, 10f, 12.5f, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                moveTo(12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                curveTo(8f, 12.5f, 8.1f, 13f, 8.28f, 13.46f)
                lineTo(7.4f, 15.86f)
                curveTo(6.53f, 14.81f, 6f, 13.47f, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 13.47f, 17.47f, 14.81f, 16.6f, 15.86f)
                lineTo(15.72f, 13.46f)
                curveTo(15.9f, 13f, 16f, 12.5f, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 14.36f, 5f, 16.5f, 6.64f, 17.94f)
                lineTo(5.92f, 19.94f)
                curveTo(3.54f, 18.11f, 2f, 15.23f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                curveTo(22f, 15.23f, 20.46f, 18.11f, 18.08f, 19.94f)
                lineTo(17.36f, 17.94f)
                curveTo(19f, 16.5f, 20f, 14.36f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _RadioTower!!
    }

@Suppress("ObjectPropertyName")
private var _RadioTower: ImageVector? = null
