package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VanPassenger: ImageVector
    get() {
        if (_VanPassenger != null) {
            return _VanPassenger!!
        }
        _VanPassenger = ImageVector.Builder(
            name = "VanPassenger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                curveTo(1.89f, 7f, 1f, 7.89f, 1f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                curveTo(23f, 11.89f, 22.11f, 11f, 21f, 11f)
                lineTo(18f, 7f)
                horizontalLineTo(3f)
                moveTo(3f, 8.5f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(8.5f)
                moveTo(9f, 8.5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(8.5f)
                moveTo(15f, 8.5f)
                horizontalLineTo(17.5f)
                lineTo(19.46f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(8.5f)
                moveTo(6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
                moveTo(18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                close()
            }
        }.build()

        return _VanPassenger!!
    }

@Suppress("ObjectPropertyName")
private var _VanPassenger: ImageVector? = null
