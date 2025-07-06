package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PalmTree: ImageVector
    get() {
        if (_PalmTree != null) {
            return _PalmTree!!
        }
        _PalmTree = ImageVector.Builder(
            name = "PalmTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(13.59f, 16.61f, 10f, 22f, 10f, 22f)
                horizontalLineTo(13f)
                curveTo(14.88f, 16.2f, 14f, 12.09f, 13.5f, 10f)
                moveTo(15.66f, 7.16f)
                curveTo(15.83f, 7.37f, 16f, 7.59f, 16.13f, 7.82f)
                curveTo(17.84f, 10.53f, 17.5f, 13.95f, 15.5f, 16.26f)
                curveTo(16.34f, 14.21f, 16.22f, 11.79f, 14.95f, 9.77f)
                curveTo(14.87f, 9.64f, 14.78f, 9.53f, 14.7f, 9.41f)
                curveTo(14.11f, 8.58f, 13.36f, 7.92f, 12.54f, 7.43f)
                curveTo(9.66f, 8.35f, 7.58f, 11.04f, 7.58f, 14.22f)
                curveTo(7.58f, 14.96f, 7.69f, 15.67f, 7.89f, 16.33f)
                curveTo(7.05f, 15.16f, 6.56f, 13.73f, 6.56f, 12.19f)
                curveTo(6.56f, 9.84f, 7.7f, 7.76f, 9.45f, 6.46f)
                curveTo(8f, 6.35f, 6.46f, 6.67f, 5.12f, 7.5f)
                curveTo(4.5f, 7.91f, 3.96f, 8.38f, 3.5f, 8.91f)
                curveTo(4.05f, 7.58f, 5f, 6.39f, 6.3f, 5.57f)
                curveTo(7.8f, 4.63f, 9.5f, 4.32f, 11.14f, 4.56f)
                curveTo(10.73f, 4f, 10.23f, 3.47f, 9.63f, 3f)
                curveTo(9.05f, 2.58f, 8.42f, 2.24f, 7.76f, 2f)
                curveTo(9.2f, 2.04f, 10.64f, 2.5f, 11.87f, 3.43f)
                curveTo(12.5f, 3.9f, 13f, 4.47f, 13.4f, 5.07f)
                curveTo(13.5f, 5.07f, 13.59f, 5.06f, 13.69f, 5.06f)
                curveTo(16.89f, 5.06f, 19.6f, 7.17f, 20.5f, 10.08f)
                curveTo(19.38f, 8.5f, 17.65f, 7.43f, 15.66f, 7.16f)
                close()
            }
        }.build()

        return _PalmTree!!
    }

@Suppress("ObjectPropertyName")
private var _PalmTree: ImageVector? = null
