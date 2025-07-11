package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaWideAngleOutline: ImageVector
    get() {
        if (_PanoramaWideAngleOutline != null) {
            return _PanoramaWideAngleOutline!!
        }
        _PanoramaWideAngleOutline = ImageVector.Builder(
            name = "PanoramaWideAngleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(9.27f, 4f, 6.78f, 4.24f, 4.05f, 4.72f)
                lineTo(3.12f, 4.88f)
                lineTo(2.87f, 5.78f)
                curveTo(2.29f, 7.85f, 2f, 9.93f, 2f, 12f)
                curveTo(2f, 14.07f, 2.29f, 16.15f, 2.87f, 18.22f)
                lineTo(3.12f, 19.11f)
                lineTo(4.05f, 19.27f)
                curveTo(6.78f, 19.76f, 9.27f, 20f, 12f, 20f)
                curveTo(14.73f, 20f, 17.22f, 19.76f, 19.95f, 19.28f)
                lineTo(20.88f, 19.12f)
                lineTo(21.13f, 18.23f)
                curveTo(21.71f, 16.15f, 22f, 14.07f, 22f, 12f)
                curveTo(22f, 9.93f, 21.71f, 7.85f, 21.13f, 5.78f)
                lineTo(20.88f, 4.89f)
                lineTo(19.95f, 4.73f)
                curveTo(17.22f, 4.24f, 14.73f, 4f, 12f, 4f)
                moveTo(12f, 6f)
                curveTo(14.45f, 6f, 16.71f, 6.2f, 19.29f, 6.64f)
                curveTo(19.76f, 8.42f, 20f, 10.22f, 20f, 12f)
                curveTo(20f, 13.78f, 19.76f, 15.58f, 19.29f, 17.36f)
                curveTo(16.71f, 17.8f, 14.45f, 18f, 12f, 18f)
                curveTo(9.55f, 18f, 7.29f, 17.8f, 4.71f, 17.36f)
                curveTo(4.24f, 15.58f, 4f, 13.78f, 4f, 12f)
                curveTo(4f, 10.22f, 4.24f, 8.42f, 4.71f, 6.64f)
                curveTo(7.29f, 6.2f, 9.55f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _PanoramaWideAngleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaWideAngleOutline: ImageVector? = null
