package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PinOutline: ImageVector
    get() {
        if (_PinOutline != null) {
            return _PinOutline!!
        }
        _PinOutline = ImageVector.Builder(
            name = "PinOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                lineTo(6f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(11.2f)
                verticalLineTo(22f)
                horizontalLineTo(12.8f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                lineTo(16f, 12f)
                moveTo(8.8f, 14f)
                lineTo(10f, 12.8f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(12.8f)
                lineTo(15.2f, 14f)
                horizontalLineTo(8.8f)
                close()
            }
        }.build()

        return _PinOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PinOutline: ImageVector? = null
