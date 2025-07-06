package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Toothbrush: ImageVector
    get() {
        if (_Toothbrush != null) {
            return _Toothbrush!!
        }
        _Toothbrush = ImageVector.Builder(
            name = "Toothbrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.91f, 6.43f)
                lineTo(15.03f, 8.55f)
                lineTo(16.09f, 7.5f)
                lineTo(15.03f, 6.43f)
                lineTo(17.86f, 3.6f)
                lineTo(18.92f, 4.66f)
                lineTo(20f, 3.6f)
                lineTo(17.86f, 1.5f)
                moveTo(3f, 20.57f)
                lineTo(4.43f, 22f)
                lineTo(14.5f, 11.9f)
                lineTo(16.63f, 11.19f)
                lineTo(21.4f, 6.43f)
                curveTo(22.18f, 5.65f, 22.18f, 4.38f, 21.4f, 3.6f)
                lineTo(15.55f, 9.44f)
                lineTo(13.43f, 10.15f)
                close()
            }
        }.build()

        return _Toothbrush!!
    }

@Suppress("ObjectPropertyName")
private var _Toothbrush: ImageVector? = null
