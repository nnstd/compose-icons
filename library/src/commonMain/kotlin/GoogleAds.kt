package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleAds: ImageVector
    get() {
        if (_GoogleAds != null) {
            return _GoogleAds!!
        }
        _GoogleAds = ImageVector.Builder(
            name = "GoogleAds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.25f, 1.47f)
                curveTo(11.55f, 1.42f, 10.82f, 1.58f, 10.17f, 1.96f)
                curveTo(8.41f, 2.97f, 7.81f, 5.21f, 8.82f, 6.96f)
                lineTo(16.16f, 19.66f)
                curveTo(17.17f, 21.42f, 19.41f, 22f, 21.17f, 21f)
                curveTo(22.92f, 20f, 23.5f, 17.75f, 22.5f, 16f)
                lineTo(15.18f, 3.3f)
                curveTo(14.54f, 2.2f, 13.43f, 1.56f, 12.25f, 1.47f)
                moveTo(6.82f, 6.76f)
                lineTo(1.5f, 16f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 17.83f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.67f, 21.5f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.84f, 19.66f)
                verticalLineTo(19.67f)
                lineTo(11f, 14.19f)
                curveTo(9.65f, 11.89f, 8.27f, 9.6f, 7.03f, 7.23f)
                curveTo(6.95f, 7.08f, 6.88f, 6.92f, 6.83f, 6.76f)
                close()
                lineTo(16.4f, 5f)
                close()
            }
        }.build()

        return _GoogleAds!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleAds: ImageVector? = null
