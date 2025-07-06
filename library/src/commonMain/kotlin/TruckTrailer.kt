package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckTrailer: ImageVector
    get() {
        if (_TruckTrailer != null) {
            return _TruckTrailer!!
        }
        _TruckTrailer = ImageVector.Builder(
            name = "TruckTrailer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 17f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 6f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                moveTo(7f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
                close()
            }
        }.build()

        return _TruckTrailer!!
    }

@Suppress("ObjectPropertyName")
private var _TruckTrailer: ImageVector? = null
