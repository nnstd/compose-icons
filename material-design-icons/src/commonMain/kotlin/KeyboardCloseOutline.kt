package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardCloseOutline: ImageVector
    get() {
        if (_KeyboardCloseOutline != null) {
            return _KeyboardCloseOutline!!
        }
        _KeyboardCloseOutline = ImageVector.Builder(
            name = "KeyboardCloseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                lineTo(16f, 19f)
                horizontalLineTo(8f)
                moveTo(4f, 3f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(15f)
                curveTo(2f, 16.1f, 2.9f, 17f, 4f, 17f)
                horizontalLineTo(20f)
                curveTo(21.1f, 17f, 22f, 16.1f, 22f, 15f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                moveTo(4f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(5f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                moveTo(8f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                moveTo(11f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(14f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(17f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                moveTo(5f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(14f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                moveTo(17f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(8f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _KeyboardCloseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardCloseOutline: ImageVector? = null
