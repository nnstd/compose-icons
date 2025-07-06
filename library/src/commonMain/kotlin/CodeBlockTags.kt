package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeBlockTags: ImageVector
    get() {
        if (_CodeBlockTags != null) {
            return _CodeBlockTags!!
        }
        _CodeBlockTags = ImageVector.Builder(
            name = "CodeBlockTags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.59f, 3.41f)
                lineTo(7f, 4.82f)
                lineTo(3.82f, 8f)
                lineTo(7f, 11.18f)
                lineTo(5.59f, 12.6f)
                lineTo(1f, 8f)
                lineTo(5.59f, 3.41f)
                moveTo(11.41f, 3.41f)
                lineTo(16f, 8f)
                lineTo(11.41f, 12.6f)
                lineTo(10f, 11.18f)
                lineTo(13.18f, 8f)
                lineTo(10f, 4.82f)
                lineTo(11.41f, 3.41f)
                moveTo(22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(17.03f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                close()
            }
        }.build()

        return _CodeBlockTags!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBlockTags: ImageVector? = null
