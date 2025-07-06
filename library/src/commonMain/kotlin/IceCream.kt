package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IceCream: ImageVector
    get() {
        if (_IceCream != null) {
            return _IceCream!!
        }
        _IceCream = ImageVector.Builder(
            name = "IceCream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 6.05f)
                curveTo(17.25f, 3.22f, 14.89f, 1f, 12f, 1f)
                reflectiveCurveTo(6.75f, 3.22f, 6.5f, 6.05f)
                curveTo(5.09f, 6.28f, 4f, 7.5f, 4f, 9f)
                curveTo(4f, 10.66f, 5.34f, 12f, 7f, 12f)
                lineTo(12f, 22f)
                lineTo(17f, 12f)
                curveTo(18.66f, 12f, 20f, 10.66f, 20f, 9f)
                curveTo(20f, 7.5f, 18.91f, 6.28f, 17.5f, 6.05f)
                moveTo(12f, 17.53f)
                lineTo(8.89f, 11.31f)
                curveTo(8.95f, 11.26f, 9f, 11.21f, 9.08f, 11.16f)
                curveTo(9.93f, 11.69f, 10.93f, 12f, 12f, 12f)
                reflectiveCurveTo(14.07f, 11.69f, 14.92f, 11.16f)
                curveTo(15f, 11.21f, 15.05f, 11.26f, 15.11f, 11.31f)
                lineTo(12f, 17.53f)
                close()
            }
        }.build()

        return _IceCream!!
    }

@Suppress("ObjectPropertyName")
private var _IceCream: ImageVector? = null
