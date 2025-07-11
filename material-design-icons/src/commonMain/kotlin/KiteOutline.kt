package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KiteOutline: ImageVector
    get() {
        if (_KiteOutline != null) {
            return _KiteOutline!!
        }
        _KiteOutline = ImageVector.Builder(
            name = "KiteOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 5.1f)
                lineTo(17.95f, 10.38f)
                lineTo(12.5f, 17.88f)
                lineTo(7.07f, 10.38f)
                lineTo(12.5f, 5.1f)
                moveTo(12.5f, 3f)
                curveTo(12.05f, 3f, 11.66f, 3.15f, 11.33f, 3.46f)
                lineTo(5.54f, 9.08f)
                curveTo(5.23f, 9.38f, 5.06f, 9.75f, 5f, 10.2f)
                curveTo(5f, 10.64f, 5.08f, 11.04f, 5.33f, 11.4f)
                lineTo(11.45f, 19.83f)
                curveTo(11.2f, 20.36f, 10.75f, 20.62f, 10.09f, 20.62f)
                curveTo(9.29f, 20.62f, 8.79f, 20.25f, 8.6f, 19.5f)
                curveTo(8.4f, 18.84f, 8f, 18.27f, 7.38f, 17.8f)
                curveTo(6.76f, 17.34f, 6.1f, 17.1f, 5.41f, 17.1f)
                curveTo(4.36f, 17.1f, 3.5f, 17.5f, 2.85f, 18.3f)
                lineTo(4.21f, 19.42f)
                curveTo(4.5f, 19.03f, 4.92f, 18.84f, 5.41f, 18.84f)
                curveTo(6.21f, 18.84f, 6.71f, 19.21f, 6.9f, 19.95f)
                curveTo(7.09f, 20.62f, 7.5f, 21.19f, 8.12f, 21.67f)
                reflectiveCurveTo(9.4f, 22.4f, 10.09f, 22.4f)
                curveTo(11.33f, 22.4f, 12.28f, 21.83f, 12.94f, 20.7f)
                lineTo(19.68f, 11.4f)
                curveTo(19.93f, 11.04f, 20.03f, 10.64f, 20f, 10.2f)
                curveTo(19.95f, 9.76f, 19.77f, 9.38f, 19.47f, 9.08f)
                lineTo(13.68f, 3.46f)
                curveTo(13.35f, 3.15f, 12.96f, 3f, 12.5f, 3f)
                close()
            }
        }.build()

        return _KiteOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KiteOutline: ImageVector? = null
