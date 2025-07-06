package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ninja: ImageVector
    get() {
        if (_Ninja != null) {
            return _Ninja!!
        }
        _Ninja = ImageVector.Builder(
            name = "Ninja",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.75f, 13f)
                curveTo(7.74f, 12.65f, 7.9f, 12.31f, 8.17f, 12.08f)
                curveTo(8.92f, 12.24f, 9.62f, 12.55f, 10.25f, 13f)
                curveTo(10.25f, 13.68f, 9.69f, 14.24f, 9f, 14.24f)
                curveTo(8.31f, 14.24f, 7.76f, 13.69f, 7.75f, 13f)
                moveTo(13.75f, 13f)
                curveTo(14.38f, 12.56f, 15.08f, 12.25f, 15.83f, 12.09f)
                curveTo(16.1f, 12.32f, 16.26f, 12.66f, 16.25f, 13f)
                curveTo(16.25f, 13.7f, 15.69f, 14.26f, 15f, 14.26f)
                curveTo(14.31f, 14.26f, 13.75f, 13.7f, 13.75f, 13f)
                verticalLineTo(13f)
                moveTo(12f, 9f)
                curveTo(9.23f, 8.96f, 6.5f, 9.65f, 4.07f, 11f)
                lineTo(4f, 12f)
                curveTo(4f, 13.23f, 4.29f, 14.44f, 4.84f, 15.54f)
                curveTo(7.21f, 15.18f, 9.6f, 15f, 12f, 15f)
                curveTo(14.4f, 15f, 16.79f, 15.18f, 19.16f, 15.54f)
                curveTo(19.71f, 14.44f, 20f, 13.23f, 20f, 12f)
                lineTo(19.93f, 11f)
                curveTo(17.5f, 9.65f, 14.77f, 8.96f, 12f, 9f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _Ninja!!
    }

@Suppress("ObjectPropertyName")
private var _Ninja: ImageVector? = null
