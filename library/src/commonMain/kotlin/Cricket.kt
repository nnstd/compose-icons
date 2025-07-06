package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cricket: ImageVector
    get() {
        if (_Cricket != null) {
            return _Cricket!!
        }
        _Cricket = ImageVector.Builder(
            name = "Cricket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.34f, 17.77f)
                lineTo(15.75f, 16.36f)
                lineTo(20f, 20.58f)
                lineTo(18.56f, 22f)
                lineTo(14.34f, 17.77f)
                moveTo(18.5f, 2f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 2f)
                moveTo(2.24f, 7.11f)
                lineTo(5.07f, 4.28f)
                curveTo(5.46f, 3.89f, 6.09f, 3.89f, 6.5f, 4.28f)
                lineTo(14.97f, 12.77f)
                curveTo(15.36f, 13.16f, 15.36f, 13.79f, 14.97f, 14.18f)
                lineTo(12.14f, 17f)
                curveTo(11.75f, 17.4f, 11.12f, 17.4f, 10.72f, 17f)
                lineTo(2.24f, 8.53f)
                curveTo(1.85f, 8.13f, 1.85f, 7.5f, 2.24f, 7.11f)
                close()
            }
        }.build()

        return _Cricket!!
    }

@Suppress("ObjectPropertyName")
private var _Cricket: ImageVector? = null
