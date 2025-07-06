package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Emby: ImageVector
    get() {
        if (_Emby != null) {
            return _Emby!!
        }
        _Emby = ImageVector.Builder(
            name = "Emby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2f)
                lineTo(6f, 7f)
                lineTo(7f, 8f)
                lineTo(2f, 13f)
                lineTo(7f, 18f)
                lineTo(8f, 17f)
                lineTo(13f, 22f)
                lineTo(18f, 17f)
                lineTo(17f, 16f)
                lineTo(22f, 11f)
                lineTo(17f, 6f)
                lineTo(16f, 7f)
                lineTo(11f, 2f)
                moveTo(10f, 8.5f)
                lineTo(16f, 12f)
                lineTo(10f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return _Emby!!
    }

@Suppress("ObjectPropertyName")
private var _Emby: ImageVector? = null
