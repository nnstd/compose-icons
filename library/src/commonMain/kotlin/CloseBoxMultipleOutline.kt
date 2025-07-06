package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseBoxMultipleOutline: ImageVector
    get() {
        if (_CloseBoxMultipleOutline != null) {
            return _CloseBoxMultipleOutline!!
        }
        _CloseBoxMultipleOutline = ImageVector.Builder(
            name = "CloseBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(8f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(20f)
                curveTo(21.11f, 18f, 22f, 17.11f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(4f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(9.77f, 12.84f)
                lineTo(12.6f, 10f)
                lineTo(9.77f, 7.15f)
                lineTo(11.17f, 5.75f)
                lineTo(14f, 8.6f)
                lineTo(16.84f, 5.77f)
                lineTo(18.24f, 7.17f)
                lineTo(15.4f, 10f)
                lineTo(18.23f, 12.84f)
                lineTo(16.83f, 14.24f)
                lineTo(14f, 11.4f)
                lineTo(11.17f, 14.24f)
                lineTo(9.77f, 12.84f)
                close()
            }
        }.build()

        return _CloseBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloseBoxMultipleOutline: ImageVector? = null
