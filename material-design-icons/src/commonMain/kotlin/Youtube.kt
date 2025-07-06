package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Youtube: ImageVector
    get() {
        if (_Youtube != null) {
            return _Youtube!!
        }
        _Youtube = ImageVector.Builder(
            name = "Youtube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15f)
                lineTo(15.19f, 12f)
                lineTo(10f, 9f)
                verticalLineTo(15f)
                moveTo(21.56f, 7.17f)
                curveTo(21.69f, 7.64f, 21.78f, 8.27f, 21.84f, 9.07f)
                curveTo(21.91f, 9.87f, 21.94f, 10.56f, 21.94f, 11.16f)
                lineTo(22f, 12f)
                curveTo(22f, 14.19f, 21.84f, 15.8f, 21.56f, 16.83f)
                curveTo(21.31f, 17.73f, 20.73f, 18.31f, 19.83f, 18.56f)
                curveTo(19.36f, 18.69f, 18.5f, 18.78f, 17.18f, 18.84f)
                curveTo(15.88f, 18.91f, 14.69f, 18.94f, 13.59f, 18.94f)
                lineTo(12f, 19f)
                curveTo(7.81f, 19f, 5.2f, 18.84f, 4.17f, 18.56f)
                curveTo(3.27f, 18.31f, 2.69f, 17.73f, 2.44f, 16.83f)
                curveTo(2.31f, 16.36f, 2.22f, 15.73f, 2.16f, 14.93f)
                curveTo(2.09f, 14.13f, 2.06f, 13.44f, 2.06f, 12.84f)
                lineTo(2f, 12f)
                curveTo(2f, 9.81f, 2.16f, 8.2f, 2.44f, 7.17f)
                curveTo(2.69f, 6.27f, 3.27f, 5.69f, 4.17f, 5.44f)
                curveTo(4.64f, 5.31f, 5.5f, 5.22f, 6.82f, 5.16f)
                curveTo(8.12f, 5.09f, 9.31f, 5.06f, 10.41f, 5.06f)
                lineTo(12f, 5f)
                curveTo(16.19f, 5f, 18.8f, 5.16f, 19.83f, 5.44f)
                curveTo(20.73f, 5.69f, 21.31f, 6.27f, 21.56f, 7.17f)
                close()
            }
        }.build()

        return _Youtube!!
    }

@Suppress("ObjectPropertyName")
private var _Youtube: ImageVector? = null
