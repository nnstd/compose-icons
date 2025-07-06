package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartOutline: ImageVector
    get() {
        if (_CartOutline != null) {
            return _CartOutline!!
        }
        _CartOutline = ImageVector.Builder(
            name = "CartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                curveTo(15.89f, 22f, 15f, 21.1f, 15f, 20f)
                curveTo(15f, 18.89f, 15.89f, 18f, 17f, 18f)
                moveTo(1f, 2f)
                horizontalLineTo(4.27f)
                lineTo(5.21f, 4f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                curveTo(21f, 5.17f, 20.95f, 5.34f, 20.88f, 5.5f)
                lineTo(17.3f, 11.97f)
                curveTo(16.96f, 12.58f, 16.3f, 13f, 15.55f, 13f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.63f)
                lineTo(7.17f, 14.75f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.42f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.89f, 17f, 5f, 16.1f, 5f, 15f)
                curveTo(5f, 14.65f, 5.09f, 14.32f, 5.24f, 14.04f)
                lineTo(6.6f, 11.59f)
                lineTo(3f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                moveTo(7f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 22f)
                curveTo(5.89f, 22f, 5f, 21.1f, 5f, 20f)
                curveTo(5f, 18.89f, 5.89f, 18f, 7f, 18f)
                moveTo(16f, 11f)
                lineTo(18.78f, 6f)
                horizontalLineTo(6.14f)
                lineTo(8.5f, 11f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _CartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CartOutline: ImageVector? = null
