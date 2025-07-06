package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Plex: ImageVector
    get() {
        if (_Plex != null) {
            return _Plex!!
        }
        _Plex = ImageVector.Builder(
            name = "Plex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.11f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                moveTo(8.56f, 6f)
                horizontalLineTo(12.06f)
                lineTo(15.5f, 12f)
                lineTo(12.06f, 18f)
                horizontalLineTo(8.56f)
                lineTo(12f, 12f)
                lineTo(8.56f, 6f)
                close()
            }
        }.build()

        return _Plex!!
    }

@Suppress("ObjectPropertyName")
private var _Plex: ImageVector? = null
