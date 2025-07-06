package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Parking: ImageVector
    get() {
        if (_Parking != null) {
            return _Parking!!
        }
        _Parking = ImageVector.Builder(
            name = "Parking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.2f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(13.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.2f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.2f, 11f)
                moveTo(13f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                curveTo(19f, 5.68f, 16.31f, 3f, 13f, 3f)
                close()
            }
        }.build()

        return _Parking!!
    }

@Suppress("ObjectPropertyName")
private var _Parking: ImageVector? = null
