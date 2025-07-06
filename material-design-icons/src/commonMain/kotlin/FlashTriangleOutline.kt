package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashTriangleOutline: ImageVector
    get() {
        if (_FlashTriangleOutline != null) {
            return _FlashTriangleOutline!!
        }
        _FlashTriangleOutline = ImageVector.Builder(
            name = "FlashTriangleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(23f)
                moveTo(12f, 6f)
                lineTo(19.5f, 19f)
                horizontalLineTo(4.5f)
                moveTo(14f, 14f)
                horizontalLineTo(12.5f)
                lineTo(14f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                lineTo(14f, 14f)
                close()
            }
        }.build()

        return _FlashTriangleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlashTriangleOutline: ImageVector? = null
