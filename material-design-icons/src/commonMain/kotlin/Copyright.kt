package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.08f, 10.86f)
                curveTo(10.13f, 10.53f, 10.24f, 10.24f, 10.38f, 10f)
                curveTo(10.68f, 9.44f, 11.19f, 9.15f, 11.88f, 9.14f)
                curveTo(12.33f, 9.14f, 12.74f, 9.34f, 13.03f, 9.63f)
                curveTo(13.31f, 9.94f, 13.5f, 10.37f, 13.5f, 10.8f)
                horizontalLineTo(15.3f)
                curveTo(15.28f, 10.33f, 15.19f, 9.9f, 15f, 9.5f)
                curveTo(14.85f, 9.12f, 14.62f, 8.78f, 14.32f, 8.5f)
                curveTo(12.87f, 7.16f, 10.18f, 7.35f, 8.95f, 8.87f)
                curveTo(7.66f, 10.54f, 7.63f, 13.46f, 8.94f, 15.13f)
                curveTo(10.15f, 16.62f, 12.8f, 16.83f, 14.24f, 15.5f)
                curveTo(14.55f, 15.25f, 14.8f, 14.94f, 15f, 14.58f)
                curveTo(15.16f, 14.22f, 15.27f, 13.84f, 15.28f, 13.43f)
                horizontalLineTo(13.5f)
                curveTo(13.5f, 13.64f, 13.43f, 13.83f, 13.34f, 14f)
                curveTo(13.25f, 14.19f, 13.13f, 14.34f, 13f, 14.47f)
                curveTo(12.67f, 14.73f, 12.28f, 14.87f, 11.86f, 14.87f)
                curveTo(11.5f, 14.86f, 11.2f, 14.79f, 10.97f, 14.64f)
                curveTo(10.72f, 14.5f, 10.5f, 14.27f, 10.38f, 14f)
                curveTo(9.88f, 13.1f, 9.96f, 11.85f, 10.08f, 10.86f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2.53f, 25.27f, 21.5f, 25.26f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                curveTo(4.44f, 1.39f, 19.56f, 1.39f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
