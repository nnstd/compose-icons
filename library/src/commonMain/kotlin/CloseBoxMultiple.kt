package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseBoxMultiple: ImageVector
    get() {
        if (_CloseBoxMultiple != null) {
            return _CloseBoxMultiple!!
        }
        _CloseBoxMultiple = ImageVector.Builder(
            name = "CloseBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(20.22f, 2f)
                horizontalLineTo(7.78f)
                curveTo(6.8f, 2f, 6f, 2.8f, 6f, 3.78f)
                verticalLineTo(16.22f)
                curveTo(6f, 17.2f, 6.8f, 18f, 7.78f, 18f)
                horizontalLineTo(20.22f)
                curveTo(21.2f, 18f, 22f, 17.2f, 22f, 16.22f)
                verticalLineTo(3.78f)
                curveTo(22f, 2.8f, 21.2f, 2f, 20.22f, 2f)
                moveTo(19f, 13.6f)
                lineTo(17.6f, 15f)
                lineTo(14f, 11.4f)
                lineTo(10.4f, 15f)
                lineTo(9f, 13.6f)
                lineTo(12.6f, 10f)
                lineTo(9f, 6.4f)
                lineTo(10.4f, 5f)
                lineTo(14f, 8.6f)
                lineTo(17.6f, 5f)
                lineTo(19f, 6.4f)
                lineTo(15.4f, 10f)
                lineTo(19f, 13.6f)
                close()
            }
        }.build()

        return _CloseBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CloseBoxMultiple: ImageVector? = null
