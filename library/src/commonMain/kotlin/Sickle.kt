package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sickle: ImageVector
    get() {
        if (_Sickle != null) {
            return _Sickle!!
        }
        _Sickle = ImageVector.Builder(
            name = "Sickle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 7.2f)
                curveTo(17.5f, 4.7f, 14.9f, 3f, 12f, 2f)
                curveTo(26.2f, 10.5f, 15.4f, 22.9f, 8.5f, 15.5f)
                lineTo(5.9f, 16f)
                lineTo(2.5f, 19.4f)
                curveTo(1.9f, 20f, 1.9f, 21f, 2.5f, 21.5f)
                curveTo(3.1f, 22.1f, 4.1f, 22.1f, 4.6f, 21.5f)
                lineTo(7.8f, 18.3f)
                curveTo(15.3f, 24.3f, 25f, 15f, 19.3f, 7.2f)
                close()
            }
        }.build()

        return _Sickle!!
    }

@Suppress("ObjectPropertyName")
private var _Sickle: ImageVector? = null
