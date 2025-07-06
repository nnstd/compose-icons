package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardPlayMultiple: ImageVector
    get() {
        if (_ClipboardPlayMultiple != null) {
            return _ClipboardPlayMultiple!!
        }
        _ClipboardPlayMultiple = ImageVector.Builder(
            name = "ClipboardPlayMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(4f)
                curveTo(2.9f, 23f, 2f, 22.1f, 2f, 21f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(22f, 5f)
                verticalLineTo(17f)
                curveTo(22f, 18.1f, 21.1f, 19f, 20f, 19f)
                horizontalLineTo(8f)
                curveTo(6.9f, 19f, 6f, 18.1f, 6f, 17f)
                verticalLineTo(5f)
                curveTo(6f, 3.9f, 6.9f, 3f, 8f, 3f)
                horizontalLineTo(11.2f)
                curveTo(11.6f, 1.8f, 12.7f, 1f, 14f, 1f)
                curveTo(15.3f, 1f, 16.4f, 1.8f, 16.8f, 3f)
                horizontalLineTo(20f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                moveTo(13f, 4f)
                curveTo(13f, 4.5f, 13.5f, 5f, 14f, 5f)
                curveTo(14.5f, 5f, 15f, 4.5f, 15f, 4f)
                curveTo(15f, 3.5f, 14.6f, 3f, 14f, 3f)
                curveTo(13.4f, 3f, 13f, 3.5f, 13f, 4f)
                moveTo(17f, 12f)
                lineTo(12f, 8f)
                verticalLineTo(16f)
            }
        }.build()

        return _ClipboardPlayMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardPlayMultiple: ImageVector? = null
