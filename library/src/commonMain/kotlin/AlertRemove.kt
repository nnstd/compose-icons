package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertRemove: ImageVector
    get() {
        if (_AlertRemove != null) {
            return _AlertRemove!!
        }
        _AlertRemove = ImageVector.Builder(
            name = "AlertRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                curveTo(14f, 16.21f, 15.91f, 13.87f, 18.5f, 13.2f)
                lineTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(14.35f)
                curveTo(14.13f, 20.37f, 14f, 19.7f, 14f, 19f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(23.54f, 16.88f)
                lineTo(21.41f, 19f)
                lineTo(23.54f, 21.12f)
                lineTo(22.12f, 22.54f)
                lineTo(20f, 20.41f)
                lineTo(17.88f, 22.54f)
                lineTo(16.47f, 21.12f)
                lineTo(18.59f, 19f)
                lineTo(16.47f, 16.88f)
                lineTo(17.88f, 15.47f)
                lineTo(20f, 17.59f)
                lineTo(22.12f, 15.46f)
                lineTo(23.54f, 16.88f)
                close()
            }
        }.build()

        return _AlertRemove!!
    }

@Suppress("ObjectPropertyName")
private var _AlertRemove: ImageVector? = null
