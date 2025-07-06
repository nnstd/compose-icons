package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Opacity: ImageVector
    get() {
        if (_Opacity != null) {
            return _Opacity!!
        }
        _Opacity = ImageVector.Builder(
            name = "Opacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.66f, 8f)
                lineTo(12f, 2.35f)
                lineTo(6.34f, 8f)
                curveTo(4.78f, 9.56f, 4f, 11.64f, 4f, 13.64f)
                curveTo(4f, 15.64f, 4.78f, 17.75f, 6.34f, 19.31f)
                curveTo(7.9f, 20.87f, 9.95f, 21.66f, 12f, 21.66f)
                curveTo(14.05f, 21.66f, 16.1f, 20.87f, 17.66f, 19.31f)
                curveTo(19.22f, 17.75f, 20f, 15.64f, 20f, 13.64f)
                curveTo(20f, 11.64f, 19.22f, 9.56f, 17.66f, 8f)
                moveTo(6f, 14f)
                curveTo(6f, 12f, 6.62f, 10.73f, 7.76f, 9.6f)
                lineTo(12f, 5.27f)
                lineTo(16.24f, 9.65f)
                curveTo(17.38f, 10.77f, 18f, 12f, 18f, 14f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Opacity!!
    }

@Suppress("ObjectPropertyName")
private var _Opacity: ImageVector? = null
