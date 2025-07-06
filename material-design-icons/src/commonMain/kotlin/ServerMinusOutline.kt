package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerMinusOutline: ImageVector
    get() {
        if (_ServerMinusOutline != null) {
            return _ServerMinusOutline!!
        }
        _ServerMinusOutline = ImageVector.Builder(
            name = "ServerMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                moveTo(2f, 5.6f)
                verticalLineTo(10.4f)
                curveTo(2f, 11.3f, 2.5f, 12f, 3.2f, 12f)
                horizontalLineTo(20.9f)
                curveTo(21.5f, 12f, 22.1f, 11.3f, 22.1f, 10.4f)
                verticalLineTo(5.6f)
                curveTo(22f, 4.7f, 21.5f, 4f, 20.8f, 4f)
                horizontalLineTo(3.2f)
                curveTo(2.5f, 4f, 2f, 4.7f, 2f, 5.6f)
                moveTo(10f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                moveTo(5f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                moveTo(20f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _ServerMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ServerMinusOutline: ImageVector? = null
