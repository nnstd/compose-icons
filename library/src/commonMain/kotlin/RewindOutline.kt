package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RewindOutline: ImageVector
    get() {
        if (_RewindOutline != null) {
            return _RewindOutline!!
        }
        _RewindOutline = ImageVector.Builder(
            name = "RewindOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9.9f)
                lineTo(7f, 12f)
                lineTo(10f, 14.1f)
                verticalLineTo(9.9f)
                moveTo(19f, 9.9f)
                lineTo(16f, 12f)
                lineTo(19f, 14.1f)
                verticalLineTo(9.9f)
                moveTo(12f, 6f)
                verticalLineTo(18f)
                lineTo(3.5f, 12f)
                lineTo(12f, 6f)
                moveTo(21f, 6f)
                verticalLineTo(18f)
                lineTo(12.5f, 12f)
                lineTo(21f, 6f)
                close()
            }
        }.build()

        return _RewindOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RewindOutline: ImageVector? = null
