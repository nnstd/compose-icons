package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RayEndArrow: ImageVector
    get() {
        if (_RayEndArrow != null) {
            return _RayEndArrow!!
        }
        _RayEndArrow = ImageVector.Builder(
            name = "RayEndArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                lineTo(5f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(17.17f)
                curveTo(17.58f, 14.17f, 18.69f, 15f, 20f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
                curveTo(18.69f, 9f, 17.58f, 9.83f, 17.17f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                lineTo(1f, 12f)
                close()
            }
        }.build()

        return _RayEndArrow!!
    }

@Suppress("ObjectPropertyName")
private var _RayEndArrow: ImageVector? = null
