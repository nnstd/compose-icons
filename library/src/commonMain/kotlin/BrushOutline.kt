package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BrushOutline: ImageVector
    get() {
        if (_BrushOutline != null) {
            return _BrushOutline!!
        }
        _BrushOutline = ImageVector.Builder(
            name = "BrushOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                curveTo(7.55f, 16f, 8f, 16.45f, 8f, 17f)
                curveTo(8f, 18.1f, 7.1f, 19f, 6f, 19f)
                curveTo(5.83f, 19f, 5.67f, 19f, 5.5f, 18.95f)
                curveTo(5.81f, 18.4f, 6f, 17.74f, 6f, 17f)
                curveTo(6f, 16.45f, 6.45f, 16f, 7f, 16f)
                moveTo(18.67f, 3f)
                curveTo(18.41f, 3f, 18.16f, 3.1f, 17.96f, 3.29f)
                lineTo(9f, 12.25f)
                lineTo(11.75f, 15f)
                lineTo(20.71f, 6.04f)
                curveTo(21.1f, 5.65f, 21.1f, 5f, 20.71f, 4.63f)
                lineTo(19.37f, 3.29f)
                curveTo(19.17f, 3.09f, 18.92f, 3f, 18.67f, 3f)
                moveTo(7f, 14f)
                curveTo(5.34f, 14f, 4f, 15.34f, 4f, 17f)
                curveTo(4f, 18.31f, 2.84f, 19f, 2f, 19f)
                curveTo(2.92f, 20.22f, 4.5f, 21f, 6f, 21f)
                curveTo(8.21f, 21f, 10f, 19.21f, 10f, 17f)
                curveTo(10f, 15.34f, 8.66f, 14f, 7f, 14f)
                close()
            }
        }.build()

        return _BrushOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BrushOutline: ImageVector? = null
