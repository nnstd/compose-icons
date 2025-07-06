package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextMultiple: ImageVector
    get() {
        if (_ClipboardTextMultiple != null) {
            return _ClipboardTextMultiple!!
        }
        _ClipboardTextMultiple = ImageVector.Builder(
            name = "ClipboardTextMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 3f)
                horizontalLineTo(16.8f)
                curveTo(16.4f, 1.8f, 15.3f, 1f, 14f, 1f)
                curveTo(12.7f, 1f, 11.6f, 1.8f, 11.2f, 3f)
                horizontalLineTo(8f)
                curveTo(6.9f, 3f, 6f, 3.9f, 6f, 5f)
                verticalLineTo(17f)
                curveTo(6f, 18.1f, 6.9f, 19f, 8f, 19f)
                horizontalLineTo(20f)
                curveTo(21.1f, 19f, 22f, 18.1f, 22f, 17f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                moveTo(14f, 3f)
                curveTo(14.6f, 3f, 15f, 3.5f, 15f, 4f)
                curveTo(15f, 4.5f, 14.5f, 5f, 14f, 5f)
                curveTo(13.5f, 5f, 13f, 4.5f, 13f, 4f)
                curveTo(13f, 3.5f, 13.4f, 3f, 14f, 3f)
                moveTo(16f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(19f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(4f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(4f)
                curveTo(2.9f, 23f, 2f, 22.1f, 2f, 21f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
            }
        }.build()

        return _ClipboardTextMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextMultiple: ImageVector? = null
