package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Oar: ImageVector
    get() {
        if (_Oar != null) {
            return _Oar!!
        }
        _Oar = ImageVector.Builder(
            name = "Oar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.23f, 15.21f)
                curveTo(18.77f, 13.75f, 14.97f, 10.2f, 12.77f, 11.27f)
                lineTo(4.5f, 3f)
                lineTo(3f, 4.5f)
                lineTo(11.28f, 12.79f)
                curveTo(10.3f, 15f, 13.88f, 18.62f, 15.35f, 20.08f)
                curveTo(17.11f, 21.84f, 18.26f, 20.92f, 19.61f, 19.57f)
                curveTo(21.1f, 18.08f, 21.61f, 16.61f, 20.23f, 15.21f)
                close()
            }
        }.build()

        return _Oar!!
    }

@Suppress("ObjectPropertyName")
private var _Oar: ImageVector? = null
