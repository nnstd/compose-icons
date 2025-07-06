package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SafetyGoggles: ImageVector
    get() {
        if (_SafetyGoggles != null) {
            return _SafetyGoggles!!
        }
        _SafetyGoggles = ImageVector.Builder(
            name = "SafetyGoggles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                curveTo(19.11f, 9f, 20f, 9.89f, 20f, 11f)
                verticalLineTo(14f)
                curveTo(20f, 15.11f, 19.11f, 16f, 18f, 16f)
                horizontalLineTo(15.77f)
                lineTo(14.53f, 14.77f)
                curveTo(13.78f, 14f, 12.77f, 13.6f, 11.7f, 13.6f)
                curveTo(10.63f, 13.6f, 9.63f, 14f, 8.87f, 14.77f)
                lineTo(7.64f, 16f)
                horizontalLineTo(6f)
                curveTo(4.89f, 16f, 4f, 15.11f, 4f, 14f)
                verticalLineTo(11f)
                curveTo(4f, 9.89f, 4.89f, 9f, 6f, 9f)
                horizontalLineTo(18f)
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11f)
                horizontalLineTo(2f)
                lineTo(1f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18f)
                horizontalLineTo(8.5f)
                curveTo(8.54f, 17.94f, 8.59f, 17.88f, 10.29f, 16.18f)
                curveTo(10.68f, 15.79f, 11.19f, 15.6f, 11.7f, 15.6f)
                curveTo(12.22f, 15.6f, 12.73f, 15.79f, 13.12f, 16.18f)
                lineTo(14.91f, 18f)
                horizontalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 14f)
                horizontalLineTo(22f)
                lineTo(23f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 7f)
                close()
            }
        }.build()

        return _SafetyGoggles!!
    }

@Suppress("ObjectPropertyName")
private var _SafetyGoggles: ImageVector? = null
