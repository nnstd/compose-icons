package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileMoveOutline: ImageVector
    get() {
        if (_FileMoveOutline != null) {
            return _FileMoveOutline!!
        }
        _FileMoveOutline = ImageVector.Builder(
            name = "FileMoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 20.41f, 4.12f, 20.8f, 4.34f, 21.12f)
                curveTo(4.41f, 21.23f, 4.5f, 21.33f, 4.59f, 21.41f)
                curveTo(4.95f, 21.78f, 5.45f, 22f, 6f, 22f)
                horizontalLineTo(13.53f)
                curveTo(13f, 21.42f, 12.61f, 20.75f, 12.35f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                curveTo(18.7f, 12f, 19.37f, 12.12f, 20f, 12.34f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 23f)
                lineTo(23f, 18.5f)
                lineTo(20f, 15.8f)
                lineTo(18f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                close()
            }
        }.build()

        return _FileMoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileMoveOutline: ImageVector? = null
