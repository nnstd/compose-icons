package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerNetworkOutline: ImageVector
    get() {
        if (_ServerNetworkOutline != null) {
            return _ServerNetworkOutline!!
        }
        _ServerNetworkOutline = ImageVector.Builder(
            name = "ServerNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                curveTo(14.6f, 15f, 15f, 15.4f, 15f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                curveTo(15f, 18.6f, 14.6f, 19f, 14f, 19f)
                horizontalLineTo(10f)
                curveTo(9.4f, 19f, 9f, 18.6f, 9f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                curveTo(9f, 15.4f, 9.4f, 15f, 10f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(3.2f)
                curveTo(2.5f, 13f, 2f, 12.3f, 2f, 11.4f)
                verticalLineTo(6.6f)
                curveTo(2f, 5.7f, 2.5f, 5f, 3.2f, 5f)
                horizontalLineTo(20.8f)
                curveTo(21.5f, 5f, 22f, 5.7f, 22f, 6.6f)
                verticalLineTo(11.4f)
                curveTo(22f, 12.3f, 21.5f, 13f, 20.8f, 13f)
                horizontalLineTo(13f)
                moveTo(9f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(5f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(20f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ServerNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ServerNetworkOutline: ImageVector? = null
