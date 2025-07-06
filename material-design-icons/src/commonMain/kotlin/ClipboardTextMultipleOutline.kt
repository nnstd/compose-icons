package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextMultipleOutline: ImageVector
    get() {
        if (_ClipboardTextMultipleOutline != null) {
            return _ClipboardTextMultipleOutline!!
        }
        _ClipboardTextMultipleOutline = ImageVector.Builder(
            name = "ClipboardTextMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(4f)
                curveTo(2.9f, 23f, 2f, 22.1f, 2f, 21f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(20f, 3f)
                curveTo(21.1f, 3f, 22f, 3.9f, 22f, 5f)
                verticalLineTo(17f)
                curveTo(22f, 18.1f, 21.1f, 19f, 20f, 19f)
                horizontalLineTo(8f)
                curveTo(6.9f, 19f, 6f, 18.1f, 6f, 17f)
                verticalLineTo(5f)
                curveTo(6f, 3.9f, 6.9f, 3f, 8f, 3f)
                horizontalLineTo(11.18f)
                curveTo(11.6f, 1.84f, 12.7f, 1f, 14f, 1f)
                curveTo(15.3f, 1f, 16.4f, 1.84f, 16.82f, 3f)
                horizontalLineTo(20f)
                moveTo(14f, 3f)
                curveTo(13.45f, 3f, 13f, 3.45f, 13f, 4f)
                curveTo(13f, 4.55f, 13.45f, 5f, 14f, 5f)
                curveTo(14.55f, 5f, 15f, 4.55f, 15f, 4f)
                curveTo(15f, 3.45f, 14.55f, 3f, 14f, 3f)
                moveTo(10f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(15f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(18f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ClipboardTextMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextMultipleOutline: ImageVector? = null
