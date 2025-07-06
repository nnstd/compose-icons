package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RemoteDesktop: ImageVector
    get() {
        if (_RemoteDesktop != null) {
            return _RemoteDesktop!!
        }
        _RemoteDesktop = ImageVector.Builder(
            name = "RemoteDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4f)
                verticalLineTo(16f)
                curveTo(1f, 17.11f, 1.9f, 18f, 3f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                moveTo(15f, 5f)
                lineTo(11.5f, 8.5f)
                lineTo(15f, 12f)
                lineTo(16.4f, 10.6f)
                lineTo(14.3f, 8.5f)
                lineTo(16.4f, 6.4f)
                moveTo(9f, 8f)
                lineTo(7.6f, 9.4f)
                lineTo(9.7f, 11.5f)
                lineTo(7.6f, 13.6f)
                lineTo(9f, 15f)
                lineTo(12.5f, 11.5f)
            }
        }.build()

        return _RemoteDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _RemoteDesktop: ImageVector? = null
