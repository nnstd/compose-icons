package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardMultiple: ImageVector
    get() {
        if (_ClipboardMultiple != null) {
            return _ClipboardMultiple!!
        }
        _ClipboardMultiple = ImageVector.Builder(
            name = "ClipboardMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                curveTo(2f, 22.1f, 2.9f, 23f, 4f, 23f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
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
                close()
            }
        }.build()

        return _ClipboardMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardMultiple: ImageVector? = null
