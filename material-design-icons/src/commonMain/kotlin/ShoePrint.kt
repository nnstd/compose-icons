package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoePrint: ImageVector
    get() {
        if (_ShoePrint != null) {
            return _ShoePrint!!
        }
        _ShoePrint = ImageVector.Builder(
            name = "ShoePrint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.74f, 11.72f)
                curveTo(11.21f, 12.95f, 11.16f, 14.23f, 9.75f, 14.74f)
                curveTo(6.85f, 15.81f, 6.2f, 13f, 6.16f, 12.86f)
                lineTo(10.74f, 11.72f)
                moveTo(5.71f, 10.91f)
                lineTo(10.03f, 9.84f)
                curveTo(9.84f, 8.79f, 10.13f, 7.74f, 10.13f, 6.5f)
                curveTo(10.13f, 4.82f, 8.8f, 1.53f, 6.68f, 2.06f)
                curveTo(4.26f, 2.66f, 3.91f, 5.35f, 4f, 6.65f)
                curveTo(4.12f, 7.95f, 5.64f, 10.73f, 5.71f, 10.91f)
                moveTo(17.85f, 19.85f)
                curveTo(17.82f, 20f, 17.16f, 22.8f, 14.26f, 21.74f)
                curveTo(12.86f, 21.22f, 12.8f, 19.94f, 13.27f, 18.71f)
                lineTo(17.85f, 19.85f)
                moveTo(20f, 13.65f)
                curveTo(20.1f, 12.35f, 19.76f, 9.65f, 17.33f, 9.05f)
                curveTo(15.22f, 8.5f, 13.89f, 11.81f, 13.89f, 13.5f)
                curveTo(13.89f, 14.73f, 14.17f, 15.78f, 14f, 16.83f)
                lineTo(18.3f, 17.9f)
                curveTo(18.38f, 17.72f, 19.89f, 14.94f, 20f, 13.65f)
                close()
            }
        }.build()

        return _ShoePrint!!
    }

@Suppress("ObjectPropertyName")
private var _ShoePrint: ImageVector? = null
