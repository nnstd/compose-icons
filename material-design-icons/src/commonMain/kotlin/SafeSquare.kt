package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SafeSquare: ImageVector
    get() {
        if (_SafeSquare != null) {
            return _SafeSquare!!
        }
        _SafeSquare = ImageVector.Builder(
            name = "SafeSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(20f)
                curveTo(22f, 21.1f, 21.1f, 22f, 20f, 22f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                moveTo(17f, 12f)
                curveTo(17f, 11f, 16.7f, 10f, 16.2f, 9.2f)
                lineTo(17.7f, 7.7f)
                lineTo(16.3f, 6.3f)
                lineTo(14.8f, 7.8f)
                curveTo(14f, 7.3f, 13f, 7f, 12f, 7f)
                curveTo(11f, 7f, 10f, 7.3f, 9.2f, 7.8f)
                lineTo(7.8f, 6.3f)
                lineTo(6.3f, 7.8f)
                lineTo(7.8f, 9.3f)
                curveTo(7.3f, 10f, 7f, 11f, 7f, 12f)
                curveTo(7f, 13f, 7.3f, 14f, 7.8f, 14.8f)
                lineTo(6.3f, 16.3f)
                lineTo(7.8f, 17.7f)
                lineTo(9.3f, 16.2f)
                curveTo(10f, 16.7f, 11f, 17f, 12f, 17f)
                curveTo(13f, 17f, 14f, 16.7f, 14.8f, 16.2f)
                lineTo(16.3f, 17.7f)
                lineTo(17.7f, 16.3f)
                lineTo(16.2f, 14.8f)
                curveTo(16.7f, 14f, 17f, 13f, 17f, 12f)
                moveTo(12f, 9f)
                curveTo(13.7f, 9f, 15f, 10.3f, 15f, 12f)
                curveTo(15f, 13.7f, 13.7f, 15f, 12f, 15f)
                curveTo(10.3f, 15f, 9f, 13.7f, 9f, 12f)
                curveTo(9f, 10.3f, 10.3f, 9f, 12f, 9f)
                moveTo(12f, 14f)
                curveTo(13.1f, 14f, 14f, 13.1f, 14f, 12f)
                curveTo(14f, 10.9f, 13.1f, 10f, 12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                curveTo(10f, 13.1f, 10.9f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _SafeSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SafeSquare: ImageVector? = null
