package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccessPointNetwork: ImageVector
    get() {
        if (_AccessPointNetwork != null) {
            return _AccessPointNetwork!!
        }
        _AccessPointNetwork = ImageVector.Builder(
            name = "AccessPointNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.93f, 3.93f)
                curveTo(3.12f, 5.74f, 2f, 8.24f, 2f, 11f)
                curveTo(2f, 13.76f, 3.12f, 16.26f, 4.93f, 18.07f)
                lineTo(6.34f, 16.66f)
                curveTo(4.89f, 15.22f, 4f, 13.22f, 4f, 11f)
                curveTo(4f, 8.79f, 4.89f, 6.78f, 6.34f, 5.34f)
                lineTo(4.93f, 3.93f)
                moveTo(19.07f, 3.93f)
                lineTo(17.66f, 5.34f)
                curveTo(19.11f, 6.78f, 20f, 8.79f, 20f, 11f)
                curveTo(20f, 13.22f, 19.11f, 15.22f, 17.66f, 16.66f)
                lineTo(19.07f, 18.07f)
                curveTo(20.88f, 16.26f, 22f, 13.76f, 22f, 11f)
                curveTo(22f, 8.24f, 20.88f, 5.74f, 19.07f, 3.93f)
                moveTo(7.76f, 6.76f)
                curveTo(6.67f, 7.85f, 6f, 9.35f, 6f, 11f)
                curveTo(6f, 12.65f, 6.67f, 14.15f, 7.76f, 15.24f)
                lineTo(9.17f, 13.83f)
                curveTo(8.45f, 13.11f, 8f, 12.11f, 8f, 11f)
                curveTo(8f, 9.89f, 8.45f, 8.89f, 9.17f, 8.17f)
                lineTo(7.76f, 6.76f)
                moveTo(16.24f, 6.76f)
                lineTo(14.83f, 8.17f)
                curveTo(15.55f, 8.89f, 16f, 9.89f, 16f, 11f)
                curveTo(16f, 12.11f, 15.55f, 13.11f, 14.83f, 13.83f)
                lineTo(16.24f, 15.24f)
                curveTo(17.33f, 14.15f, 18f, 12.65f, 18f, 11f)
                curveTo(18f, 9.35f, 17.33f, 7.85f, 16.24f, 6.76f)
                moveTo(12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(11f, 15f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 23f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _AccessPointNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _AccessPointNetwork: ImageVector? = null
