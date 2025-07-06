package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AbjadArabic: ImageVector
    get() {
        if (_AbjadArabic != null) {
            return _AbjadArabic!!
        }
        _AbjadArabic = ImageVector.Builder(
            name = "AbjadArabic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(10.08f, 4f, 8.5f, 5.58f, 8.5f, 7.5f)
                curveTo(8.5f, 8.43f, 8.88f, 9.28f, 9.5f, 9.91f)
                curveTo(7.97f, 10.91f, 7f, 12.62f, 7f, 14.5f)
                curveTo(7f, 17.53f, 9.47f, 20f, 12.5f, 20f)
                curveTo(14.26f, 20f, 16f, 19.54f, 17.5f, 18.66f)
                lineTo(16.5f, 16.93f)
                curveTo(15.28f, 17.63f, 13.9f, 18f, 12.5f, 18f)
                curveTo(10.56f, 18f, 9f, 16.45f, 9f, 14.5f)
                curveTo(9f, 12.91f, 10.06f, 11.53f, 11.59f, 11.12f)
                lineTo(16.8f, 9.72f)
                lineTo(16.28f, 7.79f)
                lineTo(11.83f, 9f)
                curveTo(11.08f, 8.9f, 10.5f, 8.28f, 10.5f, 7.5f)
                curveTo(10.5f, 6.66f, 11.16f, 6f, 12f, 6f)
                curveTo(12.26f, 6f, 12.5f, 6.07f, 12.75f, 6.2f)
                lineTo(13.75f, 4.47f)
                curveTo(13.22f, 4.16f, 12.61f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _AbjadArabic!!
    }

@Suppress("ObjectPropertyName")
private var _AbjadArabic: ImageVector? = null
