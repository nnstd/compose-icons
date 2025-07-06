package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareOutline: ImageVector
    get() {
        if (_ShareOutline != null) {
            return _ShareOutline!!
        }
        _ShareOutline = ImageVector.Builder(
            name = "ShareOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 5f)
                verticalLineTo(9f)
                curveTo(7f, 10f, 4f, 15f, 3f, 20f)
                curveTo(5.5f, 16.5f, 9f, 14.9f, 14f, 14.9f)
                verticalLineTo(19f)
                lineTo(21f, 12f)
                lineTo(14f, 5f)
                moveTo(16f, 9.83f)
                lineTo(18.17f, 12f)
                lineTo(16f, 14.17f)
                verticalLineTo(12.9f)
                horizontalLineTo(14f)
                curveTo(11.93f, 12.9f, 10.07f, 13.28f, 8.34f, 13.85f)
                curveTo(9.74f, 12.46f, 11.54f, 11.37f, 14.28f, 11f)
                lineTo(16f, 10.73f)
                verticalLineTo(9.83f)
                close()
            }
        }.build()

        return _ShareOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShareOutline: ImageVector? = null
