package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fish: ImageVector
    get() {
        if (_Fish != null) {
            return _Fish!!
        }
        _Fish = ImageVector.Builder(
            name = "Fish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                lineTo(12.76f, 17f)
                curveTo(9.5f, 16.79f, 6.59f, 15.4f, 5.75f, 13.58f)
                curveTo(5.66f, 14.06f, 5.53f, 14.5f, 5.33f, 14.83f)
                curveTo(4.67f, 16f, 3.33f, 16f, 2f, 16f)
                curveTo(3.1f, 16f, 3.5f, 14.43f, 3.5f, 12.5f)
                curveTo(3.5f, 10.57f, 3.1f, 9f, 2f, 9f)
                curveTo(3.33f, 9f, 4.67f, 9f, 5.33f, 10.17f)
                curveTo(5.53f, 10.5f, 5.66f, 10.94f, 5.75f, 11.42f)
                curveTo(6.4f, 10f, 8.32f, 8.85f, 10.66f, 8.32f)
                lineTo(9f, 5f)
                curveTo(11f, 5f, 13f, 5f, 14.33f, 5.67f)
                curveTo(15.46f, 6.23f, 16.11f, 7.27f, 16.69f, 8.38f)
                curveTo(19.61f, 9.08f, 22f, 10.66f, 22f, 12.5f)
                curveTo(22f, 14.38f, 19.5f, 16f, 16.5f, 16.66f)
                curveTo(15.67f, 17.76f, 14.86f, 18.78f, 14.17f, 19.33f)
                curveTo(13.33f, 20f, 12.67f, 20f, 12f, 20f)
                moveTo(17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 11f)
                close()
            }
        }.build()

        return _Fish!!
    }

@Suppress("ObjectPropertyName")
private var _Fish: ImageVector? = null
