package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertMinus: ImageVector
    get() {
        if (_AlertMinus != null) {
            return _AlertMinus!!
        }
        _AlertMinus = ImageVector.Builder(
            name = "AlertMinus",
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
                moveTo(24f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                close()
            }
        }.build()

        return _AlertMinus!!
    }

@Suppress("ObjectPropertyName")
private var _AlertMinus: ImageVector? = null
