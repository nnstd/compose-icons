package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreOff: ImageVector
    get() {
        if (_StoreOff != null) {
            return _StoreOff!!
        }
        _StoreOff = ImageVector.Builder(
            name = "StoreOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                moveTo(20f, 16.8f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                lineTo(20f, 7f)
                horizontalLineTo(10.2f)
                lineTo(17.2f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(14.8f)
                lineTo(20f, 16.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(14f, 15.89f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                horizontalLineTo(5.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _StoreOff!!
    }

@Suppress("ObjectPropertyName")
private var _StoreOff: ImageVector? = null
