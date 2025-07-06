package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiameterVariant: ImageVector
    get() {
        if (_DiameterVariant != null) {
            return _DiameterVariant!!
        }
        _DiameterVariant = ImageVector.Builder(
            name = "DiameterVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.15f, 21.46f)
                lineTo(5.47f, 19.58f)
                curveTo(3.35f, 17.74f, 2f, 15.03f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveTo(13.78f, 2f, 15.44f, 2.46f, 16.89f, 3.27f)
                lineTo(18.21f, 1.39f)
                lineTo(19.85f, 2.54f)
                lineTo(18.53f, 4.42f)
                curveTo(20.65f, 6.26f, 22f, 8.97f, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(10.22f, 22f, 8.56f, 21.54f, 7.11f, 20.73f)
                lineTo(5.79f, 22.61f)
                lineTo(4.15f, 21.46f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 14.35f, 5f, 16.46f, 6.63f, 17.93f)
                lineTo(15.73f, 4.92f)
                curveTo(14.62f, 4.33f, 13.35f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20f, 9.65f, 19f, 7.54f, 17.37f, 6.07f)
                lineTo(8.27f, 19.08f)
                curveTo(9.38f, 19.67f, 10.65f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _DiameterVariant!!
    }

@Suppress("ObjectPropertyName")
private var _DiameterVariant: ImageVector? = null
