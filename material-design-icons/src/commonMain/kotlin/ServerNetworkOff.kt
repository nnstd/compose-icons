package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerNetworkOff: ImageVector
    get() {
        if (_ServerNetworkOff != null) {
            return _ServerNetworkOff!!
        }
        _ServerNetworkOff = ImageVector.Builder(
            name = "ServerNetworkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(15.73f)
                lineTo(13f, 17.27f)
                verticalLineTo(19f)
                moveTo(22f, 20f)
                verticalLineTo(21.18f)
                lineTo(20.82f, 20f)
                horizontalLineTo(22f)
                moveTo(21f, 22.72f)
                lineTo(19.73f, 24f)
                lineTo(17.73f, 22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 11f)
                horizontalLineTo(6.73f)
                lineTo(4.73f, 9f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8f)
                verticalLineTo(7.27f)
                lineTo(1f, 5.27f)
                lineTo(2.28f, 4f)
                lineTo(21f, 22.72f)
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                horizontalLineTo(9.82f)
                lineTo(7f, 6.18f)
                verticalLineTo(5f)
                horizontalLineTo(5.82f)
                lineTo(3.84f, 3f)
                curveTo(3.89f, 3f, 3.94f, 3f, 4f, 3f)
                moveTo(20f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                horizontalLineTo(17.82f)
                lineTo(11.82f, 11f)
                horizontalLineTo(20f)
                moveTo(9f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(9f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(14.27f)
                lineTo(9f, 13.27f)
                verticalLineTo(15f)
                moveTo(5f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ServerNetworkOff!!
    }

@Suppress("ObjectPropertyName")
private var _ServerNetworkOff: ImageVector? = null
