package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Apple: ImageVector
    get() {
        if (_Apple != null) {
            return _Apple!!
        }
        _Apple = ImageVector.Builder(
            name = "Apple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.71f, 19.5f)
                curveTo(17.88f, 20.74f, 17f, 21.95f, 15.66f, 21.97f)
                curveTo(14.32f, 22f, 13.89f, 21.18f, 12.37f, 21.18f)
                curveTo(10.84f, 21.18f, 10.37f, 21.95f, 9.1f, 22f)
                curveTo(7.79f, 22.05f, 6.8f, 20.68f, 5.96f, 19.47f)
                curveTo(4.25f, 17f, 2.94f, 12.45f, 4.7f, 9.39f)
                curveTo(5.57f, 7.87f, 7.13f, 6.91f, 8.82f, 6.88f)
                curveTo(10.1f, 6.86f, 11.32f, 7.75f, 12.11f, 7.75f)
                curveTo(12.89f, 7.75f, 14.37f, 6.68f, 15.92f, 6.84f)
                curveTo(16.57f, 6.87f, 18.39f, 7.1f, 19.56f, 8.82f)
                curveTo(19.47f, 8.88f, 17.39f, 10.1f, 17.41f, 12.63f)
                curveTo(17.44f, 15.65f, 20.06f, 16.66f, 20.09f, 16.67f)
                curveTo(20.06f, 16.74f, 19.67f, 18.11f, 18.71f, 19.5f)
                moveTo(13f, 3.5f)
                curveTo(13.73f, 2.67f, 14.94f, 2.04f, 15.94f, 2f)
                curveTo(16.07f, 3.17f, 15.6f, 4.35f, 14.9f, 5.19f)
                curveTo(14.21f, 6.04f, 13.07f, 6.7f, 11.95f, 6.61f)
                curveTo(11.8f, 5.46f, 12.36f, 4.26f, 13f, 3.5f)
                close()
            }
        }.build()

        return _Apple!!
    }

@Suppress("ObjectPropertyName")
private var _Apple: ImageVector? = null
