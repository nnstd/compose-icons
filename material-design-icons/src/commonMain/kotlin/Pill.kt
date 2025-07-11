package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pill: ImageVector
    get() {
        if (_Pill != null) {
            return _Pill!!
        }
        _Pill = ImageVector.Builder(
            name = "Pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.22f, 11.29f)
                lineTo(11.29f, 4.22f)
                curveTo(13.64f, 1.88f, 17.43f, 1.88f, 19.78f, 4.22f)
                curveTo(22.12f, 6.56f, 22.12f, 10.36f, 19.78f, 12.71f)
                lineTo(12.71f, 19.78f)
                curveTo(10.36f, 22.12f, 6.56f, 22.12f, 4.22f, 19.78f)
                curveTo(1.88f, 17.43f, 1.88f, 13.64f, 4.22f, 11.29f)
                moveTo(5.64f, 12.71f)
                curveTo(4.59f, 13.75f, 4.24f, 15.24f, 4.6f, 16.57f)
                lineTo(10.59f, 10.59f)
                lineTo(14.83f, 14.83f)
                lineTo(18.36f, 11.29f)
                curveTo(19.93f, 9.73f, 19.93f, 7.2f, 18.36f, 5.64f)
                curveTo(16.8f, 4.07f, 14.27f, 4.07f, 12.71f, 5.64f)
                lineTo(5.64f, 12.71f)
                close()
            }
        }.build()

        return _Pill!!
    }

@Suppress("ObjectPropertyName")
private var _Pill: ImageVector? = null
