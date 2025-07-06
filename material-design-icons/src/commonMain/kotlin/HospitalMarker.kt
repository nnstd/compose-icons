package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HospitalMarker: ImageVector
    get() {
        if (_HospitalMarker != null) {
            return _HospitalMarker!!
        }
        _HospitalMarker = ImageVector.Builder(
            name = "HospitalMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(15.86f, 2f, 19f, 5.13f, 19f, 9f)
                curveTo(19f, 14.25f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 5f, 14.25f, 5f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(9f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _HospitalMarker!!
    }

@Suppress("ObjectPropertyName")
private var _HospitalMarker: ImageVector? = null
