package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PinOffOutline: ImageVector
    get() {
        if (_PinOffOutline != null) {
            return _PinOffOutline!!
        }
        _PinOffOutline = ImageVector.Builder(
            name = "PinOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6.2f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                lineTo(18f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(17.8f)
                lineTo(14f, 12.2f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(8.2f)
                lineTo(8f, 6.2f)
                moveTo(20f, 20.7f)
                lineTo(18.7f, 22f)
                lineTo(12.8f, 16.1f)
                verticalLineTo(22f)
                horizontalLineTo(11.2f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                lineTo(8f, 12f)
                verticalLineTo(11.3f)
                lineTo(2f, 5.3f)
                lineTo(3.3f, 4f)
                lineTo(20f, 20.7f)
                moveTo(8.8f, 14f)
                horizontalLineTo(10.6f)
                lineTo(9.7f, 13.1f)
                lineTo(8.8f, 14f)
                close()
            }
        }.build()

        return _PinOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PinOffOutline: ImageVector? = null
