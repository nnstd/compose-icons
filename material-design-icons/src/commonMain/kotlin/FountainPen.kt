package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FountainPen: ImageVector
    get() {
        if (_FountainPen != null) {
            return _FountainPen!!
        }
        _FountainPen = ImageVector.Builder(
            name = "FountainPen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.95f, 14.93f)
                lineTo(11.19f, 9.27f)
                lineTo(19.68f, 2.2f)
                curveTo(20.07f, 1.81f, 20.72f, 1.81f, 21.09f, 2.2f)
                lineTo(21.8f, 2.91f)
                curveTo(22.19f, 3.28f, 22.19f, 3.93f, 21.8f, 4.32f)
                lineTo(14.73f, 12.81f)
                lineTo(9.07f, 17.05f)
                lineTo(6.95f, 14.93f)
                moveTo(8.36f, 17.76f)
                lineTo(6.24f, 15.64f)
                lineTo(3.41f, 17.05f)
                lineTo(2f, 21.29f)
                lineTo(4.12f, 19.17f)
                curveTo(4.32f, 19f, 4.63f, 19f, 4.83f, 19.17f)
                curveTo(5f, 19.37f, 5f, 19.68f, 4.83f, 19.88f)
                lineTo(2.71f, 22f)
                lineTo(6.95f, 20.59f)
                lineTo(8.36f, 17.76f)
                close()
            }
        }.build()

        return _FountainPen!!
    }

@Suppress("ObjectPropertyName")
private var _FountainPen: ImageVector? = null
