package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) {
            return _Lifebuoy!!
        }
        _Lifebuoy = ImageVector.Builder(
            name = "Lifebuoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.79f, 15.41f)
                curveTo(20.74f, 13.24f, 20.74f, 10.75f, 19.79f, 8.59f)
                lineTo(17.05f, 9.83f)
                curveTo(17.65f, 11.21f, 17.65f, 12.78f, 17.06f, 14.17f)
                lineTo(19.79f, 15.41f)
                moveTo(15.42f, 4.21f)
                curveTo(13.25f, 3.26f, 10.76f, 3.26f, 8.59f, 4.21f)
                lineTo(9.83f, 6.94f)
                curveTo(11.22f, 6.35f, 12.79f, 6.35f, 14.18f, 6.95f)
                lineTo(15.42f, 4.21f)
                moveTo(4.21f, 8.58f)
                curveTo(3.26f, 10.76f, 3.26f, 13.24f, 4.21f, 15.42f)
                lineTo(6.95f, 14.17f)
                curveTo(6.35f, 12.79f, 6.35f, 11.21f, 6.95f, 9.82f)
                lineTo(4.21f, 8.58f)
                moveTo(8.59f, 19.79f)
                curveTo(10.76f, 20.74f, 13.25f, 20.74f, 15.42f, 19.78f)
                lineTo(14.18f, 17.05f)
                curveTo(12.8f, 17.65f, 11.22f, 17.65f, 9.84f, 17.06f)
                lineTo(8.59f, 19.79f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
            }
        }.build()

        return _Lifebuoy!!
    }

@Suppress("ObjectPropertyName")
private var _Lifebuoy: ImageVector? = null
