package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarCircle: ImageVector
    get() {
        if (_StarCircle != null) {
            return _StarCircle!!
        }
        _StarCircle = ImageVector.Builder(
            name = "StarCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.23f, 18f)
                lineTo(12f, 15.45f)
                lineTo(7.77f, 18f)
                lineTo(8.89f, 13.19f)
                lineTo(5.16f, 9.96f)
                lineTo(10.08f, 9.54f)
                lineTo(12f, 5f)
                lineTo(13.92f, 9.53f)
                lineTo(18.84f, 9.95f)
                lineTo(15.11f, 13.18f)
                lineTo(16.23f, 18f)
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _StarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StarCircle: ImageVector? = null
