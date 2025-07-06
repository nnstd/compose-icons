package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Kickstarter: ImageVector
    get() {
        if (_Kickstarter != null) {
            return _Kickstarter!!
        }
        _Kickstarter = ImageVector.Builder(
            name = "Kickstarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 10.2f)
                lineTo(17.5f, 12f)
                lineTo(19.3f, 13.8f)
                curveTo(21.19f, 15.67f, 21.19f, 18.72f, 19.3f, 20.59f)
                curveTo(17.42f, 22.46f, 14.35f, 22.46f, 12.47f, 20.59f)
                lineTo(11.8f, 19.93f)
                curveTo(10.93f, 21.19f, 9.5f, 22f, 7.83f, 22f)
                curveTo(5.16f, 22f, 3f, 19.85f, 3f, 17.2f)
                verticalLineTo(6.8f)
                curveTo(3f, 4.15f, 5.16f, 2f, 7.83f, 2f)
                curveTo(9.5f, 2f, 10.93f, 2.82f, 11.8f, 4.07f)
                lineTo(12.47f, 3.41f)
                curveTo(14.35f, 1.54f, 17.42f, 1.54f, 19.3f, 3.41f)
                curveTo(21.19f, 5.28f, 21.19f, 8.33f, 19.3f, 10.2f)
                close()
            }
        }.build()

        return _Kickstarter!!
    }

@Suppress("ObjectPropertyName")
private var _Kickstarter: ImageVector? = null
