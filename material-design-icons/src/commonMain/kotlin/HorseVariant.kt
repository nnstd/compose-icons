package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HorseVariant: ImageVector
    get() {
        if (_HorseVariant != null) {
            return _HorseVariant!!
        }
        _HorseVariant = ImageVector.Builder(
            name = "HorseVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                verticalLineTo(16f)
                lineTo(17f, 17f)
                lineTo(13.91f, 11.5f)
                curveTo(13.65f, 11.04f, 12.92f, 11.27f, 13f, 11.81f)
                lineTo(14f, 21f)
                lineTo(4f, 17f)
                lineTo(5.15f, 8.94f)
                curveTo(5.64f, 5.53f, 8.56f, 3f, 12f, 3f)
                horizontalLineTo(20f)
                lineTo(18.42f, 5.37f)
                curveTo(19.36f, 5.88f, 20f, 6.86f, 20f, 8f)
                close()
            }
        }.build()

        return _HorseVariant!!
    }

@Suppress("ObjectPropertyName")
private var _HorseVariant: ImageVector? = null
