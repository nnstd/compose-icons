package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PawOff: ImageVector
    get() {
        if (_PawOff != null) {
            return _PawOff!!
        }
        _PawOff = ImageVector.Builder(
            name = "PawOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4.27f)
                lineTo(3.28f, 3f)
                lineTo(21.5f, 21.22f)
                lineTo(20.23f, 22.5f)
                lineTo(18.23f, 20.5f)
                curveTo(18.09f, 20.6f, 17.94f, 20.68f, 17.79f, 20.75f)
                curveTo(16f, 21.57f, 13.88f, 19.87f, 11.89f, 19.87f)
                curveTo(9.9f, 19.87f, 7.76f, 21.64f, 6f, 20.75f)
                curveTo(5f, 20.26f, 4.31f, 18.96f, 4.44f, 17.88f)
                curveTo(4.62f, 16.39f, 6.41f, 15.59f, 7.47f, 14.5f)
                curveTo(8.21f, 13.77f, 8.84f, 12.69f, 9.55f, 11.82f)
                lineTo(2f, 4.27f)
                moveTo(8.35f, 3f)
                curveTo(9.53f, 2.83f, 10.78f, 4.12f, 11.14f, 5.9f)
                curveTo(11.32f, 6.75f, 11.26f, 7.56f, 11f, 8.19f)
                lineTo(7.03f, 4.2f)
                curveTo(7.29f, 3.55f, 7.75f, 3.1f, 8.35f, 3f)
                moveTo(15.5f, 3f)
                curveTo(16.69f, 3.19f, 17.35f, 4.77f, 17f, 6.54f)
                curveTo(16.62f, 8.32f, 15.37f, 9.61f, 14.19f, 9.43f)
                curveTo(13f, 9.25f, 12.35f, 7.67f, 12.72f, 5.9f)
                curveTo(13.08f, 4.12f, 14.33f, 2.83f, 15.5f, 3f)
                moveTo(3f, 7.6f)
                curveTo(4.14f, 7.11f, 5.69f, 8f, 6.5f, 9.55f)
                curveTo(7.26f, 11.13f, 7f, 12.79f, 5.87f, 13.28f)
                curveTo(4.74f, 13.77f, 3.2f, 12.89f, 2.41f, 11.32f)
                curveTo(1.62f, 9.75f, 1.9f, 8.08f, 3f, 7.6f)
                moveTo(21f, 7.6f)
                curveTo(22.1f, 8.08f, 22.38f, 9.75f, 21.59f, 11.32f)
                curveTo(20.8f, 12.89f, 19.26f, 13.77f, 18.13f, 13.28f)
                curveTo(17f, 12.79f, 16.74f, 11.13f, 17.5f, 9.55f)
                curveTo(18.31f, 8f, 19.86f, 7.11f, 21f, 7.6f)
                close()
            }
        }.build()

        return _PawOff!!
    }

@Suppress("ObjectPropertyName")
private var _PawOff: ImageVector? = null
