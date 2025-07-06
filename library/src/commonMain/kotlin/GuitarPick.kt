package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GuitarPick: ImageVector
    get() {
        if (_GuitarPick != null) {
            return _GuitarPick!!
        }
        _GuitarPick = ImageVector.Builder(
            name = "GuitarPick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4.1f)
                curveTo(18.1f, 3.3f, 17f, 2.8f, 15.8f, 2.5f)
                curveTo(15.5f, 2.4f, 13.6f, 2f, 12.2f, 2f)
                curveTo(12.2f, 2f, 12.1f, 2f, 12f, 2f)
                curveTo(12f, 2f, 11.9f, 2f, 11.8f, 2f)
                curveTo(10.4f, 2f, 8.4f, 2.4f, 8.1f, 2.5f)
                curveTo(7f, 2.8f, 5.9f, 3.3f, 5f, 4.1f)
                curveTo(3f, 5.9f, 3f, 8.7f, 4f, 11f)
                curveTo(5f, 13.5f, 6.1f, 15.7f, 7.6f, 17.9f)
                curveTo(8.8f, 19.6f, 10.1f, 22f, 12f, 22f)
                curveTo(13.9f, 22f, 15.2f, 19.6f, 16.5f, 17.9f)
                curveTo(18f, 15.8f, 19.1f, 13.5f, 20.1f, 11f)
                curveTo(21f, 8.7f, 21f, 5.9f, 19f, 4.1f)
                close()
            }
        }.build()

        return _GuitarPick!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarPick: ImageVector? = null
