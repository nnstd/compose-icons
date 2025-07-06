package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BabyBottle: ImageVector
    get() {
        if (_BabyBottle != null) {
            return _BabyBottle!!
        }
        _BabyBottle = ImageVector.Builder(
            name = "BabyBottle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.28f, 2.8f)
                lineTo(10.78f, 3.3f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.41f, 2.87f)
                lineTo(6.33f, 2.8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 6.33f)
                lineTo(2.87f, 6.41f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.3f, 10.78f)
                lineTo(2.8f, 11.28f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 13.4f)
                lineTo(4.21f, 14.82f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.33f, 14.82f)
                lineTo(6.68f, 14.46f)
                lineTo(13.76f, 21.53f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.88f, 21.53f)
                lineTo(21.53f, 15.88f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.53f, 13.76f)
                lineTo(14.46f, 6.68f)
                lineTo(14.82f, 6.33f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.82f, 4.21f)
                lineTo(13.4f, 2.8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.28f, 2.8f)
                moveTo(13.76f, 5.27f)
                lineTo(5.27f, 13.76f)
                lineTo(3.86f, 12.34f)
                lineTo(12.34f, 3.86f)
                moveTo(14.82f, 11.63f)
                lineTo(11.63f, 14.82f)
                lineTo(10.57f, 13.76f)
                lineTo(13.76f, 10.57f)
                moveTo(16.94f, 13.76f)
                lineTo(13.76f, 16.94f)
                lineTo(12.69f, 15.88f)
                lineTo(15.88f, 12.69f)
                close()
            }
        }.build()

        return _BabyBottle!!
    }

@Suppress("ObjectPropertyName")
private var _BabyBottle: ImageVector? = null
