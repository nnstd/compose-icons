package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HdmiPort: ImageVector
    get() {
        if (_HdmiPort != null) {
            return _HdmiPort!!
        }
        _HdmiPort = ImageVector.Builder(
            name = "HdmiPort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                curveTo(1.9f, 7f, 1f, 7.9f, 1f, 9f)
                verticalLineTo(14f)
                curveTo(1f, 15.1f, 1.9f, 16f, 3f, 16f)
                horizontalLineTo(4f)
                lineTo(5.4f, 17.4f)
                curveTo(5.8f, 17.8f, 6.3f, 18f, 6.8f, 18f)
                horizontalLineTo(17.1f)
                curveTo(17.6f, 18f, 18.1f, 17.8f, 18.5f, 17.4f)
                lineTo(20f, 16f)
                horizontalLineTo(21f)
                curveTo(22.1f, 16f, 23f, 15.1f, 23f, 14f)
                verticalLineTo(9f)
                curveTo(23f, 7.9f, 22.1f, 7f, 21f, 7f)
                moveTo(3f, 14f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(19.2f)
                lineTo(17.2f, 16f)
                horizontalLineTo(6.8f)
                lineTo(4.8f, 14f)
                horizontalLineTo(3f)
                moveTo(19f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _HdmiPort!!
    }

@Suppress("ObjectPropertyName")
private var _HdmiPort: ImageVector? = null
