package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HospitalBox: ImageVector
    get() {
        if (_HospitalBox != null) {
            return _HospitalBox!!
        }
        _HospitalBox = ImageVector.Builder(
            name = "HospitalBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _HospitalBox!!
    }

@Suppress("ObjectPropertyName")
private var _HospitalBox: ImageVector? = null
